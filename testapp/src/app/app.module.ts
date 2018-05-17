import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';

import { routes } from './app.routing';
import { AppComponentsModule } from './app-components/app-components.module';

import { AppComponent } from './app.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { TableListComponent } from './pages/table-list/table-list.component';
import { UserProfileComponent } from './pages/user-profile/user-profile.component';
import { ProductCrudComponent } from './pages/product-crud/product-crud.component';
import { StaticTestComponent } from './pages/static-test/static-test.component';
import {
  MatButtonModule,
  MatInputModule,
  MatRippleModule,
  MatTooltipModule,
} from '@angular/material';
import { NonEntityModule } from './library-modules/non-entity/non-entity.module';
import { ProductService } from './services/product.service';
import { ProductEntityModule } from './library-modules/product-entity/product-entity.module';


@NgModule({
  declarations: [
    AppComponent,

    DashboardComponent,
    TableListComponent,
    UserProfileComponent,
    ProductCrudComponent,
    StaticTestComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule, ReactiveFormsModule,
    HttpModule,
    AppComponentsModule,
    RouterModule.forRoot(routes),

    MatButtonModule,
    MatRippleModule,
    MatInputModule,
    MatTooltipModule,

    NonEntityModule,
    ProductEntityModule
  ],
  providers: [
    ProductService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
