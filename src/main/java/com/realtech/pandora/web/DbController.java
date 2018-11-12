package com.realtech.pandora.web;

import com.realtech.pandora.templates.dbtools.exception.GeneratorException;
import com.realtech.pandora.templates.dbtools.model.Table;
import com.realtech.pandora.templates.dbtools.model.db.DBBase;
import com.realtech.pandora.templates.dbtools.model.db.DBManager;
import com.realtech.pandora.templates.dbtools.model.po.ModelInfo;
import com.realtech.pandora.templates.dbtools.model.po.ModelPo;
import com.realtech.pandora.templates.dbtools.model.po.TablePo;
import com.realtech.pandora.templates.dbtools.validate.ValidateBase;
import com.realtech.pandora.templates.dbtools.validate.ValidateException;
import com.realtech.pandora.util.TableModelInfoUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/5/3.
 */
@RestController
@RequestMapping("/dbGenerator/api")
public class DbController {

    private final Logger log = LoggerFactory.getLogger(DbController.class);

    @RequestMapping("/allTableNames")
    public Object allTableNames() {
        log.info("enter /dbGenerator/api/allTableNames");
        DBBase dbTool = DBManager.getInstance();
        List<String> tableNames = dbTool.queryAllTableNames();
        JSONArray arr = new JSONArray();
        //遍历表名列表

        for(String tableName: tableNames) {
            JSONObject obj = new JSONObject();
            try {
                Table table = dbTool.queryTable(tableName);
                /*java model 所有字段名字*/
                List<String> javaModelFiels = TableModelInfoUtil.getModelFieldsFromModelName(table.getClassName());
                Collections.sort(javaModelFiels);
                /*table 所有字段转换成java model之后的字段*/
                List<String> tableFields = TableModelInfoUtil.getTableFields(tableName, "id");
                Collections.sort(tableFields);
                obj.put("tableName", tableName);
                if(javaModelFiels.equals(tableFields)) {
                    obj.put("className", ModelInfo.MENU_NORM);
                }else {
                    obj.put("className", ModelInfo.MENU_WARN);
                }
            } catch (ValidateException e) {
                log.error(e.getMessage(), e);
                obj.put("tableName", tableName);
                obj.put("className", ModelInfo.MENU_WARN);
            } catch (GeneratorException e) {
                log.error(e.getMessage(), e);
                obj.put("tableName", tableName + "[无主键]");
                obj.put("className", ModelInfo.MENU_WARN);
            } finally {
                arr.add(obj);
            }
        }

        return arr;
    }

    /**
     *
     * @param tableName
     * @return {status:0(失败),1(成功)}
     */
    @RequestMapping("{tableName}/tableInfo")
    public Object getTableInfo(@PathVariable("tableName") String tableName) {
        log.info("enter /dbGenerator/api/" + tableName + "/getTableInfo");
        JSONObject json = new JSONObject();
        DBBase dbTool = DBManager.getInstance();
        try {
            Table table = dbTool.queryTable(tableName);
            if(table == null) {
                json.put("status", 0);
                json.put("msg", "没有查到表");
            }
            json.put("status", 1);
            TablePo tablePo = new TablePo(tableName, "id");
            json.put("tableInfo", tablePo.getTableJsonInfo());
            /*校验*/
            ModelPo modelPo = new ModelPo(table);
            ValidateBase validate = ValidateBase.getInstance(table, modelPo);
            validate.validateAllFiles();
            Map<String, List<String>> errResult = validate.validateTableModel();
            tablePo.addErrColor(errResult.get("tableErr"));
            modelPo.addErrColor(errResult.get("modelErr"));
            json.put("modelInfo", modelPo.getModelJsonInfo());
        } catch (ValidateException e) {
            json.put("status", 2);
            json.put("msg", "没有生成对应Model");
        } catch (GeneratorException e) {
            json.put("status", 3);
            json.put("msg", "表错误：无主键");
        }
        return json;
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("aa");
        a.add("bb");
        a.add("cc");
        List<String> b = new ArrayList<>();
        b.add("bb");
        b.add("aa");
        b.add("aa");
        b.add("cc");

        Collections.sort(a);
        Collections.sort(b);

        System.out.println(a.equals(b));
    }


}
