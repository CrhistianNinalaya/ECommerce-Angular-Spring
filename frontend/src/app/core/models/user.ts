import { Gender } from "./gender";
import { typeUser } from "./typeUser";

export class User {
  codUser: number;
  names: string;
  lastName: string;
  numberTelephone: string;
  dateRegistration: string;
  email: string;
  password: string;
  genderId: Gender;
  typeUserId: typeUser;

  constructor(){}



  getCodUser(): number {
    return this.codUser;
  }

  setCodUser(codUser: number): void {
    this.codUser = codUser;
  }

  getNames(): string {
    return this.names;
  }

  setNames(names: string): void {
    this.names = names;
  }

  getLastName(): string {
    return this.lastName;
  }

  setLastName(lastName: string): void {
    this.lastName = lastName;
  }

  getNumberThelephone(): string {
    return this.numberTelephone;
  }

  setNumberThelephone(numberTelephone: string): void {
    this.numberTelephone = numberTelephone;
  }

  getDateRegistration(): string {
    return this.dateRegistration;
  }

  setDateRegistration(dateRegistration: string): void {
    this.dateRegistration = dateRegistration;
  }

  getEmail(): string {
    return this.email;
  }

  setEmail(email: string): void {
    this.email = email;
  }

  getPassword(): string {
    return this.password;
  }

  setPassword(password: string): void {
    this.password = password;
  }

  getGenderId(): Gender {
    return this.genderId;
  }

  setGenderId(genderId: Gender): void {
    this.genderId = genderId;
  }


  getTypeUserId(): typeUser {
    return this.typeUserId;
  }

  setTypeUserId(typeUserId: typeUser): void {
    this.typeUserId = typeUserId;
  }
}