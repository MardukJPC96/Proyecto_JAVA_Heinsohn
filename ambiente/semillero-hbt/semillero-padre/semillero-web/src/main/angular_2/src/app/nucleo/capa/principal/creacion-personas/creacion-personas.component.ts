import { Component, OnInit } from '@angular/core';
import { PersonaDTO} from "../apoyo/modelo/personaDTO"; 
@Component({
  selector: 'app-creacion-personas',
  templateUrl: './creacion-personas.component.html'
})
export class CreacionPersonasComponent implements OnInit {
  
  public persona: PersonaDTO;
  public personas: PersonaDTO[];
public docident=[];
  public tipoId=[];

  // ejemplo
public tipoDoc:string;


  public ngOnInit() {
  
    
    this.tipoId=[
      "cedula","tarjeta de identidad","contraseña"
    ]
    
  	this.persona = {
        id: '0',
		nombre: '',
		apellido: '',
		numeroIdentificacion: '',
    mayorEdad:false,
    edad:'',
    sexo:'',
    roles:'',
    ciudad:"",
    
    numeroTel:''
    };
    this.personas = [];
  }
  
  constructor() { }

  

}
