package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.TBdCustomer;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface TBdCustomerReader extends BaseReader<String, TBdCustomer> {

}