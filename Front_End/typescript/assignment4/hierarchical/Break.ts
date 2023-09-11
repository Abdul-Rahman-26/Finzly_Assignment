import {Car} from "./Car";

export class Brake extends Car{
    constructor(){
        super();
    }

    override start(): string {
        return "Car started and ready to break";
    }

    brake():string{
        return "Car is braked";
    }
    override operation(a: number, b: number): void {
        console.log("This is from Brake class "+(a%b));
    }
}