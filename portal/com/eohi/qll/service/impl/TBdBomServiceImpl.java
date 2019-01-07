package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdBomReader;
import com.eohi.qll.service.TBdBomService;

@Service
@DeleteFlag(flag = true)
public class TBdBomServiceImpl extends TBdBomService {
	
	@Autowired
	private TBdBomReader reader;

	@Override
	protected TBdBomReader reader() {
		return reader;
	}

}
