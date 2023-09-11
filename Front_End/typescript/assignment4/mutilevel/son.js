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
exports.Son = void 0;
var father_1 = require("./father");
var Son = /** @class */ (function (_super) {
    __extends(Son, _super);
    function Son() {
        return _super.call(this) || this;
    }
    Son.prototype.start = function () {
        return "Now Son started and to learn";
    };
    Son.prototype.say = function () {
        return "Dad said that to multiply the value but son does subtraction";
    };
    Son.prototype.operation = function (a, b) {
        console.log("Son solve as " + (a - b));
    };
    return Son;
}(father_1.Dad));
exports.Son = Son;
