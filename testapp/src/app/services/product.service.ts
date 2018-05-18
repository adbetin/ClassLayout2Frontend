import { Injectable } from '@angular/core';
import { Product } from '../models/product';
import { Http } from '@angular/http';

@Injectable()
export class ProductService {

  private serviceUrl = 'http://localhost:8080/api/product';

  constructor(private http: Http) { }

  getAll(): Promise<void | Product[]> {
    return this.http.get(this.serviceUrl)
               .toPromise()
               .then(response => response.json() as Product[])
               .catch(this.handleError);
  }

  // post("/api/product")
  create(item: Product): Promise<void | Product> {
    return this.http.post(this.serviceUrl, item)
               .toPromise()
               .then(response => response.json() as Product)
               .catch(this.handleError);
  }

  // get("/api/product/:id")
  get(id: string): Promise<void | Product> {
    let getUrl = this.serviceUrl + '/' + id;
    return this.http.get(getUrl)
               .toPromise()
               .then(response => response.json() as Product)
               .catch(this.handleError);
  }

  // delete("/api/product/:id")
  delete(id: String): Promise<void | String> {
    return this.http.delete(this.serviceUrl + '/' + id)
               .toPromise()
               .then(response => response.json() as String)
               .catch(this.handleError);
  }

  // put("/api/product/:id")
  update(item: Product): Promise<void | Product> {
    var putUrl = this.serviceUrl + '/' + item._id;
    return this.http.put(putUrl, item)
               .toPromise()
               .then(response => response.json() as Product)
               .catch(this.handleError);
  }

  private handleError(error: any) {
    let errMsg = (error.message) ? error.message :
      error.status ? `${error.status} - ${error.statusText}` : 'Server error';
    console.error(errMsg); // log to console instead
  }
}
