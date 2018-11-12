package com.realtech.pandora.templates.dbtools.model.po;

import com.realtech.pandora.templates.dbtools.Config;
import com.realtech.pandora.templates.dbtools.model.Table;
import com.realtech.pandora.templates.dbtools.model.TypeEnum;
import com.realtech.pandora.templates.dbtools.validate.ValidateException;
import com.realtech.pandora.util.TableModelInfoUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Jjz on 2017/5/6.
 */
public class ModelPo implements ModelInfo{

    private JSONObject modelJsonInfo;
    private List<String> modelClumnL;
    private final Logger log = Logger.getLogger(ModelPo.class);

    public ModelPo(Table table) throws ValidateException {
        String javaPath = Config.basePackage + ".model." +  table.getClassName();
        Map<String, Object> info = TableModelInfoUtil.getModelInfo(javaPath);
        modelJsonInfo = JSONObject.fromObject(info);
        modelClumnL = (ArrayList<String>)info.get(FIELDS);
    }

    public void addErrColor(List<String> errFields) {
        if(errFields == null || errFields.size() == 0) return;
        JSONArray fields = JSONArray.fromObject(this.modelJsonInfo.get(FIELDINFOS));
        for(int i = 0; i < fields.size(); i++) {
            JSONObject o = fields.getJSONObject(i);
            if(errFields.contains(o.get(MODEL_COLUMN_NAME))) {
                putTableWarnColor(o);
            }
        }
    }

    private void putTableWarnColor(JSONObject o) {
        JSONObject json = new JSONObject();
        json.put(MODEL_COLUMN_NAME, CELL_WARN);
        json.put(MODEL_COLUMN_TYPE, CELL_WARN);
        o.put("cellClassName", o);
    }

    public JSONObject getModelJsonInfo() {
        return modelJsonInfo;
    }

    public List<String> getModelClumnL() {
        return modelClumnL;
    }

    public static void main(String[] args) throws ValidateException {
        Table table = new Table();
        table.setClassName("Company");
        ModelPo modelPo = new ModelPo(table);
        System.out.println(modelPo.getModelClumnL());
        System.out.println(modelPo.getModelJsonInfo());
    }
}
