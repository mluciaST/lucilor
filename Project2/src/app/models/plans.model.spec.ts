import { Plans } from './plans.model';

describe('Plans', () => {
  it('should create an instance', () => {
    expect(new Plans(0, '', 0, 0, 0, '', 0)).toBeTruthy();
  });
});
