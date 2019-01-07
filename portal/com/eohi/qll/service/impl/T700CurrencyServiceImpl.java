package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700CurrencyReader;
import com.eohi.qll.service.T700CurrencyService;

@Service
@DeleteFlag(flag = true)
public class T700CurrencyServiceImpl extends T700CurrencyService {
	
	@Autowired
	private T700CurrencyReader reader;

	@Override
	protected T700CurrencyReader reader() {
		return reader;
	}

}
