export class Device {
    phoneModel: String;
    phoneNickname: String;
    phoneNumber: String;
    plansNumber: number;

    constructor (phoneModel: String,
        phoneNickname: String,
        phoneNumber: String,
        plansNumber: number) {
            this.phoneModel = phoneModel;
            this.phoneNickname = phoneNickname;
            this.phoneNumber = phoneNumber;
            this.plansNumber = plansNumber;
        }
}
