import { Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { UserProfileComponent } from './user-profile/user-profile.component';
import { TableListComponent } from './table-list/table-list.component';

export const routes: Routes =[
    { path: 'static-test',      component: DashboardComponent },
    { path: 'iterative-test',   component: UserProfileComponent },
    { path: 'form-test',        component: TableListComponent },
    { path: '',                 redirectTo: 'static-test', pathMatch: 'full' },
    { path: '**',                 redirectTo: 'static-test', pathMatch: 'full' }
];
