import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-reservation',
  templateUrl: './reservation.component.html',
  styleUrls: ['./reservation.component.css']
})
export class ReservationComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  plus() {
    var first: number = 1;
    var last: number = 50;
    let num = first + 1
    console.log("Value of num1 after increment ", first)
    if (num === last) {
      console.log('disable')
    } else {
      console.log('num plus', num)
    }
  }

  minus() {
    var first1: number = 1;
    var last1: number = 50;
    let num1 = first1 - 1
    console.log("Value of num1 after decr ", first1)
    if (num1 === last1) {
      console.log('disable')
    } else {
      console.log('num minus', num1)
    }
  }
}
