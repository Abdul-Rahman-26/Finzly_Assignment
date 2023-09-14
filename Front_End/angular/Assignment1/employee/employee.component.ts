import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  class:string="success"
  class1:string="fail"
  valid:number=2;
  mycolor:string="red";
  name:string='AB';

  // checking
  isError:boolean = true;
  jsonObj={
    'success':this.isError,
    'fail' :!this.isError
  }
  constructor() { }

  ngOnInit(): void {
  }

}
