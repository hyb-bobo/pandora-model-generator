package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdCompanyReader;
import com.eohi.qll.service.TBdCompanyService;

@Service
@DeleteFlag(flag = true)
public class TBdCompanyServiceImpl extends TBdCompanyService {
	
	@Autowired
	private TBdCompanyReader reader;

	@Override
	protected TBdCompanyReader reader() {
		return reader;
	}

}
