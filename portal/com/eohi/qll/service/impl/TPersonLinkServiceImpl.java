package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TPersonLinkReader;
import com.eohi.qll.service.TPersonLinkService;

@Service
@DeleteFlag(flag = true)
public class TPersonLinkServiceImpl extends TPersonLinkService {
	
	@Autowired
	private TPersonLinkReader reader;

	@Override
	protected TPersonLinkReader reader() {
		return reader;
	}

}
