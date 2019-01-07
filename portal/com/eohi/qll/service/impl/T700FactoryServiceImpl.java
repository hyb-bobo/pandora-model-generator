package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700FactoryReader;
import com.eohi.qll.service.T700FactoryService;

@Service
@DeleteFlag(flag = true)
public class T700FactoryServiceImpl extends T700FactoryService {
	
	@Autowired
	private T700FactoryReader reader;

	@Override
	protected T700FactoryReader reader() {
		return reader;
	}

}
