package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700WebsiteCopyrightReader;
import com.eohi.qll.service.T700WebsiteCopyrightService;

@Service
@DeleteFlag(flag = true)
public class T700WebsiteCopyrightServiceImpl extends T700WebsiteCopyrightService {
	
	@Autowired
	private T700WebsiteCopyrightReader reader;

	@Override
	protected T700WebsiteCopyrightReader reader() {
		return reader;
	}

}
