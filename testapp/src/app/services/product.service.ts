import { Injectable } from '@angular/core';
import { Product } from '../models/product';
import { Http } from '@angular/http';

@Injectable()
export class ProductService {

  private serviceUrl = 'https://classlayout-2-frontend.herokuapp.com/api/articlecategories';

  constructor(private http: Http) { }

  create(item: Product): Promise<void | Product> {
    return this.http.post(this.serviceUrl, item)
      .toPromise()
      .then(response => response.json() as Product  )
      .catch(this.handleError);
  }

  read(): Promise<void | Product[]> {
    //permite leer las entidades Product
    return this.http.get(this.serviceUrl)
      .toPromise()
      .then(response => response.json() as Product[])
      .catch(this.handleError);
  }

  // update(item: Product): Promise<Product> {
  //   //permite actualizar los valores de una entidad Product
  // }

  // delete(item: Product): Promise {
  //   //permite eliminar una entidad Product
  // }

  private handleError(error: any) {
    let errMsg = (error.message) ? error.message :
      error.status ? `${error.status} - ${error.statusText}` : 'Server error';
    console.error(errMsg); // log to console instead
  }
}
