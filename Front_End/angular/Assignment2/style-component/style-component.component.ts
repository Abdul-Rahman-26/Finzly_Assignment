import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-style-component',
  templateUrl: './style-component.component.html',
  styleUrls: ['./style-component.component.css']
})
export class StyleComponentComponent implements OnInit {

  constructor() { }

  change:boolean=false;
  str:string='';
  onClick(){
    this.change=!this.change;
  }
  onClick1(send:any){
    alert('You type : '+send );
  }
  onClick2(prime: any) {
    let num = parseInt(prime); 
    let isPrime = true;
    if (num <= 1) {
      isPrime = false; 
     } else {
      for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) {
          isPrime = false;
          break; 
        }
      }
    }
    if (isPrime) {
      this.str = 'Your number ' + prime + ' is a prime number';
    } else {
      this.str = 'Your number ' + prime + ' is not a prime number';
    }
  }

  ngOnInit(): void {
  }

}
