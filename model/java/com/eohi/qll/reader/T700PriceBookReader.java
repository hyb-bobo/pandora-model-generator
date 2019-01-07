package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.T700PriceBook;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface T700PriceBookReader extends BaseReader<String, T700PriceBook> {

}