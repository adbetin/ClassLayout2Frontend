import { Injectable } from '@angular/core';
import { ProductCategory } from '../models/productcategory';
import { Http } from '@angular/http';

@Injectable()
export class ProductCategoryService {

  private serviceUrl = 'https://classlayout-2-frontend.herokuapp.com/api/ProductCategory';

  constructor(private http: Http) { }

  getAll(): Promise<void | ProductCategory[]> {
    return this.http.get(this.serviceUrl)
               .toPromise()
               .then(response => response.json() as ProductCategory[])
               .catch(this.handleError);
  }

  // post("/api/productcategory")
  create(item: ProductCategory): Promise<void | ProductCategory> {
    return this.http.post(this.serviceUrl, item)
               .toPromise()
               .then(response => response.json() as ProductCategory)
               .catch(this.handleError);
  }

  // get("/api/productcategory/:id")
  get(id: string): Promise<void | ProductCategory> {
    let getUrl = this.serviceUrl + '/' + id;
    return this.http.get(getUrl)
               .toPromise()
               .then(response => response.json() as ProductCategory)
               .catch(this.handleError);
  }

  // delete("/api/productcategory/:id")
  delete(id: String): Promise<void | String> {
    return this.http.delete(this.serviceUrl + '/' + id)
               .toPromise()
               .then(response => response.json() as String)
               .catch(this.handleError);
  }

  // put("/api/productcategory/:id")
  update(item: ProductCategory): Promise<void | ProductCategory> {
    var putUrl = this.serviceUrl + '/' + item._id;
    return this.http.put(putUrl, item)
               .toPromise()
               .then(response => response.json() as ProductCategory)
               .catch(this.handleError);
  }

  private handleError(error: any) {
    let errMsg = (error.message) ? error.message :
      error.status ? `${error.status} - ${error.statusText}` : 'Server error';
    console.error(errMsg); // log to console instead
  }
}
