package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdFactoryLocationReader;
import com.eohi.qll.service.TBdFactoryLocationService;

@Service
@DeleteFlag(flag = true)
public class TBdFactoryLocationServiceImpl extends TBdFactoryLocationService {
	
	@Autowired
	private TBdFactoryLocationReader reader;

	@Override
	protected TBdFactoryLocationReader reader() {
		return reader;
	}

}
