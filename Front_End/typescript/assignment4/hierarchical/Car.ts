export class Car{
    private a:number;
    private b:number;

    constructor(){
    }

    start():string{
        return "Car started";
    }
    operation(a:number,b:number){
        console.log("From parent class : "+(a+b));        
    }
    public setA(a:number){
        this.a = a;
    }
    public getA():number{
        return this.a;
    }
    
    public setB(b:number){
        this.b = b;
    }
    public getB():number{
        return this.b;
    }

}