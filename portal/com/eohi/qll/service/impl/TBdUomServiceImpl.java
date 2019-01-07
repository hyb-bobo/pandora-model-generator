package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdUomReader;
import com.eohi.qll.service.TBdUomService;

@Service
@DeleteFlag(flag = true)
public class TBdUomServiceImpl extends TBdUomService {
	
	@Autowired
	private TBdUomReader reader;

	@Override
	protected TBdUomReader reader() {
		return reader;
	}

}
