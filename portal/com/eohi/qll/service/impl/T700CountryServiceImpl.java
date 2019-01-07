package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700CountryReader;
import com.eohi.qll.service.T700CountryService;

@Service
@DeleteFlag(flag = true)
public class T700CountryServiceImpl extends T700CountryService {
	
	@Autowired
	private T700CountryReader reader;

	@Override
	protected T700CountryReader reader() {
		return reader;
	}

}
