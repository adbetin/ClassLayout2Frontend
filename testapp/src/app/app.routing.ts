import { Routes } from '@angular/router';
//import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { UserProfileComponent } from './pages/user-profile/user-profile.component';
import { TableListComponent } from './pages/table-list/table-list.component';
import { StaticTestComponent } from './pages/static-test/static-test.component';
import { ProductCrudComponent } from './pages/product-crud/product-crud.component';

export const routes: Routes =[
    { path: 'static-test',      component: StaticTestComponent },
    { path: 'form-test',        component: ProductCrudComponent },
    { path: 'iterative-test',   component: UserProfileComponent },
    { path: '',                 redirectTo: 'static-test', pathMatch: 'full' },
    { path: '**',                 redirectTo: 'static-test', pathMatch: 'full' }
];
