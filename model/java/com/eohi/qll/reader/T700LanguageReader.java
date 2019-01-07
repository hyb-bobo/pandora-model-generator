package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.T700Language;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface T700LanguageReader extends BaseReader<String, T700Language> {

}