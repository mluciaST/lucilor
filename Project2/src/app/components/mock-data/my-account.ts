export class myAccount {
  accountNumber: number;
  addressLine1: String;
  addressLine2: String;
  city: String;
  dateOfBirth: String;
  email: String;
  firstName: String;
  lastName: String;
  phoneNumber: String;
  state: String;
  zip: number;

  constructor (accountNumber: number,
      addressLine1: String,
      addressLine2: String,
      city: String,
      dateOfBirth: String,
      email: String,
      firstName: String,
      lastName: String,
      phoneNumber: String,
      state: String,
      zip: number) {
          this.accountNumber = accountNumber;
          this.addressLine1 = addressLine1;
          this.addressLine2 = addressLine2;
          this.city = city;
          this.dateOfBirth =  dateOfBirth;
          this.email = email;
          this.firstName = firstName;
          this.lastName = lastName;
          this.phoneNumber = phoneNumber;
          this.state = state;
          this.zip = zip;
      }
}
