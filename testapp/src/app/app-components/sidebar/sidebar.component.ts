import { Component, OnInit } from '@angular/core';

declare interface RouteInfo {
    path: string;
    title: string;
    icon: string;
    class: string;
}
export const ROUTES: RouteInfo[] = [
    { path: '/static-test', title: 'Static Test',  icon: '', class: '' },
    { path: '/form-test', title: 'Form Test',  icon:'', class: '' },
    { path: '/iterative-test', title: 'Iterative Test',  icon:'', class: '' }
];

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
})
export class SidebarComponent implements OnInit {
  menuItems: any[];

  constructor() { }

  ngOnInit() {
    this.menuItems = ROUTES.filter(menuItem => menuItem);
  }
  isMobileMenu() {
      if (window.window.innerWidth > 991) {
          return false;
      }
      return true;
  };
}
