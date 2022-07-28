export class AccountPlans {
    accountNumber: number; 
    phoneNumber: String;
    plansNumber: number;

    constructor (accountNumber: number, phoneNumber: String, plansNumber: number) {
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
        this.plansNumber = plansNumber;
    }
}
