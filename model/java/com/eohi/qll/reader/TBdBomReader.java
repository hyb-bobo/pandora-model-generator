package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.TBdBom;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface TBdBomReader extends BaseReader<String, TBdBom> {

}