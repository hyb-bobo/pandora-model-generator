package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdLanguageReader;
import com.eohi.qll.service.TBdLanguageService;

@Service
@DeleteFlag(flag = true)
public class TBdLanguageServiceImpl extends TBdLanguageService {
	
	@Autowired
	private TBdLanguageReader reader;

	@Override
	protected TBdLanguageReader reader() {
		return reader;
	}

}
