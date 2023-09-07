"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.NewClass = void 0;
var NewClass = /** @class */ (function () {
    function NewClass() {
    }
    NewClass.prototype.pattern = function (value) {
        for (var i = 0; i <= value; i++) {
            var row = "";
            for (var j = i; j < value; j++) {
                row += "*\t";
            }
            console.log(row);
        }
    };
    NewClass.prototype.pattern1 = function (value) {
        for (var i = 0; i <= value; i++) {
            var row = "";
            for (var j = 0; j < i; j++) {
                row += "*\t";
            }
            console.log(row);
        }
    };
    return NewClass;
}());
exports.NewClass = NewClass;
