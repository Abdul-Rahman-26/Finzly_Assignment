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
exports.A = void 0;
var Car_1 = require("../hierarchical/Car");
var A = /** @class */ (function (_super) {
    __extends(A, _super);
    function A() {
        return _super.call(this) || this;
    }
    A.prototype.start = function () {
        return "A class accessed from Car which was another package";
    };
    A.prototype.A = function () {
        return "child of Car";
    };
    A.prototype.operation = function (a, b) {
        console.log("This is from Child class A " + a + b);
    };
    return A;
}(Car_1.Car));
exports.A = A;
