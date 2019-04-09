import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-creacion-personas',
  templateUrl: './creacion-personas.component.html',
  styleUrls: ['./creacion-personas.component.css']
})
export class CreacionPersonasComponent implements OnInit {

  constructor() { }
  name="Juan";
  id=1053;
  edad=23;
  ngOnInit() {
  }

}
