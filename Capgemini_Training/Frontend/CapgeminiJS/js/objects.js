
var student = {
    name: 'Anjali',
    age: 23,
    degree: 'B.E.',
    phoneNumber: 1234567890
};

console.log(student.name);
console.log(student);
student.phoneNumber = 0987654321;

console.log(student.phoneNumber);

student.selectedCompany = 'Capgemini';
console.log(student);

//using object constructor
var laptop = new Object();
laptop.brand='HP';
laptop.ram='8GB';
laptop.processor='core i3';
laptop.price=45000;
console.log(laptop);

//to find length of an object
console.log(Object.keys(laptop).length);