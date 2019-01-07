package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdItemReader;
import com.eohi.qll.service.TBdItemService;

@Service
@DeleteFlag(flag = true)
public class TBdItemServiceImpl extends TBdItemService {
	
	@Autowired
	private TBdItemReader reader;

	@Override
	protected TBdItemReader reader() {
		return reader;
	}

}
