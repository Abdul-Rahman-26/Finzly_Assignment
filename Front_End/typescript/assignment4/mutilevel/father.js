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
exports.Dad = void 0;
var Grandfather_1 = require("./Grandfather");
var Dad = /** @class */ (function (_super) {
    __extends(Dad, _super);
    function Dad() {
        return _super.call(this) || this;
    }
    Dad.start = function () {
        throw new Error("Method not implemented.");
    };
    Dad.prototype.start = function () {
        return "Now Dad started and to teach";
    };
    Dad.prototype.say = function () {
        return "Dad said that to multiply the value";
    };
    Dad.prototype.operation = function (a, b) {
        console.log("Dad solve as " + (a * b));
    };
    return Dad;
}(Grandfather_1.Grandfather));
exports.Dad = Dad;
