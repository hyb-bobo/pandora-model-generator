package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.TBdSparePart;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface TBdSparePartReader extends BaseReader<String, TBdSparePart> {

}