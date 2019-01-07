package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700CompanyReader;
import com.eohi.qll.service.T700CompanyService;

@Service
@DeleteFlag(flag = true)
public class T700CompanyServiceImpl extends T700CompanyService {
	
	@Autowired
	private T700CompanyReader reader;

	@Override
	protected T700CompanyReader reader() {
		return reader;
	}

}
