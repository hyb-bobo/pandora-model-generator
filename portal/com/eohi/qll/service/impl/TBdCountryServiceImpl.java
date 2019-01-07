package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdCountryReader;
import com.eohi.qll.service.TBdCountryService;

@Service
@DeleteFlag(flag = true)
public class TBdCountryServiceImpl extends TBdCountryService {
	
	@Autowired
	private TBdCountryReader reader;

	@Override
	protected TBdCountryReader reader() {
		return reader;
	}

}
