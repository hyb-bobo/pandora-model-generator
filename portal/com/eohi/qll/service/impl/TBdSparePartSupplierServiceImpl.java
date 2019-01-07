package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdSparePartSupplierReader;
import com.eohi.qll.service.TBdSparePartSupplierService;

@Service
@DeleteFlag(flag = true)
public class TBdSparePartSupplierServiceImpl extends TBdSparePartSupplierService {
	
	@Autowired
	private TBdSparePartSupplierReader reader;

	@Override
	protected TBdSparePartSupplierReader reader() {
		return reader;
	}

}
