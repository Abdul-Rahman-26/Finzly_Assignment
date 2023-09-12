import { Car } from "../hierarchical/Car";
export class A extends Car{
   constructor(){
        super();
    }

    override start(): string {
        return "A class accessed from Car which was another package";
    }

    A():string{
        return "child of Car";
    }
    override operation(a: number, b: number): void {
        console.log("This is from Child class A "+a +b);
    }

}