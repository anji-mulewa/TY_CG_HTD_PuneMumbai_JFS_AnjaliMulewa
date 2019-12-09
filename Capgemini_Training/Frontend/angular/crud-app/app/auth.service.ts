import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  register(data) {
    return this.http.post(`https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=AIzaSyAI68oVio3qPbVbSCve9CDO6Wa72W9w5GU` , 
    {...data , returnSecureToken : true}
    );
  }

  login(data) {
  return this.http.post(`https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=AIzaSyAI68oVio3qPbVbSCve9CDO6Wa72W9w5GU`,
    {...data , returnSecureToken: true}
    );
  }
}
