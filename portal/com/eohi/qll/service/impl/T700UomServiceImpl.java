package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700UomReader;
import com.eohi.qll.service.T700UomService;

@Service
@DeleteFlag(flag = true)
public class T700UomServiceImpl extends T700UomService {
	
	@Autowired
	private T700UomReader reader;

	@Override
	protected T700UomReader reader() {
		return reader;
	}

}
