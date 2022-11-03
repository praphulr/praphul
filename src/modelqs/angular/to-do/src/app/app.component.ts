
import { Component } from '@angular/core';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'first_project';
  list:any[]=[];
  list1:any[]=[];
  h =" | "
   add(item:String,item1:String)
    {
    
this.list.push({item});

this.list1.push({item1});

  }
  remove(i:number)
  {
this.list.splice(i,1);
this.list1.splice(i,1);
  }
}
