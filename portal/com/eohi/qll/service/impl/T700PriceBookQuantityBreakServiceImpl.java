package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700PriceBookQuantityBreakReader;
import com.eohi.qll.service.T700PriceBookQuantityBreakService;

@Service
@DeleteFlag(flag = true)
public class T700PriceBookQuantityBreakServiceImpl extends T700PriceBookQuantityBreakService {
	
	@Autowired
	private T700PriceBookQuantityBreakReader reader;

	@Override
	protected T700PriceBookQuantityBreakReader reader() {
		return reader;
	}

}
