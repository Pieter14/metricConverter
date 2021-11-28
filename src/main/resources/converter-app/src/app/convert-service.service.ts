import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ConvertService {

  private url = 'http://localhost:8080/convert';


  constructor(private http: HttpClient) {
  }

  getOutput(measure: string[], system: string[], value: unknown[]): Observable<any>{

    return this.http.get(`${this.url + '/' + measure + '/' + system + '/' + value} `);
  }

  addBook(book: object): Observable<object> {
    return this.http.post(`${this.url}`, book);
  }

  deleteBook(id: number): Observable<any> {
    return this.http.delete(`${this.url}/${id}`, {responseType: 'text'});
  }
}
