import { Component, OnInit } from '@angular/core';
import { PostsService } from '../posts.service';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {
postArray = [];
  constructor(public postsService: PostsService) {
    this.postsService.getData();
  }

  deletePost(post) {
    this.postArray = post;
    console.log(this.postArray);
    // console.log(this.postArray.indexOf(0));
    // this.postArray.splice(0, 3);
  }

  ngOnInit() {
  }

}
