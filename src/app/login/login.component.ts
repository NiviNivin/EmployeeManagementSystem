import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username!:string;
  password!:string;
  message = "Signin pls..";

  constructor(private employee:EmployeeService, private router:Router ){}
 

  ngOnInit(): void {
  }

  loginAdmin(form: NgForm){
   //this.employeeserv.getEmployeeById().subscribe(data => {
     // console.log(data);
      if(this.username=='Admin'){
        if(this.password == '1234')
          this.router.navigate(['admin']);
        else
          //this.router.navigate(['AdminLogin']);  
          alert("Sorry!! Invalid Credentials");
          //this.message = "Sorry!! Invalid Credentials";
         form.resetForm();
    }
    else{
      this.message = "Sorry!! Invalid Credentials";
    }
  };

}
