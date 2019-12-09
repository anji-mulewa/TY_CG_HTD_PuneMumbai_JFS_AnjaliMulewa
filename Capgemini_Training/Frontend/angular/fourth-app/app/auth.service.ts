import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { LoginResponse } from './login-response';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  isLoggedIn(): boolean {
    const user: LoginResponse = JSON.parse(localStorage.getItem('token'));
    if (user && user.registered) {
      return true;
    } else {
      return false;
    }
  }

  constructor(private http: HttpClient) { }

  register(data) {
    return this.http.post('https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=AIzaSyBexCPTXlNcc-0m7XaD34oC09nY8rUhrGg',
      { ...data, returnSecureToken: true }
    );
  }

  login(data): Observable <LoginResponse> {
  return this.http.post<LoginResponse>(`https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?
  key=AIzaSyBexCPTXlNcc-0m7XaD34oC09nY8rUhrGg`,
      { ...data, returnSecureToken: true }
    );
  }
}
