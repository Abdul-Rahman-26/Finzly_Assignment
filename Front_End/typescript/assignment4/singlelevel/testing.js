"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Animal_1 = require("./Animal");
var cat_1 = require("./cat");
var animal = new Animal_1.Animal();
console.log(animal.makeSound());
animal.operation(10, 5);
console.log("\n                    -----------------------------\n");
var cat = new cat_1.Cat();
console.log(cat.makeSound());
cat.operation(10, 5);
