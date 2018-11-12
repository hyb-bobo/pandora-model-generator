package com.realtech.pandora.templates.dbtools.model.po;

import com.realtech.pandora.templates.dbtools.exception.GeneratorException;
import com.realtech.pandora.templates.dbtools.model.Property;
import com.realtech.pandora.templates.dbtools.model.Table;
import com.realtech.pandora.templates.dbtools.validate.ValidateException;
import com.realtech.pandora.util.TableModelInfoUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/5/4.
 * 把表信息转成json，主键不校验，其他属性都会与对应已经生成的model中的字段来校验
 */
public class TablePo implements ModelInfo {

    private JSONObject tableJsonInfo;

    public TablePo(String tableName, String idDefaultName) throws GeneratorException {
        Map<String, Object> info = TableModelInfoUtil.getTableInfo(tableName, idDefaultName);
        tableJsonInfo = JSONObject.fromObject(info);
    }

    public void addErrColor(List<String> errFields) {
        if(errFields == null || errFields.size() == 0) return;
        JSONArray fields = JSONArray.fromObject(this.tableJsonInfo.get(FIELDS));
        for(int i = 0; i < fields.size(); i++) {
            JSONObject o = fields.getJSONObject(i);
            if(errFields.contains(o.get(MODEL_COLUMN_NAME))) {
                putTableWarnColor(o);
            }
        }
    }

    private void putTableWarnColor(JSONObject o) {
        JSONObject json = new JSONObject();
        json.put(TABLE_COLUMN_NAME, CELL_WARN);
        json.put(TABLE_COLUMN_TYPE, CELL_WARN);
        json.put(MODEL_COLUMN_NAME, CELL_WARN);
        json.put(MODEL_COLUMN_TYPE, CELL_WARN);
        o.put("cellClassName", o);
    }

    public JSONObject getTableJsonInfo() {
        return tableJsonInfo;
    }

}
