package com.realtech.pandora.templates.dbtools.model;

import java.util.ArrayList;
import java.util.List;

import com.realtech.pandora.templates.dbtools.Config;
import com.realtech.pandora.util.PropertiesUtil;
import com.realtech.pandora.util.StringUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * 该类包含表的相关信息、对应的类的相关信息、表中属性的相关信息
 */
public class Table {

	private String tableName;
	private String primaryKey;/*主键*/
	private String primaryKeyType;/*主键类型 数据库*/
	private String primaryKeyClassType;/*主键类型 java*/
	private String className;
	private List<Property> genPropertyList;
	/*公共字段的集合*/
	private static List<Property> publicPropertyList;
	/*特殊字段*/
	private String dr = TableSet.dr;
	private String dataVersion = TableSet.dataVersion;
    /*数据库类型*/
    private int dbType = Config.dbType;

    /*是否自增*/
    private boolean autoIncrementIdConfig = false;

    /*逻辑删除标志位*/
    private String deleteFlagStr;

	static {
	    /*初始化加载公共字段*/
        publicPropertyList = new ArrayList<>();
        if(!StringUtils.isEmpty(TableSet.createAt))
            publicPropertyList.add(new Property(TableSet.createAt, StringUtil.toLowerCamelCase(TableSet.createAt)));
        if(!StringUtils.isEmpty(TableSet.createBy))
            publicPropertyList.add(new Property(TableSet.createBy, StringUtil.toLowerCamelCase(TableSet.createBy)));
        if(!StringUtils.isEmpty(TableSet.updateAt))
            publicPropertyList.add(new Property(TableSet.updateAt, StringUtil.toLowerCamelCase(TableSet.updateAt)));
        if(!StringUtils.isEmpty(TableSet.updateBy))
            publicPropertyList.add(new Property(TableSet.updateBy, StringUtil.toLowerCamelCase(TableSet.updateBy)));
        if(!StringUtils.isEmpty(TableSet.deleteAt))
            publicPropertyList.add(new Property(TableSet.deleteAt, StringUtil.toLowerCamelCase(TableSet.deleteAt)));
        if(!StringUtils.isEmpty(TableSet.deleteBy))
            publicPropertyList.add(new Property(TableSet.deleteBy, StringUtil.toLowerCamelCase(TableSet.deleteBy)));
        if(!StringUtils.isEmpty(TableSet.dr))
            publicPropertyList.add(new Property(TableSet.dr, StringUtil.toLowerCamelCase(TableSet.dr)));
        if(!StringUtils.isEmpty(TableSet.dataVersion))
            publicPropertyList.add(new Property(TableSet.dataVersion, StringUtil.toLowerCamelCase(TableSet.dataVersion)));

    }

