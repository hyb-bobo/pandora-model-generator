package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700FunctionReader;
import com.eohi.qll.service.T700FunctionService;

@Service
@DeleteFlag(flag = true)
public class T700FunctionServiceImpl extends T700FunctionService {
	
	@Autowired
	private T700FunctionReader reader;

	@Override
	protected T700FunctionReader reader() {
		return reader;
	}

}
