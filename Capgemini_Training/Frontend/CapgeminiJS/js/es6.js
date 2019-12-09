let person={
    name: 'vicky',
    age: 28
};

let student={
    ...person,
    id:1234,
    percentage: 68.46
};

console.log(student);

let mumbaiCRS=['Akash','Aishwarya'];
let bangloreCRS=['Mayuri','Pournima'];
let bhuvaneshwarCRS=['Sneha','Snehal'];
let CRS=[
    ...mumbaiCRS,
    ...bangloreCRS,
    ...bhuvaneshwarCRS,
    'anjali'
];
console.log(CRS);
let[name1,name2,name3,...restValues]=CRS;
console.log(name1);
console.log(name2);
console.log(name3);
console.log(restValues);

let{name,...remainingValues}=student;
console.log(name);
console.log(remainingValues);