package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700UserReader;
import com.eohi.qll.service.T700UserService;

@Service
@DeleteFlag(flag = true)
public class T700UserServiceImpl extends T700UserService {
	
	@Autowired
	private T700UserReader reader;

	@Override
	protected T700UserReader reader() {
		return reader;
	}

}
