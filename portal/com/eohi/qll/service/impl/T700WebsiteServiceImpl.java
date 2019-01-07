package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700WebsiteReader;
import com.eohi.qll.service.T700WebsiteService;

@Service
@DeleteFlag(flag = true)
public class T700WebsiteServiceImpl extends T700WebsiteService {
	
	@Autowired
	private T700WebsiteReader reader;

	@Override
	protected T700WebsiteReader reader() {
		return reader;
	}

}
