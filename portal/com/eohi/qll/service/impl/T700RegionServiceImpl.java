package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700RegionReader;
import com.eohi.qll.service.T700RegionService;

@Service
@DeleteFlag(flag = true)
public class T700RegionServiceImpl extends T700RegionService {
	
	@Autowired
	private T700RegionReader reader;

	@Override
	protected T700RegionReader reader() {
		return reader;
	}

}
