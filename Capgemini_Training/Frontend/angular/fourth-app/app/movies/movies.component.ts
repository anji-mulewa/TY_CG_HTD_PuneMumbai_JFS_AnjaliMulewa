import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  movies = [];
  constructor(private http: HttpClient) { }
  searchMovies(movie) {
    console.log(movie);
    this.http.get<any>(`http://www.omdbapi.com/?s=${movie.value}&apikey=5f34025b`).subscribe(data =>{
      this.movies = data.Search;
      console.log(this.movies);
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }

}
