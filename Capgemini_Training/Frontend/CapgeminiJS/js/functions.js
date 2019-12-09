//anonymous function with expression
var x = function () {
    console.log('This is an anonymous function');
}
//calling a function
x();

//naming function
function add(a, b) {
    console.log(a + b);
}
//calling naming function
add(10, 20);

//immediately invoke function expression
(function (x, y) {
    console.log('IIFE is being executed', x * y);
})(10, 20);

//understanding return keyword
function division(a,b){
    return a/b;
}
console.log('Result of divison is:',division(1234,47));
