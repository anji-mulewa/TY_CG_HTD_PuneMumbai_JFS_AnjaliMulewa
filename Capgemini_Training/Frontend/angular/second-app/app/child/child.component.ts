import { Component, OnInit, Input, Output , EventEmitter } from '@angular/core';


@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
  childData='This is data from child';
  @Output() childEvent=new EventEmitter();
  @Input() dataFromParent;
  constructor() { }

  ngOnInit() {
    this.childEvent.emit(this.childData);
  }

}
