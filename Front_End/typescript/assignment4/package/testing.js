"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Car_1 = require("../hierarchical/Car");
var accessfrompackage_1 = require("./accessfrompackage");
var a = new Car_1.Car();
console.log(a.start());
var b = new accessfrompackage_1.A();
console.log(b.start());
