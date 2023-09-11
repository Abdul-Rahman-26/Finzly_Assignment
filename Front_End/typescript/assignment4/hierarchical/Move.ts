import {Car} from "./Car";

export class Move extends Car{
    constructor(){
        super();
    }

    override start(): string {
        return "Car started and ready to move";
    }

    accelerate():string{
        return "Car is accelerated";
    }
    override operation(a: number, b: number): void {
        console.log("This is from accelerate class "+(a*b));
    }
}