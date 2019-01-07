package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdBomHeadReader;
import com.eohi.qll.service.TBdBomHeadService;

@Service
@DeleteFlag(flag = true)
public class TBdBomHeadServiceImpl extends TBdBomHeadService {
	
	@Autowired
	private TBdBomHeadReader reader;

	@Override
	protected TBdBomHeadReader reader() {
		return reader;
	}

}
