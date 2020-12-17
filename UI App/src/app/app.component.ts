import { Component } from '@angular/core';
import { EmphttpserviceService } from './emphttpservice.service';
import { Users } from './users';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-app';
  users:Users[] = [];
  
  constructor(private service: EmphttpserviceService) {}

  onClickMe() {
    this.service.getEmployees().subscribe(
      (response) => this.processResponse(response),
      (error) => this.processErrorResponse(error)
    );
  }

  processResponse(response:Users[]) {
    console.log(response);
    this.users = response;
  }

  processErrorResponse(error:any) {
    console.log(error.error);
  }
}
