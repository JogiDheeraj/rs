import {Component} from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
})

export class AppComponent {

  constructor(private router: Router) {}
  
  public showPageHeader() {
    return this.router.url.includes('home') 
      || this.router.url.includes('account')
      || this.router.url.includes('manage');
  }
  
}
