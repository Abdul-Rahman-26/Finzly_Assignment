import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  username: string = '';
  password: string = '';
  class:string="input-container";

  onKeyDown(event: any, fieldType: string) {
    if (fieldType === 'username') {
      if (!/^[a-zA-Z]+$/.test(event.key) || this.username.length >= 20) {
        event.preventDefault();
      }
    } else if (fieldType === 'password') {
      if (this.password.length == 8) {
        alert('Password must be length 8')
      }
    }
  }

  onClick(username: string, password: string) {
    if (username === 'AB' && password === 'password') {
      alert('Login successful');
    } else {
      alert('Invalid username or password.');
    }
  }
constructor() { }

  ngOnInit(): void {
  }
 

}
