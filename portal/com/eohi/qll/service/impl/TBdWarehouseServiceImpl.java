package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdWarehouseReader;
import com.eohi.qll.service.TBdWarehouseService;

@Service
@DeleteFlag(flag = true)
public class TBdWarehouseServiceImpl extends TBdWarehouseService {
	
	@Autowired
	private TBdWarehouseReader reader;

	@Override
	protected TBdWarehouseReader reader() {
		return reader;
	}

}
