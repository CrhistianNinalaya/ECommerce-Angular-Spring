import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { RouterLink } from '@angular/router';
import { AuthService } from '../../../core/services/auth/auth.service';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [RouterLink,FormsModule],
  templateUrl: './login.component.html',
  styles: ``
})
export class LoginComponent {
  email: string;
  password: string;

  constructor(private authService: AuthService) { }
  
  // primero Debemos hacer que envie el formulario al backend
  login() {
    this.authService.login(this.email, this.password).subscribe(
      data => {
        if (data) {
          console.log('Usuario válido:', data);
          sessionStorage.setItem('currentUser', JSON.stringify(data));

          // redirigir a la página de inicio          

        } else {
          console.log('Usuario no válido o no encontrado');
        }
      },
      error => console.log('Error al iniciar sesión:', error)
    );
  }

  // luego debemos hacer que el backend nos devuelva un token
}
