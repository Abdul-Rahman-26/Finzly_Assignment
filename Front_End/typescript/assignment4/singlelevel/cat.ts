import {Animal} from "./Animal";

export class Cat extends Animal{
    constructor(){
        super();
    }

    override makeSound(): string {
        return "Cat sounds";
    }

    override operation(a: number, b: number): void {
        console.log("This is from Child class "+(a*b));
    }
}