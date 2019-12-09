import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, NgForm } from '@angular/forms';
import { CustomValidators } from './custom.validator';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  get email() {
    return this.registerForm.get('email');
  }

  get password() {
    return this.registerForm.get('password');
  }

  constructor() { }
  registerForm = new FormGroup({
    email: new FormControl('', [Validators.required,
    Validators.email,
    Validators.minLength(8), CustomValidators.noSpace]),
    password: new FormControl('', [Validators.required,
    Validators.minLength(8)])
  });

  printRegisterForm(registerForm: NgForm){
    console.log(registerForm);
    console.log(registerForm.value)
  }
  ngOnInit() {
    console.log('this is register and it is initialised');
  }

}
