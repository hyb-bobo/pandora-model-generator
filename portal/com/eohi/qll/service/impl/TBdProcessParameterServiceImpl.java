package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdProcessParameterReader;
import com.eohi.qll.service.TBdProcessParameterService;

@Service
@DeleteFlag(flag = true)
public class TBdProcessParameterServiceImpl extends TBdProcessParameterService {
	
	@Autowired
	private TBdProcessParameterReader reader;

	@Override
	protected TBdProcessParameterReader reader() {
		return reader;
	}

}
