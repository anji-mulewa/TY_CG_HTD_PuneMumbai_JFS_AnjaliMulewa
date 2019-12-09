class Student{
    constructor(
        public name:string,
        public age:number,
        public marks:number,
        public degree ?:string,
        public id?:number
    ){
    }
    // printDetails(){
    //     console.log(`name is ${this.name} age is ${this.age} and marks are ${this.marks}`);
    // }
}
//object creation with new keyword
let student1 = new Student('Anjali',23,72);
console.log(student1);
//student1.printDetails();

//literal way of object creation
let student2:Student ={
    name:'Snehal',
    age:23,
    marks:85,
    degree:'BE',
    id:32
}
console.log(student2);

let students:Student[]=[
    student2,student1, new Student('Mayuri',24,78),
    {   
    name:'Sneha',
    age:23,
    marks:85,
    degree:'BE',
    id:32
}
]
console.log(students);

for(let student of students){
    console.log(student);
}