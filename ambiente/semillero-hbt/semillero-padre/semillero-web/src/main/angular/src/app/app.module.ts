import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NucleoModule } from './nucleo/nucleo.module';
import  {EncabezadoComponent} from './nucleo/capa/encabezado/encabezado.component';
import  {CapaComponent} from './nucleo/capa/capa.component';
import  {MainComponent} from './nucleo/capa/main/main.component';
import  {PiepaginaComponent} from './nucleo/capa/piepagina/piepagina.component';
import {CreacionPersonasComponent} from './nucleo/creacion-personas/creacion-personas.component';

@NgModule({
  declarations: [
    AppComponent,
    EncabezadoComponent,
    CapaComponent,
    MainComponent,
    PiepaginaComponent,
    CreacionPersonasComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
