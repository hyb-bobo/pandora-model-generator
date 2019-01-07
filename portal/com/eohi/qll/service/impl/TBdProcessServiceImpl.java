package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdProcessReader;
import com.eohi.qll.service.TBdProcessService;

@Service
@DeleteFlag(flag = true)
public class TBdProcessServiceImpl extends TBdProcessService {
	
	@Autowired
	private TBdProcessReader reader;

	@Override
	protected TBdProcessReader reader() {
		return reader;
	}

}
