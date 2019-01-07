package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700LanguageReader;
import com.eohi.qll.service.T700LanguageService;

@Service
@DeleteFlag(flag = true)
public class T700LanguageServiceImpl extends T700LanguageService {
	
	@Autowired
	private T700LanguageReader reader;

	@Override
	protected T700LanguageReader reader() {
		return reader;
	}

}
