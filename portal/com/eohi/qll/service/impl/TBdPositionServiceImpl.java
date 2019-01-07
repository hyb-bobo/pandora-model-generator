package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdPositionReader;
import com.eohi.qll.service.TBdPositionService;

@Service
@DeleteFlag(flag = true)
public class TBdPositionServiceImpl extends TBdPositionService {
	
	@Autowired
	private TBdPositionReader reader;

	@Override
	protected TBdPositionReader reader() {
		return reader;
	}

}
