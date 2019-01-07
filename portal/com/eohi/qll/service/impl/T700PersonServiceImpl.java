package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700PersonReader;
import com.eohi.qll.service.T700PersonService;

@Service
@DeleteFlag(flag = true)
public class T700PersonServiceImpl extends T700PersonService {
	
	@Autowired
	private T700PersonReader reader;

	@Override
	protected T700PersonReader reader() {
		return reader;
	}

}
