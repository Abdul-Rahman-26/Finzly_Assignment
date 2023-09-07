export class NewClass {
    pattern(value: number) {
        for (let i = 0; i <= value; i++) {
            let row = "";
            for (let j = i; j < value; j++) {
                row += "*\t";
            }
            console.log(row);
        }
    }

    pattern1(value:number){
        for(let i=0;i<= value;i++){
            let row = "";
            for(let j=0;j<i;j++){
            row += "*\t";
            }
            
        console.log(row);
        }
    }
}


