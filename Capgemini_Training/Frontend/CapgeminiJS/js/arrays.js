// var x =[1,'Abcd',true,{name:'Vicky kaushal'}];
// console.log(x);
// console.log(x[0]);
// for(var i=0;i<x.length;i++){
//     console.log(x[i]);
// }
var colors=['yellow','red','green','voilet'];
console.log('original array ',colors);
colors.push('purple','orange');
console.log('push adds to last index',colors);
colors.pop();
console.log('pop deletion from last index',colors);
colors.unshift('black','blue');
console.log('unshift addition to starting index',colors);
colors.shift();
console.log('shift deletion from starting index',colors);
colors.splice(2,2);
console.log('splice deletion',colors);
colors.splice(1,2,'indigo');
console.log('splice deletion and addition',colors);

colors.forEach(function (value, index , array){
    console.log(value,index,array);
});

var nums=[1,2,3,4,5,6,1,2,2,2,4,5,5,7,3,3,6];

var newArray =nums.filter(function(value){
    return value > 3;
});
console.log(newArray);

var filteredArray = nums.filter(function(value,index,array){
return array.indexOf(value)===index;
});
console.log(filteredArray);

for(var x of colors){
    console.log(x);
}

console.log(colors.reverse());
for(var i in colors){
    console.log('the value is ',colors[i]+ ' and index is '+i);
}

var movie={
    name:'Uri',
    actor:'vicky kaushal',
    actress:'Yami'    
};
console.log(movie['name']);

for(var k in movie){
    console.log(k+" : "+movie[k]);
}

// if(123=='123'){
//     console.log('true');
// }else {
//     console.log('false');
// }

// if(123==='123'){
//     console.log('true');
// }else {
//     console.log('false');
// }


// setTimeout(function(){
//     console.log('10 seconds done');
// },10000);
// // var i=1;
// // setInterval(function(){
// //     console.log(i);
// //     i++;
// // },1);

// function test(cb){
//     console.log('test function started');
//     cb();
//     console.log('test function ended');
// }

// test(function(){
// console.log('callback function is executed');
// });
