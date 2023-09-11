export class Animal{
    private a:number;
    private b:number;

    constructor(){
    }

    makeSound():string{
        return "Animal sounds";
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