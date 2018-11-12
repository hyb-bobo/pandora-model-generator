package ${basePackage}.reader;

import org.springframework.stereotype.Repository;

import ${basePackage}.model.${className};
import ${basePackage}.reader.base.BaseReader;

@Repository
public interface ${className}Reader extends BaseReader<${primaryKeyClassType}, ${className}> {

}