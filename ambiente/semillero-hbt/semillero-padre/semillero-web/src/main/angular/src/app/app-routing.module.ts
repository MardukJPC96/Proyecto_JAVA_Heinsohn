import { NgModule} from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import  {EncabezadoComponent} from './nucleo/capa/encabezado/encabezado.component';
import  {CapaComponent} from './nucleo/capa/capa.component';
import  {MainComponent} from './nucleo/capa/main/main.component';
import  {PiepaginaComponent} from './nucleo/capa/piepagina/piepagina.component';
import {CreacionPersonasComponent} from './nucleo/creacion-personas/creacion-personas.component';

const routes: Routes = [
  {path:"principal",component:MainComponent},
  {path:"encabezado",component:EncabezadoComponent},
  {path:"piedepagina",component:PiepaginaComponent},
  {path:"capa",component:CapaComponent},
  {path:"creacionPerson",component:CreacionPersonasComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
