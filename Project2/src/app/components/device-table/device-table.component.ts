import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
// import { DEVICES } from 'src/app/Mock_Data/deviceData';
// import { MyDevices } from 'src/app/Mock_Data/MyDevices';
import { Device } from 'src/app/models/device.model';
import { DeviceService } from 'src/app/services/device.service';

@Component({
  selector: 'app-device-table',
  templateUrl: './device-table.component.html',
  styleUrls: ['./device-table.component.css']
})
export class DeviceTableComponent implements OnInit {
  hidePlanNumber: boolean = true;
  //devices: MyDevices[] = DEVICES;
  device: Device = new Device ('', '', '', 0);

  constructor(private deviceService: DeviceService, private router: Router) { }

  ngOnInit(): void {
    let resp = this.deviceService.findAll().subscribe((data) => {
      if(data.body != null) {
        //this.device = data.body;
      }
    })
  }

  updateDevice(): void { 
    this.deviceService.updateDevice(this.device).subscribe(data => {
      let route = this.router.config.find(r => r.path === 'device');
      if (route) {
        this.router.navigateByUrl('/device');
      }
    });
  }

  deleteDevice(id: number): void {
    let resp = this.deleteDevice(id);
  }
}
