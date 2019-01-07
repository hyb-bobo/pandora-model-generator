package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdOrganizationReader;
import com.eohi.qll.service.TBdOrganizationService;

@Service
@DeleteFlag(flag = true)
public class TBdOrganizationServiceImpl extends TBdOrganizationService {
	
	@Autowired
	private TBdOrganizationReader reader;

	@Override
	protected TBdOrganizationReader reader() {
		return reader;
	}

}
