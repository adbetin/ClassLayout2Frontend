import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProductAdminComponent } from './product-admin/product-admin.component';
import { ProductIterationComponent } from './product-iteration/product-iteration.component';
import { ProductFormComponent } from './product-form/product-form.component';
import { ProductTableComponent } from './product-table/product-table.component';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [
    ProductAdminComponent, 
    ProductIterationComponent, 
    ProductFormComponent,  
    ProductTableComponent
  ],
  exports: [
    ProductAdminComponent, 
    ProductIterationComponent, 
    ProductFormComponent, 
    ProductTableComponent
  ]
})
export class ProductEntityModule { }
