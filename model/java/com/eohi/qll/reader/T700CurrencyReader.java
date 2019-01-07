package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.T700Currency;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface T700CurrencyReader extends BaseReader<String, T700Currency> {

}