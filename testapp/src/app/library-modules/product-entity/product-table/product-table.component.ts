import { Component, OnInit } from '@angular/core';
import { Product } from '../../../models/product';
import { ProductService } from '../../../services/product.service';

@Component({
  selector: 'product-table',
  templateUrl: './product-table.component.html'
})
export class ProductTableComponent implements OnInit {

  elementList: Product[]
  tableHeaders: string[] = ['Nombre', 'Descripcion', 'Codigo', 'Precio Unitario'];

  constructor(private productService: ProductService) {
    productService.getAll().then((resultList: Product[]) => {
      this.elementList = resultList;
    })
  }

  ngOnInit() {
  }

}
