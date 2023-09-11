import { Grandfather } from "./Grandfather";
import { Dad } from "./father";
import { Son } from "./son";

let grandfather = new Grandfather();
console.log(grandfather.start());
grandfather.operation(10,20);
console.log(`
                --------------------------------------`
                );
let father = new Dad();
console.log(father.start());
console.log(father.say());
father.operation(10,20);
console.log(`
                --------------------------------------`
                );
let son = new Son();
console.log(son.start());
console.log(son.say());
son.operation(20,12);
console.log(`
                --------------------------------------`
                );
                