package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.T700Product;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface T700ProductReader extends BaseReader<String, T700Product> {

}