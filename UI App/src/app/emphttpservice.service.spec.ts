import { TestBed } from '@angular/core/testing';

import { EmphttpserviceService } from './emphttpservice.service';

describe('EmphttpserviceService', () => {
  let service: EmphttpserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EmphttpserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
