package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.TBdTerminal;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface TBdTerminalReader extends BaseReader<String, TBdTerminal> {

}