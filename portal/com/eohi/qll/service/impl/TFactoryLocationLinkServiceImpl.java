package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TFactoryLocationLinkReader;
import com.eohi.qll.service.TFactoryLocationLinkService;

@Service
@DeleteFlag(flag = true)
public class TFactoryLocationLinkServiceImpl extends TFactoryLocationLinkService {
	
	@Autowired
	private TFactoryLocationLinkReader reader;

	@Override
	protected TFactoryLocationLinkReader reader() {
		return reader;
	}

}
