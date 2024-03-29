import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private auth: AuthService) { }

  submitForm(registerForm: NgForm) {
    this.auth.register(registerForm.value).subscribe(response => {
      console.log(response);
      registerForm.reset();
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }

}
