import { Brake } from "./Brake";
import { Car } from "./Car";
import { Move } from "./Move";

let car = new Car();
let accelerate = new Move();
let brake = new Brake();
console.log("Car");
console.log(car.start());
car.operation(2,3);
console.log(`
                -----------------------------------------------------
                `);
console.log("accelerate");
console.log(accelerate.start());
accelerate.operation(3,3);
console.log(`
                -----------------------------------------------------
`);
console.log("brake");
console.log(brake.start());
brake.operation(3,3);
console.log(`
                -----------------------------------------------------
                `);
                