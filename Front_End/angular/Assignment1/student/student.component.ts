import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  name:string = "NameS";
  img:string = "./../assets/2.png";
  valid:number= 3;
  constructor() { }

  ngOnInit(): void {
  }

}
