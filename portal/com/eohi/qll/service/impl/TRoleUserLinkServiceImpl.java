package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TRoleUserLinkReader;
import com.eohi.qll.service.TRoleUserLinkService;

@Service
@DeleteFlag(flag = true)
public class TRoleUserLinkServiceImpl extends TRoleUserLinkService {
	
	@Autowired
	private TRoleUserLinkReader reader;

	@Override
	protected TRoleUserLinkReader reader() {
		return reader;
	}

}
