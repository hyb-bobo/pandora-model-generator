package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdFactoryReader;
import com.eohi.qll.service.TBdFactoryService;

@Service
@DeleteFlag(flag = true)
public class TBdFactoryServiceImpl extends TBdFactoryService {
	
	@Autowired
	private TBdFactoryReader reader;

	@Override
	protected TBdFactoryReader reader() {
		return reader;
	}

}
