import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Static1Component } from './static1/static1.component';
import { Static2Component } from './static2/static2.component';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [
    Static1Component,
    Static2Component
  ],
  exports: [
    Static1Component,
    Static2Component
  ]
})
export class NonEntityModule { }
