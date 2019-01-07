package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdShiftReader;
import com.eohi.qll.service.TBdShiftService;

@Service
@DeleteFlag(flag = true)
public class TBdShiftServiceImpl extends TBdShiftService {
	
	@Autowired
	private TBdShiftReader reader;

	@Override
	protected TBdShiftReader reader() {
		return reader;
	}

}
