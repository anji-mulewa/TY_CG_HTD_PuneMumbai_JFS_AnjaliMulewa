var Student = /** @class */ (function () {
    function Student(name, age, marks, degree, id) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.degree = degree;
        this.id = id;
    }
    return Student;
}());
//object creation with new keyword
var student1 = new Student('Anjali', 23, 72);
console.log(student1);
//student1.printDetails();
//literal way of object creation
var student2 = {
    name: 'Snehal',
    age: 23,
    marks: 85,
    degree: 'BE',
    id: 32
};
console.log(student2);
var students = [
    student2, student1, new Student('Mayuri', 24, 78),
    {
        name: 'Sneha',
        age: 23,
        marks: 85,
        degree: 'BE',
        id: 32
    }
];
console.log(students);
for (var _i = 0, students_1 = students; _i < students_1.length; _i++) {
    var student = students_1[_i];
    console.log(student);
}
