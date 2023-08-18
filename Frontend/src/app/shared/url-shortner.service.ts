import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UrlShortnerService {
serviceUrl: string="";
  constructor( private http :HttpClient) { 
    this.serviceUrl="http://localhost:8081/url/shortner"
  }
  getShortUrl(url:string){
   return this.http.post<any>(this.serviceUrl,url)
  }
}
