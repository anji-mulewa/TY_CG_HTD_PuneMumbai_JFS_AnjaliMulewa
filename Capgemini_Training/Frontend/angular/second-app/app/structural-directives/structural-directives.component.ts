import { Component, OnInit } from '@angular/core';
import { Student } from '../student';

@Component({
  selector: 'app-structural-directives',
  templateUrl: './structural-directives.component.html',
  styleUrls: ['./structural-directives.component.css']
})
export class StructuralDirectivesComponent implements OnInit {
flag=false;
person='Anjali';  
  students : Student[]=[
    {
      id:11,
      name:'Anjali',
      age:23,
      degree:'BE'
    },
    {
      id:12,
      name:'Akash',
      age:23,
      degree:'BCom'
    },
    {
      id:13,
      name:'Smita',
      age:23,
      degree:'BE'
    },
    {
      id:14,
      name:'Chhavi',
      age:27,
      degree:'MCA'
    },
    {
      id:15,
      name:'Snehal',
      age:22,
      degree:'BTech'
    },
  ];
  constructor() { 
    setTimeout(() => { 
      this.flag=true;
    },2000);
  }
deleteStudent(student : Student){
  const index=this.students.indexOf(student);
  this.students.splice(index,1);
}
  ngOnInit() {
  }

}
