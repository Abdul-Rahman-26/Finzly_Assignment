import {Dad} from "./father";

export class Son extends Dad{
    constructor(){
        super();
    }

    override start(): string {
        return "Now Son started and to learn";
    }

    override say():string{
        return "Dad said that to multiply the value but son does subtraction";
    }
    override operation(a: number, b: number): void {
        console.log("Son solve as "+(a-b));
    }
}