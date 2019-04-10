import { Component, OnInit } from '@angular/core';
import { PersonaDTO} from "../apoyo/modelo/personaDTO"; 
import { version } from 'punycode';
import { Validators } from '@angular/forms';

@Component({
  selector: 'app-gestion-personas',
  templateUrl: './gestion-personas.component.html',
  
})
export class GestionPersonasComponent implements OnInit {

  constructor() { }

  public mostrarFormulario:boolean;
  public nacimiento=new Date();
  public persona: PersonaDTO;
  public personas: PersonaDTO[];
public docident=[];
  public tipoId=[];

  // ejemplo
public tipoDocumento:string;


  public ngOnInit() {
    this.mostrarFormulario = true;
    
    this.docident=[
      "cedula","tarjeta de identidad","contraseña"
    ]
    this.nacimiento=new Date(1996,1,4);
  	this.persona = {
        id: '0',
		nombre: 'Juan',
		apellido: 'Cano',
		tipoIdentificacion: 'Cedula',
		numeroIdentificacion: '1053847359',
    mayorEdad:false,
    edad:'23',
    sexo:'Masculino',
    ciudad:"Manizales",
    roles:'',
    
    numeroTel:'8917487'
    };
    this.personas = [];
  }
  mostrar(){
  	this.mostrarFormulario = true;
  }
  
  ocultar(){
  	this.mostrarFormulario = false;
  }

}
