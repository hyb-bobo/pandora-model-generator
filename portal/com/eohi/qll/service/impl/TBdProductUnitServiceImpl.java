package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdProductUnitReader;
import com.eohi.qll.service.TBdProductUnitService;

@Service
@DeleteFlag(flag = true)
public class TBdProductUnitServiceImpl extends TBdProductUnitService {
	
	@Autowired
	private TBdProductUnitReader reader;

	@Override
	protected TBdProductUnitReader reader() {
		return reader;
	}

}
