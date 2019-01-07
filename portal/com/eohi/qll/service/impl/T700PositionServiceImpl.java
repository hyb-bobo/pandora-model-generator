package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700PositionReader;
import com.eohi.qll.service.T700PositionService;

@Service
@DeleteFlag(flag = true)
public class T700PositionServiceImpl extends T700PositionService {
	
	@Autowired
	private T700PositionReader reader;

	@Override
	protected T700PositionReader reader() {
		return reader;
	}

}
