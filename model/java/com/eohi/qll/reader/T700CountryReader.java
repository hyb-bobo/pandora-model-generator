package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.T700Country;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface T700CountryReader extends BaseReader<String, T700Country> {

}