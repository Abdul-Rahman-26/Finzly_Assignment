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
exports.Brake = void 0;
var Car_1 = require("./Car");
var Brake = /** @class */ (function (_super) {
    __extends(Brake, _super);
    function Brake() {
        return _super.call(this) || this;
    }
    Brake.prototype.start = function () {
        return "Car started and ready to break";
    };
    Brake.prototype.brake = function () {
        return "Car is braked";
    };
    Brake.prototype.operation = function (a, b) {
        console.log("This is from Brake class " + (a % b));
    };
    return Brake;
}(Car_1.Car));
exports.Brake = Brake;
