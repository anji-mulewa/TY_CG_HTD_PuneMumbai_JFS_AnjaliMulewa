//fatarrow function
let add=(a,b)=>{
    console.log(a+b);
};
add(10,20);

//fatarrow function with one argument
let printAge=age=> console.log('age is '+age);
printAge(23);

//fat arrow function with only return statement
let product=(a,b)=>a*b;
console.log(product(12,4));