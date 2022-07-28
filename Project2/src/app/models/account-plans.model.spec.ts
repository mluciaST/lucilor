import { AccountPlans } from './account-plans.model';

describe('AccountPlans', () => {
  it('should create an instance', () => {
    expect(new AccountPlans(0, '', 0)).toBeTruthy();
  });
});
