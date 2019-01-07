package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700ProductReader;
import com.eohi.qll.service.T700ProductService;

@Service
@DeleteFlag(flag = true)
public class T700ProductServiceImpl extends T700ProductService {
	
	@Autowired
	private T700ProductReader reader;

	@Override
	protected T700ProductReader reader() {
		return reader;
	}

}
