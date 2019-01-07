package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700ProcessParameterReader;
import com.eohi.qll.service.T700ProcessParameterService;

@Service
@DeleteFlag(flag = true)
public class T700ProcessParameterServiceImpl extends T700ProcessParameterService {
	
	@Autowired
	private T700ProcessParameterReader reader;

	@Override
	protected T700ProcessParameterReader reader() {
		return reader;
	}

}
