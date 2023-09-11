"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Animal = void 0;
var Animal = /** @class */ (function () {
    function Animal() {
    }
    Animal.prototype.makeSound = function () {
        return "Animal sounds";
    };
    Animal.prototype.operation = function (a, b) {
        console.log("From parent class : " + (a + b));
    };
    Animal.prototype.setA = function (a) {
        this.a = a;
    };
    Animal.prototype.getA = function () {
        return this.a;
    };
    Animal.prototype.setB = function (b) {
        this.b = b;
    };
    Animal.prototype.getB = function () {
        return this.b;
    };
    return Animal;
}());
exports.Animal = Animal;
