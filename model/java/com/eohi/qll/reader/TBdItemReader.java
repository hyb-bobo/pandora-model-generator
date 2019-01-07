package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.TBdItem;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface TBdItemReader extends BaseReader<String, TBdItem> {

}