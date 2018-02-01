import {Injectable} from '@angular/core';
import {AuthHttp} from 'angular2-jwt';
import {Http} from '@angular/http';
import {Observable} from 'rxjs/Observable';
import {User} from '../model/user';
import 'rxjs/add/operator/map';

const url = '/api/users';

@Injectable()
export class UserService {

  constructor(private http: Http) {
  }

  getAll(): Observable<User[]> {
    return this.http.get(`${url}/all/`).map(res => res.json());
  }

  findById(id: number): Observable<User> {
    return this.http.get(`${url}/${id}`).map(res => res.json());
  }

  save(user: User): Observable<User> {
    return this.http.post(url, user).map(res => res.json());
  }
}
