//With parameter and with return type
var func1 = function add(a, b) {
    return (a + b);
};
console.log("With parameter and with return type " + func1(1, 0));
//Without parameter and with return type
var func2 = function add() {
    return (1 + 1);
};
console.log("Without parameter and with return type " + func2());
//With parameter and without return type
var func3 = function add(a, b) {
    console.log("With parameter and without return type " + (a + b));
};
func3(2, 1);
//Without parameter and without return type
var func4 = function add() {
    console.log("Without parameter and without return type ");
};
func4();
//Fact Arrow Function
//With parameter and with return type
var func5 = function (a, b) {
    return (a + b);
};
console.log("Fact Arrow With parameter and with return type " + func5(3, 2));
//Without parameter and with return type
var func6 = function () {
    return (5 + 1);
};
console.log("Fact Arrow Without parameter and with return type " + func6());
//With parameter and without return type
var func7 = function (a, b) {
    console.log("Fact Arrow With parameter and without return type " + (a + b));
};
func7(5, 2);
//Without parameter and without return type
var func8 = function () {
    console.log("Fact Arrow Without parameter and without return type ");
};
func8();
//Anonymous
//With parameter and with return type
var func9 = function (a, b) {
    return (a + b);
};
console.log("Anonymous With parameter and with return type " + func9(1, 0));
//Without parameter and with return type
var func10 = function () {
    return (1 + 1);
};
console.log("Anonymous Without parameter and with return type " + func10());
//With parameter and without return type
var func11 = function (a, b) {
    console.log("Anonymous With parameter and without return type " + (a + b));
};
func11(2, 1);
//Without parameter and without return type
var func12 = function () {
    console.log("Anonymous Without parameter and without return type ");
};
func12();
