package com.realtech.pandora.web;

import com.realtech.pandora.service.SysDatabaseService;
import com.realtech.pandora.templates.dbtools.Config;
import com.realtech.pandora.templates.dbtools.exception.GeneratorException;
import com.realtech.pandora.templates.dbtools.generator.Main;
import com.realtech.pandora.templates.dbtools.model.Table;
import com.realtech.pandora.templates.dbtools.model.TableHelper;
import com.realtech.pandora.templates.dbtools.model.db.DBManager;
import com.realtech.pandora.util.StringUtil;
import freemarker.template.TemplateException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class IndexController {

    private final Logger log = Logger.getLogger(IndexController.class);

    @Autowired private SysDatabaseService sysDatabaseService;

    @RequestMapping("/")
    public ModelAndView home(HttpServletRequest req) {
        ModelAndView mav = new ModelAndView("html/index");
        /*所有库名字*/
        List<String> allDataBaseL = sysDatabaseService.queryAllDataBases();
        mav.addObject("allDataBaseL", allDataBaseL);
        mav.addObject("autoIncrementIdSet", Config.autoIncrementIdSet);
        mav.addObject("basePackage", Config.basePackage);

        if(req.getParameter("db") != null) {
            String oldDB = DBManager.getDataBaseName();
            /*当前库*/
            DBManager.changeDataBase(req.getParameter("db"));
            /*防止库无效*/
            if(DBManager.getInstance().queryAllTableNames().size() < 1) {
                DBManager.changeDataBase(oldDB);
            }
        }
        mav.addObject("dataBaseName", DBManager.getDataBaseName());

        Table table;
        String tableName;
        if(req.getParameter("tableName") == null) {
            tableName = DBManager.getInstance().queryAllTableNames().get(0);
        }else {
            tableName = req.getParameter("tableName");
            if(Config.generatorFile) {
                try {
                    Main.genertaor(tableName);
                } catch (GeneratorException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (TemplateException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            table = DBManager.getInstance().queryTables(tableName);
            TableHelper helper = new TableHelper(table);
            helper.addModelAndViewSet(mav);
        } catch (GeneratorException e) {
            log.error(e);
            return mav;
        }
        return mav;
    }

    @RequestMapping(value = "/requireTableNames", method = RequestMethod.POST)
    public @ResponseBody Object database(@RequestParam("db")String db,@RequestParam("name")String name) {
        List<String> tableNames;
        if(StringUtil.isNullorEmpty(db))
            return new JSONArray();
        if(StringUtil.isNullorEmpty(name)) {
           tableNames = DBManager.getInstance().queryAllTableNames();
        }else {
            tableNames = DBManager.getInstance().queryTableName(name);
        }
        return JSONArray.fromObject(tableNames);
    }

    @RequestMapping(value = "/changeAutoIncrementIdSet", method = RequestMethod.POST)
    public @ResponseBody Object changeAutoIncrementIdSet(@RequestParam("set")String set) {
        log.info("Auto Increment Id Set [" + Config.autoIncrementIdSet + "] change to [" + set + "]");
        return Config.autoIncrementIdSet = set;
    }

    @RequestMapping(value = "/modelStyle/pamdora", method = RequestMethod.GET)
    public @ResponseBody Object modelPandora() {
        JSONObject json = new JSONObject();
        json.put("dr", "delete_flag");
        json.put("dataVersion", "data_version");
        json.put("createAt", "create_at");
        json.put("createBy", "create_by");
        json.put("updateAt", "update_at");
        json.put("updateBy", "update_by");
        json.put("deleteAt", "delete_at");
        json.put("deleteBy", "delete_by");
        sysDatabaseService.changeModelStyle("delete_flag", "data_version", "create_at", "create_by", "update_at", "update_by", "delete_at", "delete_by");
        log.info("set pandora model style.");
        return json;
    }

    @RequestMapping(value = "/modelStyle/bd", method = RequestMethod.GET)
    public @ResponseBody Object modelBd() {
        JSONObject json = new JSONObject();
        json.put("dr", "");
        json.put("dataVersion", "");
        json.put("createAt", "");
        json.put("createBy", "");
        json.put("updateAt", "");
        json.put("updateBy", "");
        json.put("deleteAt", "");
        json.put("deleteBy", "");
        sysDatabaseService.changeModelStyle("", "", "", "", "", "", "", "");
        log.info("set bd model style.");
        return json;
    }

}
