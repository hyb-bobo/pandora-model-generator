package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.TBdCountry;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface TBdCountryReader extends BaseReader<String, TBdCountry> {

}