package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.TBdWarehouse;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface TBdWarehouseReader extends BaseReader<String, TBdWarehouse> {

}