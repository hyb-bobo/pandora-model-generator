package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700RoleReader;
import com.eohi.qll.service.T700RoleService;

@Service
@DeleteFlag(flag = true)
public class T700RoleServiceImpl extends T700RoleService {
	
	@Autowired
	private T700RoleReader reader;

	@Override
	protected T700RoleReader reader() {
		return reader;
	}

}
