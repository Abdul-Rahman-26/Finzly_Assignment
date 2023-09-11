import {Grandfather} from "./Grandfather";

export class Dad extends Grandfather{
    static start(): any {
        throw new Error("Method not implemented.");
    }
    constructor(){
        super();
    }

    override start(): string {
        return "Now Dad started and to teach";
    }

    say():string{
        return "Dad said that to multiply the value";
    }
    override operation(a: number, b: number): void {
        console.log("Dad solve as "+(a*b));
    }
}