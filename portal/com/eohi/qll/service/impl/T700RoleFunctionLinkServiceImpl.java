package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700RoleFunctionLinkReader;
import com.eohi.qll.service.T700RoleFunctionLinkService;

@Service
@DeleteFlag(flag = true)
public class T700RoleFunctionLinkServiceImpl extends T700RoleFunctionLinkService {
	
	@Autowired
	private T700RoleFunctionLinkReader reader;

	@Override
	protected T700RoleFunctionLinkReader reader() {
		return reader;
	}

}
