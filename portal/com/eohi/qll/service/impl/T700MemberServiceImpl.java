package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700MemberReader;
import com.eohi.qll.service.T700MemberService;

@Service
@DeleteFlag(flag = true)
public class T700MemberServiceImpl extends T700MemberService {
	
	@Autowired
	private T700MemberReader reader;

	@Override
	protected T700MemberReader reader() {
		return reader;
	}

}
