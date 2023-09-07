//With parameter and with return type

let func1 = function add(a:number, b:number):number {
    return (a+b);    
}
console.log("With parameter and with return type "+func1(1,0));

//Without parameter and with return type

let func2 = function add():number{
    return (1+1);
}
console.log("Without parameter and with return type "+func2());

//With parameter and without return type

let func3 = function add(a:number , b:number){
    console.log("With parameter and without return type "+(a+b));
}
func3(2,1);

//Without parameter and without return type

let func4 = function add(){
    console.log("Without parameter and without return type ");
}
func4();

//Fact Arrow Function
//With parameter and with return type

let func5 = (a:number, b:number):number=> {
    return (a+b);    
}
console.log("Fact Arrow With parameter and with return type "+func5(3,2));

//Without parameter and with return type

let func6 = ():number => {
    return (5+1);
}
console.log("Fact Arrow Without parameter and with return type "+func6());

//With parameter and without return type

let func7 = (a:number , b:number)=>{
    console.log("Fact Arrow With parameter and without return type "+(a+b));
}
func7(5,2);

//Without parameter and without return type

let func8 = () => {
    console.log("Fact Arrow Without parameter and without return type ");
}
func8();


//Anonymous
//With parameter and with return type

let func9 = function (a:number, b:number):number {
    return (a+b);    
}
console.log("Anonymous With parameter and with return type "+func9(1,0));

//Without parameter and with return type

let func10 = function():number{
    return (1+1);
}
console.log("Anonymous Without parameter and with return type "+func10());

//With parameter and without return type

let func11 = function (a:number , b:number){
    console.log("Anonymous With parameter and without return type "+(a+b));
}
func11(2,1);

//Without parameter and without return type

let func12 = function (){
    console.log("Anonymous Without parameter and without return type ");
}
func12();



