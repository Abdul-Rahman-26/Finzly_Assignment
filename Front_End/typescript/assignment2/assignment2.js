var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
//Array
var arr = [];
//push
arr.push("Ab", "ba", "ca");
console.log(arr);
//pop
arr.pop();
console.log(arr);
//Traverse
var i = 0;
arr.forEach(function (element) {
    arr[i] = element + i;
    i++;
});
console.log(arr);
//sort
arr.push("112", "man");
console.log(arr.sort());
//splice - replace
arr.splice(1, 1, "AB");
console.log(arr);
//splice - add and delete
arr.splice(2, 2, "BA");
console.log(arr);
//optional function
function add(a, b) {
    return a + b;
}
console.log(add(1));
console.log(add(2, 3));
// spread operator
var arr1 = [1, 2, 3];
var arr2 = __spreadArray([], arr1, true);
console.log(arr2);
//join
for (var i_1 = 0; i_1 < arr2.length; i_1++) {
    console.log(arr2[i_1]);
}
console.log(arr.join("\n"));
//slice
console.log("sliced in arr1 " + arr1.slice(1, 3));
console.log("The arr1 " + arr1);
//Rest function
function sum() {
    var num = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        num[_i] = arguments[_i];
    }
    var total = 0;
    for (var i_2 = 0; i_2 < arr1.length; i_2++) {
        total += arr1[i_2];
    }
    return total;
}
console.log(sum(arr1));
//map
var arr3 = arr1.map(function (value) {
    return value % 2;
});
console.log(arr3);
