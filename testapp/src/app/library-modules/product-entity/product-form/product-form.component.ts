import { Component, OnInit, Input } from '@angular/core';
import { Product } from '../../../models/product';
import { ProductService } from '../../../services/product.service';

@Component({
  selector: 'product-form',
  templateUrl: './product-form.component.html'
})
export class ProductFormComponent implements OnInit {

  @Input() editItem: Product;

  constructor(private productService: ProductService) { }

  save(){
    if(this.editItem._id == ''){
      this.productService.create(this.editItem)
    }else{

    }
  }

  ngOnInit() {
    if(!this.editItem){
      this.editItem = new Product();
    }
  }

}
