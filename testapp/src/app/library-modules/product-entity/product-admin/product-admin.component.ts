import { Component, OnInit } from '@angular/core';
import { Product } from '../../../models/product';

@Component({
  selector: 'product-admin',
  templateUrl: './product-admin.component.html'
})
export class ProductAdminComponent implements OnInit {

  public editItem: Product = null;

  constructor() { }

  edit(item: Product){
    this.editItem = item;
  }

  back(){
    this.editItem = null;
  }

  ngOnInit() {
  }

}
