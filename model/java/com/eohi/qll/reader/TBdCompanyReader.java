package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.TBdCompany;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface TBdCompanyReader extends BaseReader<String, TBdCompany> {

}