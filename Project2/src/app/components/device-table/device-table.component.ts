import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
// import { DEVICES } from 'src/app/Mock_Data/deviceData';
// import { MyDevices } from 'src/app/Mock_Data/MyDevices';
import { Device } from 'src/app/models/device.model';
import { DeviceService } from 'src/app/services/device.service';
import { devices } from '../mock-data/DEVICES';
import { my_devices } from '../mock-data/my-devices';

@Component({
  selector: 'app-device-table',
  templateUrl: './device-table.component.html',
  styleUrls: ['./device-table.component.css']
})
export class DeviceTableComponent implements OnInit {
  devices: devices[] = my_devices;
  myDevices: devices[] = [];
  i: number = 0;
  constructor() { }

  ngOnInit(): void {
  }

  editDevice(){
    console.log("Edit");
  }

  deleteDevice(){
    console.log("Delete");
  }
}
