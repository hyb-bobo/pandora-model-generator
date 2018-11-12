package com.realtech.pandora.templates.dbtools.model;

import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TableHelper {

    private Table table;

    public TableHelper(Table table) {
        this.table = table;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public void addModelAndViewSet(ModelAndView mav) {
        Method[] ms = Table.class.getMethods();
        for (Method m: ms) {
            String key = null;
            if(m.getName().startsWith("get"))
                key = m.getName().substring(3, 4).toLowerCase() + m.getName().substring(4);
            if(m.getName().startsWith("is"))
                key = m.getName().substring(2, 3).toLowerCase() + m.getName().substring(3);
            if(key == null)
                continue;
            try {
                if(key.equals("dbType")) {
                    mav.addObject(key, m.invoke(table, null) + "");
                }else {
                    mav.addObject(key, m.invoke(table, null));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

}
