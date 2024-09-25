import { Component, OnInit } from '@angular/core';
import { RouterLink } from '@angular/router';
import { User } from '../../../core/models/user';
import { FormsModule } from '@angular/forms';
import { Gender } from '../../../core/models/gender';
import { GenderService } from '../../../core/services/genderService/gender.service';
import { CommonModule } from '@angular/common';
import { UserService } from '../../../core/services/userService/user.service';
import { typeUser } from '../../../core/models/typeUser';

/**
 * This component represents the registration form for users.
 * It allows users to register by providing their personal information.
 * 
 * @remarks
 * The registration form includes fields for the user's name, email, password, and gender.
 * Upon submission, the user's information is saved and a success message is displayed.
 * 
 * @example
 * ```typescript
 * const registerComponent = new RegisterComponent();
 * registerComponent.onSubmit(); // Saves the user's information and displays a success message
 * ```
 */
@Component({
  selector: 'app-register',
  standalone: true,
  imports: [RouterLink, FormsModule, CommonModule],
  templateUrl: './register.component.html',
  /**
   * This style block hides the increment and decrement buttons for number inputs.
   */
  styles: 
  `
  input[type=number]::-webkit-inner-spin-button,
  input[type=number]::-webkit-outer-spin-button {
  -webkit-appearance: none;
  }`
})
export class RegisterComponent {
  genders: Gender[];
  constructor(private genderService: GenderService, private userService: UserService) { }

  ngOnInit(): void {
    this.getGenders();
  }
  user: User = new User();

  private getGenders() {
    this.genderService.fetchGenders().subscribe(data => {
      this.genders = data;
    })
  }

  genderId: number;
  guardarEmpleado() {
    let userToSave = this.user;
    const fechaAngular = new Date();

    const fechaFormateada = fechaAngular.toISOString();
    userToSave.setDateRegistration(fechaFormateada);

    const genderOfUser: Gender | undefined = this.genders.find((element) => element.codGender == this.genderId);
    if (genderOfUser) {
      userToSave.setGenderId(genderOfUser);
    }
    userToSave.setTypeUserId(new typeUser(2, 'Cliente'));
    // userToSave.setGenderId(new Gender(this.user.genderId.codGender,''));
    this.userService.registerUser(userToSave).subscribe(data => {
      console.log(this.user);
      console.log(genderOfUser);
      alert("Se registró correctamente");
    }, error => console.log('Mensaje', error, this.user));
  }

  onSubmit() {
    this.guardarEmpleado();
  }
}
