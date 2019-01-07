package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700TransportMethodReader;
import com.eohi.qll.service.T700TransportMethodService;

@Service
@DeleteFlag(flag = true)
public class T700TransportMethodServiceImpl extends T700TransportMethodService {
	
	@Autowired
	private T700TransportMethodReader reader;

	@Override
	protected T700TransportMethodReader reader() {
		return reader;
	}

}
