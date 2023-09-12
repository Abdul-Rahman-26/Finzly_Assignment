import { Car } from "../hierarchical/Car";
import { A } from "./accessfrompackage";

let a = new Car();
console.log(a.start());
let b= new A();
console.log(b.start());