	public List<Property> getPropertyList() {
		return genPropertyList;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Property> getGenPropertyList() {
		return genPropertyList;
	}

	public String getPrimaryKeyType() {
		return primaryKeyType;
	}

	public void setPrimaryKeyType(String primaryKeyType) {
		this.primaryKeyType = primaryKeyType;
	}

    public String getPrimaryKeyClassType() {
        return primaryKeyClassType;
    }

    public void setPrimaryKeyClassType(String primaryKeyClassType) {
        this.primaryKeyClassType = primaryKeyClassType;
    }

    public void setGenPropertyList(List<Property> genPropertyList) {
		this.genPropertyList = genPropertyList;
	}

	public Object getModelResultMap() {
		return StringUtil.toLowerCaseFristOne(getClassName()) + "ResultMap";
	}

	public String getPrimaryKeyJavaField() {
		return StringUtil.toLowerCamelCase(primaryKey);
	}

	public String getPrimaryKeyJava() {
		return StringUtil.toUpperCamelCase(primaryKey);
	}

    public boolean isAutoIncrementIdConfig() {
        return autoIncrementIdConfig;
    }

    public void setAutoIncrementIdConfig(boolean autoIncrementIdConfig) {
        this.autoIncrementIdConfig = autoIncrementIdConfig;
    }

    public String getDeleteFlagStr() {
	    if(deleteFlagStr == null) {
	        if(StringUtil.isNullorEmpty(dr))
                deleteFlagStr = "@DeleteFlag(flag = false)";
	        else
                deleteFlagStr = "@DeleteFlag(flag = true)";
        }
        return deleteFlagStr;
    }

    public void setDeleteFlagStr(String deleteFlagStr) {
        this.deleteFlagStr = deleteFlagStr;
    }

    public List<String> getImportList() {
		List<String> importList = new ArrayList<String>();
		boolean importedDate = false;
		boolean importedBigDecimal = false;
		for (Property genProperty : getGenPropertyList()) {
			if (!importedDate && "Date".equals(genProperty.getPropertyType())) {
				importedDate = true;
				importList.add("java.util.Date");
			} else if (!importedBigDecimal && "BigDecimal".equals(genProperty.getPropertyType())) {
				importedBigDecimal = true;
				importList.add("java.math.BigDecimal");
			}
		}
		return importList;
	}

    public List<Property> getPublicPropertyList() {
        return publicPropertyList;
    }

    public void setPublicPropertyList(List<Property> publicPropertyList) {
        this.publicPropertyList = publicPropertyList;
    }

    public String getDr() {
        return dr;
    }
    public String getPropertiesDr() {
        return StringUtil.toLowerCamelCase(dr);
    }

    public void setDr(String dr) {
        this.dr = dr;
    }

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public int getDbType() {
        return dbType;
    }

    public void setDbType(int dbType) {
        this.dbType = dbType;
    }

    /**
     * insert  值
     * @return
     */
    public String getInsertPublicPropertiesVal() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < publicPropertyList.size(); i++) {
            if(publicPropertyList.get(i).getPropertyName().equals(TableSet.deleteAt) || publicPropertyList.get(i).getPropertyName().equals(TableSet.deleteBy)) {
                continue;
            }
            if(i > 0) {
                sb.append("\n\t\t\t");
            }
            if(publicPropertyList.get(i).getPropertyName().equals(StringUtil.toLowerCamelCase(TableSet.dr))) {
                sb.append("0");
            }else if(publicPropertyList.get(i).getPropertyName().equals(StringUtil.toLowerCamelCase(TableSet.dataVersion))) {
                sb.append("1");
            }else {
                sb.append("#{").append(publicPropertyList.get(i).getPropertyName()).append("}");
            }
            sb.append(",");
        }
        String result = sb.toString();
        if(result.length() > 0) {
            result = sb.subSequence(0, sb.lastIndexOf(",")).toString();
        }
        return result;
    }

    /**
     * insert
     * 公共字段-Model列名
     * @return
     */
    public String getInsertPublicProperties() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < publicPropertyList.size(); i++) {
            if(publicPropertyList.get(i).getPropertyName().equals(TableSet.deleteAt) || publicPropertyList.get(i).getPropertyName().equals(TableSet.deleteBy))
                continue;
            if(i > 0) {
                sb.append("\n\t\t\t");
            }
            sb.append(publicPropertyList.get(i).getPropertyName());
            sb.append(",");
        }
        String result = sb.toString();
        if(result.length() > 0) {
            result = sb.subSequence(0, sb.lastIndexOf(",")).toString();
        }
        return result;
    }

    /**
     * 公共字段-Table列名
     * @return
     */
    public String getInsertPublicTableProperties() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < publicPropertyList.size(); i++) {
            if(publicPropertyList.get(i).getPropertyName().equals(TableSet.deleteAt) || publicPropertyList.get(i).getPropertyName().equals(TableSet.deleteBy))
                continue;
            if(i > 0) {
                sb.append("\n\t\t\t");
            }
            sb.append(publicPropertyList.get(i).getTablePropertyName());
            sb.append(",");
        }
        String result = sb.toString();
        if(result.length() > 0) {
            result = sb.subSequence(0, sb.lastIndexOf(",")).toString();
        }
        return result;
    }

    /**
     * update DataVersion sql语句(dr=0)
     * @return
     *          updateAt = ${"#"}{updateAt},
                updateBy = ${"#"}{updateBy},
     */
    public String getUpdateSqlDr0() {
        StringBuilder sb = new StringBuilder();
        if(!StringUtils.isEmpty(TableSet.updateAt))
            sb.append(TableSet.updateAt).append(" = #{").append(StringUtil.toLowerCamelCase(TableSet.updateAt)).append("},");
        if(!StringUtils.isEmpty(TableSet.updateBy)) {
            if(sb.length() > 0) sb.append("\n\t\t\t");
            sb.append(TableSet.updateBy).append(" = #{").append(StringUtil.toLowerCamelCase(TableSet.updateBy)).append("},");
        }
        return sb.toString();
    }

    /**
     * update DataVersion sql语句(dr=1)
     * @return
     *          updateAt = ${"#"}{updateAt},
                updateBy = ${"#"}{updateBy},
     */
    public String getUpdateSqlDr1() {
        StringBuilder sb = new StringBuilder();
        if(!StringUtils.isEmpty(TableSet.updateAt))
            sb.append(TableSet.updateAt).append(" = #{").append(StringUtil.toLowerCamelCase(TableSet.updateAt)).append("},");
        if(!StringUtils.isEmpty(TableSet.updateBy)) {
            if(sb.length() > 0) sb.append("\n\t\t\t");
            sb.append(TableSet.updateBy).append(" = #{").append(StringUtil.toLowerCamelCase(TableSet.updateBy)).append("},");
        }
        if(!StringUtils.isEmpty(TableSet.deleteAt)) {
            if(sb.length() > 0) sb.append("\n\t\t\t");
            sb.append(TableSet.deleteAt).append(" = #{").append(StringUtil.toLowerCamelCase(TableSet.deleteAt)).append("},");
        }
        if(!StringUtils.isEmpty(TableSet.deleteBy)) {
            if(sb.length() > 0) sb.append("\n\t\t\t");
            sb.append(TableSet.deleteBy).append(" = #{").append(StringUtil.toLowerCamelCase(TableSet.deleteBy)).append("},");
        }
        if(!StringUtils.isEmpty(TableSet.dr)) {
            if(sb.length() > 0) sb.append("\n\t\t\t");
            sb.append(TableSet.dr).append(" = 1,");
        }
        return sb.toString();
    }

    /**
     * update DataVersion sql语句(dr=1)
     * @return
     *          data_version = data_version + 1
     */
    public String getUpdateDataVersionSql() {
        return dataVersion + " = " + dataVersion + " + 1";
    }

}
