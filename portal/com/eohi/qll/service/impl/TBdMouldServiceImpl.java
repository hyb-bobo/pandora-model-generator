package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdMouldReader;
import com.eohi.qll.service.TBdMouldService;

@Service
@DeleteFlag(flag = true)
public class TBdMouldServiceImpl extends TBdMouldService {
	
	@Autowired
	private TBdMouldReader reader;

	@Override
	protected TBdMouldReader reader() {
		return reader;
	}

}
