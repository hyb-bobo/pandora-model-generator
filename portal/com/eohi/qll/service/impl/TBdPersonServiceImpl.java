package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdPersonReader;
import com.eohi.qll.service.TBdPersonService;

@Service
@DeleteFlag(flag = true)
public class TBdPersonServiceImpl extends TBdPersonService {
	
	@Autowired
	private TBdPersonReader reader;

	@Override
	protected TBdPersonReader reader() {
		return reader;
	}

}
