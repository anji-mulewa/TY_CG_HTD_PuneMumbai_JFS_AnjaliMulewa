let myName:String='anjali';
//myName=1234; //error=>we cannot change the datatype once declared

//will be considered as any implicitly
let company;
company=1234;
company='Capgemini';
company=true;

let age:number| string;
age=23;
age='Twenty-three';
//age=true; //error=>we can store only string or number as declared in line number 9

//tuple
let details:[string,number,number]=['abcd',12345,34567];

let mobiles:string[]|number=['qwerty','abcd','xyz'];
let array1=[123, 'qwerty',true];

function add(a:number, b:number):number{
    return a+b;
}