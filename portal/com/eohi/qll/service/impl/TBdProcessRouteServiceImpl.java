package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdProcessRouteReader;
import com.eohi.qll.service.TBdProcessRouteService;

@Service
@DeleteFlag(flag = true)
public class TBdProcessRouteServiceImpl extends TBdProcessRouteService {
	
	@Autowired
	private TBdProcessRouteReader reader;

	@Override
	protected TBdProcessRouteReader reader() {
		return reader;
	}

}
