"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Car = void 0;
var Car = /** @class */ (function () {
    function Car() {
    }
    Car.prototype.start = function () {
        return "Car started";
    };
    Car.prototype.operation = function (a, b) {
        console.log("From parent class : " + (a + b));
    };
    Car.prototype.setA = function (a) {
        this.a = a;
    };
    Car.prototype.getA = function () {
        return this.a;
    };
    Car.prototype.setB = function (b) {
        this.b = b;
    };
    Car.prototype.getB = function () {
        return this.b;
    };
    return Car;
}());
exports.Car = Car;
