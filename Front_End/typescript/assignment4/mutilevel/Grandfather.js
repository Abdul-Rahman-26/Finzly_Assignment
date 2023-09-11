"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Grandfather = void 0;
var Grandfather = /** @class */ (function () {
    function Grandfather() {
    }
    Grandfather.prototype.start = function () {
        return "Grandfather Started";
    };
    Grandfather.prototype.operation = function (a, b) {
        console.log("Grandfather says addition is : " + (a + b));
    };
    Grandfather.prototype.setA = function (a) {
        this.a = a;
    };
    Grandfather.prototype.getA = function () {
        return this.a;
    };
    Grandfather.prototype.setB = function (b) {
        this.b = b;
    };
    Grandfather.prototype.getB = function () {
        return this.b;
    };
    return Grandfather;
}());
exports.Grandfather = Grandfather;
