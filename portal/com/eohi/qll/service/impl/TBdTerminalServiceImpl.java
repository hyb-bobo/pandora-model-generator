package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdTerminalReader;
import com.eohi.qll.service.TBdTerminalService;

@Service
@DeleteFlag(flag = true)
public class TBdTerminalServiceImpl extends TBdTerminalService {
	
	@Autowired
	private TBdTerminalReader reader;

	@Override
	protected TBdTerminalReader reader() {
		return reader;
	}

}
