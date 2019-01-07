package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdMouldTypeReader;
import com.eohi.qll.service.TBdMouldTypeService;

@Service
@DeleteFlag(flag = true)
public class TBdMouldTypeServiceImpl extends TBdMouldTypeService {
	
	@Autowired
	private TBdMouldTypeReader reader;

	@Override
	protected TBdMouldTypeReader reader() {
		return reader;
	}

}
