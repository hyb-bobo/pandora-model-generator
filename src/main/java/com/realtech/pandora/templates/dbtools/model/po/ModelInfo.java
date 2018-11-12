package com.realtech.pandora.templates.dbtools.model.po;

/**
 * Created by Jjz on 2017/5/6.
 */
public interface ModelInfo {

    String TABLE_NAME = "tableName";
    String CLASS_NAME = "className";
    String FIELDINFOS = "fieldInfos";
    String FIELDS = "fields";

    String TABLE_COLUMN_NAME = "tableColumnName";
    String TABLE_COLUMN_TYPE = "tableColumnType";
    String MODEL_COLUMN_NAME = "modelColumnName";
    String MODEL_COLUMN_TYPE = "modelColumnType";

    /**
     * 前段css样式
     */
    String CELL_WARN = "warn-cell";                     //具体的字段存在错误 颜色警告css样式
    String MENU_WARN = "menu-item menu-item-warn";      //表model对应存在错误，左边的列表颜色警告css样式
    String MENU_NORM = "menu-item";                     //表model对应正常


}
