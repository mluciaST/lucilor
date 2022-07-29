import { AccountInfo } from './account-info.model';

describe('AccountInfo', () => {
  it('should create an instance', () => {
    expect(new AccountInfo(0, '', '', '', 0, '', '', '', '', '', '', '')).toBeTruthy();
  });
});
