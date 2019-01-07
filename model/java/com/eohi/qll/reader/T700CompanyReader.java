package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.T700Company;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface T700CompanyReader extends BaseReader<String, T700Company> {

}