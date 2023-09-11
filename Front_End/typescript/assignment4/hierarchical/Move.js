"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.Move = void 0;
var Car_1 = require("./Car");
var Move = /** @class */ (function (_super) {
    __extends(Move, _super);
    function Move() {
        return _super.call(this) || this;
    }
    Move.prototype.start = function () {
        return "Car started and ready to move";
    };
    Move.prototype.accelerate = function () {
        return "Car is accelerated";
    };
    Move.prototype.operation = function (a, b) {
        console.log("This is from accelerate class " + (a * b));
    };
    return Move;
}(Car_1.Car));
exports.Move = Move;
