import {Component, OnInit} from '@angular/core';
// import {Book} from './book/book';
import {ConvertService} from './convert-service.service';
import {Router} from '@angular/router';
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.less']
})
export class AppComponent implements OnInit {
  title = 'Converter';
  outPut: any;
  systemList: string[] = ["Metric", "Imperial"];
  measureList: string[] = ["Temperature", "Length", "Weight"];


  constructor(private router: Router, private convertService: ConvertService) {
  }

  getOutput() {
    this.convertService.getOutput(Object.values(this.measureForm.value), Object.values(this.systemForm.value), Object.values(this.valueForm.value)).subscribe(data => {
      this.outPut = data;
    });
  }

  ngOnInit(): void {

  }

  systemForm = new FormGroup({
    system: new FormControl('', Validators.required)
  });

  measureForm = new FormGroup({
    measure: new FormControl('', Validators.required)
  });

  valueForm = new FormGroup({
    value: new FormControl('', Validators.required)
  });

  get f(){
    return this.systemForm.controls;
  }

  get g(){
    return this.measureForm.controls;
  }

}
