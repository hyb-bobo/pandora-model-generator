package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.TBdPosition;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface TBdPositionReader extends BaseReader<String, TBdPosition> {

}