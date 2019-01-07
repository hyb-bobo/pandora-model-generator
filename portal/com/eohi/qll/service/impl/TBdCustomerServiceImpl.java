package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdCustomerReader;
import com.eohi.qll.service.TBdCustomerService;

@Service
@DeleteFlag(flag = true)
public class TBdCustomerServiceImpl extends TBdCustomerService {
	
	@Autowired
	private TBdCustomerReader reader;

	@Override
	protected TBdCustomerReader reader() {
		return reader;
	}

}
