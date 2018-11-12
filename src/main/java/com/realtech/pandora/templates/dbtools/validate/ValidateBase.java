package com.realtech.pandora.templates.dbtools.validate;

import com.realtech.pandora.templates.dbtools.Config;
import com.realtech.pandora.templates.dbtools.model.Property;
import com.realtech.pandora.templates.dbtools.model.Table;
import com.realtech.pandora.templates.dbtools.model.TypeEnum;
import com.realtech.pandora.templates.dbtools.model.po.ModelPo;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/5/5.
 */
public class ValidateBase {

    private final String MODEL_JAVA = "modelJava";
    private final String READER_JAVA = "readerJava";
    private final String WRITER_JAVA = "writerJava";
//    private final String READER_XML = "readerXml";
//    private final String WRITER_XML = "writerXml";
//    private final String SERVICE = "service";
//    private final String SERVICEIMPL = "serviceImpl";

    private Map<String, String> modelFilePathModel = new HashMap<>();
    private Table table;
    private ModelPo modelPo;

    private Logger log = Logger.getLogger(ValidateBase.class);

    private ValidateBase() {}

    private static ValidateBase me;

    public static ValidateBase getInstance(Table table, ModelPo modelPo) {
        if(me == null) me = new ValidateBase();
        me.table = table;
        me.modelPo = modelPo;
        return me;
    }


    /**
     * 校验类文件或者xml文件是否存在，现在只能校验java文件
     * @throws ValidateException
     */
    public void validateAllFiles() throws ValidateException{
        modelFilePathModel.put(MODEL_JAVA,  Config.basePackage + ".model." +  table.getClassName());
        modelFilePathModel.put(READER_JAVA,  Config.basePackage + ".reader." +  table.getClassName() + "Reader");
        modelFilePathModel.put(WRITER_JAVA,  Config.basePackage + ".writer." +  table.getClassName() + "Writer");
//        modelFilePathModel.put(SERVICE,  Config.basePackage + ".service." +  table.getClassName() + "Service");
//        modelFilePathModel.put(SERVICEIMPL,  Config.basePackage + ".service.impl." +  table.getClassName() + "ServiceImpl");
    }

    /**
     * 校验table与model，返回错误字段的名字
     * @return
     * @throws ValidateException
     */
    public Map<String, List<String>> validateTableModel() throws ValidateException {
        Map<String, List<String>> result = new HashMap<>();
        /*把表里面所有转换成java的字段整合*/
        List<String> tablePropertiesL = new ArrayList<>();
        List<String> tableErrPropertiesL = new ArrayList();
        List<String> javaErrPropertiesL = new ArrayList();
        for(Property property: table.getGenPropertyList()) {
            String javaCluName = property.getPropertyName(); //table中转换成java model的字段的名称
            tablePropertiesL.add(javaCluName);
        }
        /*校验javaModel里面的字段*/
        for(int i = 0; i < modelPo.getModelClumnL().size(); i++) {
            String javaModelCluName = modelPo.getModelClumnL().get(i);
            if (!tablePropertiesL.contains(javaModelCluName)) {
                javaErrPropertiesL.add(javaModelCluName);
            }
        }
        /*校验表中的字段*/
        for(String javaCluName: tablePropertiesL) {
            if(!modelPo.getModelClumnL().contains(javaCluName))
                tableErrPropertiesL.add(javaCluName);
        }

        result.put("tableErr", tableErrPropertiesL);
        result.put("modelErr", javaErrPropertiesL);
        return result;
    }

    private String validateJavaFile(String javaPath) throws ValidateException {
        try {
            Class.forName(javaPath).newInstance();
        } catch (InstantiationException e) {
            log.error(e);
            throw new ValidateException(e.getMessage());
        } catch (IllegalAccessException e) {
            log.error(e);
            throw new ValidateException(e.getMessage());
        } catch (ClassNotFoundException e) {
            log.error(e);
            throw new ValidateException("没有相关类文件: " + javaPath);
        }
        return javaPath;
    }



    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> baseModelClass = Class.forName("com.realtech.pandora.model.Company");
        while(!baseModelClass.getSimpleName().equals("Object")){
            System.out.println(baseModelClass);
            System.out.println(baseModelClass.getSimpleName() + "-=-----------------------");
            Field[] dd = baseModelClass.getDeclaredFields();
            for(Field f: dd) {
                if(TypeEnum.existJavaType(f.getType().getSimpleName()))
                    System.out.println(f.getName());
            }
            baseModelClass = baseModelClass.getSuperclass();
        }
    }
}
