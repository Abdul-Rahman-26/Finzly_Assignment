//Array
let arr:string[]=[];

//push
arr.push("Ab","ba","ca");
console.log(arr);

//pop
arr.pop();
console.log(arr);

//Traverse
let i =0;
arr.forEach(element => {
    arr[i]=element+i;
    i++;

});
console.log(arr);

//sort
arr.push("112","man");
console.log(arr.sort());

//splice - replace
arr.splice(1,1,"AB");
console.log(arr);

//splice - add and delete
arr.splice(2,2,"BA");
console.log(arr);

//optional function
function add(a?:number,b?:number):number{
    return a!+b!;
}
console.log(add(1));
console.log(add(2,3));

// spread operator
let arr1:number[] =[1,2,3];
let arr2:number[] = [...arr1];
console.log(arr2);

//join
for(let i=0;i<arr2.length;i++){
    console.log(arr2[i]);
}
console.log(arr.join("\n"));

//slice
console.log("sliced in arr1 "+arr1.slice(1,3));
console.log("The arr1 "+arr1);

//Rest function
function sum(...num):number {
    let total = 0;
    for (let i = 0; i < arr1.length; i++) {
        total += arr1[i];
    }
    return total;
}
console.log(sum(arr1)); 

//map
let arr3 = arr1.map(value =>
    value%2);
console.log(arr3);