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
  public editar:boolean;
  public crear:boolean;

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
    tipoIdentificacion:"", //prueba de errores
    numeroTel:''
    };
    this.personas = [];
  }
  
  constructor() { }
  editarForm(){
  	this.editar= true;
  }
  
  crearForm(){
  	this.crear = true;
  }
  
  public guardar() {
  	console.log('guardando....' + this.persona.nombre);
    this.personas.push(this.persona);
    console.log('cantidad de personas....' + this.personas.length);
    
  }
  public borrar(persona: PersonaDTO) {
  	console.log('borrando....');
    this.personas = this.personas.filter(p => p.nombre !== persona.nombre);
     
  }
  

}
