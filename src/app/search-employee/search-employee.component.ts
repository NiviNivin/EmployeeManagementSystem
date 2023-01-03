import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';

@Component({
  selector: 'app-search-employee',
  templateUrl: './search-employee.component.html',
  styleUrls: ['./search-employee.component.css']
})
export class SearchEmployeeComponent implements OnInit {

  id: number;
  employee: Employee;

  constructor(private employeeService: EmployeeService,
    private router: Router) {}


  ngOnInit(): void {
  }


  // onSubmit() {
  //   this.();    
  // }

  // employeeDetails(id: number){
  //   this.router.navigate(['details', id]);
  // }
  viewEmployee(empId:string){
    let id = parseInt(empId);
    this.employeeService.getEmployee(id).subscribe(data => {
      console.log(data);
      this.employee = <Employee>data;
      this.router.navigate(['details', id]);
    //alert(`${this.employee.empId} ${this.employee.empName} ${this.employee.empDept}`);
  });
    
  }

}
