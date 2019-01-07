package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700ProcessRouteReader;
import com.eohi.qll.service.T700ProcessRouteService;

@Service
@DeleteFlag(flag = true)
public class T700ProcessRouteServiceImpl extends T700ProcessRouteService {
	
	@Autowired
	private T700ProcessRouteReader reader;

	@Override
	protected T700ProcessRouteReader reader() {
		return reader;
	}

}
