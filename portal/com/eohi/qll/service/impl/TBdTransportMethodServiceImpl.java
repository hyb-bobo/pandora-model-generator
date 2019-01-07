package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdTransportMethodReader;
import com.eohi.qll.service.TBdTransportMethodService;

@Service
@DeleteFlag(flag = true)
public class TBdTransportMethodServiceImpl extends TBdTransportMethodService {
	
	@Autowired
	private TBdTransportMethodReader reader;

	@Override
	protected TBdTransportMethodReader reader() {
		return reader;
	}

}
