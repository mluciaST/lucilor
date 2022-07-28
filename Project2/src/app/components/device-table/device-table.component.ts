import { Component, OnInit } from '@angular/core';
import { DEVICES } from 'src/app/Mock_Data/deviceData';
import { MyDevices } from 'src/app/Mock_Data/MyDevices';

@Component({
  selector: 'app-device-table',
  templateUrl: './device-table.component.html',
  styleUrls: ['./device-table.component.css']
})
export class DeviceTableComponent implements OnInit {
  hidePlanNumber: boolean = true;
  devices: MyDevices[] = DEVICES;
  constructor() { }

  ngOnInit(): void {
  }

  editDevice(){}
  deleteDevice(){}
}
