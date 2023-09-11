import { Animal } from "./Animal";
import { Cat } from "./cat";

let animal = new Animal();
console.log(animal.makeSound());
animal.operation(10,5);

console.log(`
                    -----------------------------
`)
let cat = new Cat();
console.log(cat.makeSound());
cat.operation(10,5);