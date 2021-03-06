import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {Routes , RouterModule} from "@angular/router";
import {AuthentificationComponent} from "./authentification/authentification.component";
import {PlanComponent} from "./plan/plan.component";
import {ProgrammeComponent} from "./programme/programme.component";
import {VolComponent} from "./vol/vol.component";
import {HotelComponent} from "./hotel/hotel.component";
import {CalendrierComponent} from "./calendrier/calendrier.component";
import {MenuComponent} from "./menu/menu.component";
import {OffreComponent} from "./offre/offre.component";


const routes :  Routes =[
  {component:AuthentificationComponent, path:'authentification'},
  {component:PlanComponent, path:'plan'},
  {component:ProgrammeComponent, path:'programme'},
  {component:VolComponent,path:'vol'},
  {component:HotelComponent,path:'hotel'},
  {component:CalendrierComponent,path:'calendrier'},
  {component:MenuComponent,path:'menu'},
  {component:OffreComponent,path:'offre'}

]

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes) ]
})
export class AppRoutingModule { }
export const routingComponents=[ProgrammeComponent,VolComponent,HotelComponent,CalendrierComponent,MenuComponent,OffreComponent]
