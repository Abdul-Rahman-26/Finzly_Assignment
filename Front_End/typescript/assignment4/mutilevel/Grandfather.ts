export class Grandfather{
    private a:number;
    private b:number;

    constructor(){
    }

    start():string{
        return "Grandfather Started";
    }
    operation(a:number,b:number){
        console.log("Grandfather says addition is : "+(a+b));        
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