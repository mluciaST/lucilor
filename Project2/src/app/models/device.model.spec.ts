import { Device } from './device.model';

describe('Device', () => {
  it('should create an instance', () => {
    expect(new Device('', '', '', 0)).toBeTruthy();
  });
});
