import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Product } from '../../../models/product';
import { ProductService } from '../../../services/product.service';

@Component({
  selector: 'product-form',
  templateUrl: './product-form.component.html'
})
export class ProductFormComponent implements OnInit {

  @Input() editItem: Product;
  @Output() complete: EventEmitter<Product> = new EventEmitter<Product>();

  constructor(private productService: ProductService) { }

  save(){
    if(this.editItem._id == ''){
      this.productService.create(this.editItem).then((result:Product) => {
        this.complete.emit(result);
      })
    }else{
      this.productService.update(this.editItem).then((result:Product) => {
        this.complete.emit(result);
      })
    }
  }

  ngOnInit() {
    if(!this.editItem){
      this.editItem = new Product();
    }
  }

}
