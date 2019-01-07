package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700ProcessReader;
import com.eohi.qll.service.T700ProcessService;

@Service
@DeleteFlag(flag = true)
public class T700ProcessServiceImpl extends T700ProcessService {
	
	@Autowired
	private T700ProcessReader reader;

	@Override
	protected T700ProcessReader reader() {
		return reader;
	}

}
