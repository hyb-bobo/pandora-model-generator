package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdMouldManufacturerReader;
import com.eohi.qll.service.TBdMouldManufacturerService;

@Service
@DeleteFlag(flag = true)
public class TBdMouldManufacturerServiceImpl extends TBdMouldManufacturerService {
	
	@Autowired
	private TBdMouldManufacturerReader reader;

	@Override
	protected TBdMouldManufacturerReader reader() {
		return reader;
	}

}
