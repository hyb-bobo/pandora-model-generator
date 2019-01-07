package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdMouldModelReader;
import com.eohi.qll.service.TBdMouldModelService;

@Service
@DeleteFlag(flag = true)
public class TBdMouldModelServiceImpl extends TBdMouldModelService {
	
	@Autowired
	private TBdMouldModelReader reader;

	@Override
	protected TBdMouldModelReader reader() {
		return reader;
	}

}
