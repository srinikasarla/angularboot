import { Component } from '@angular/core';
import { Http } from '@angular/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app works!';
  result = '';

  constructor(private http: Http){
  }

  private secured(): void {
    this.result = 'loading...';
    this.http.get(`/cab/api/hello-world`).subscribe(response => this.result = response.text());
  }

  private unsecured(): void {
    this.result = 'loading...';
    this.http.get(`/cab/hello-world`).subscribe(response => this.result = response.text());
  }

}
