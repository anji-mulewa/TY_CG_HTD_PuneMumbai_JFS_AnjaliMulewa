import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PostsService {

  constructor(private http: HttpClient) { }
  posts = [];

  getData() {
    this.http.get<any>(`https://jsonplaceholder.typicode.com/posts`).subscribe(data => {
      console.log(data);
      this.posts = data;
    });
  }

}
