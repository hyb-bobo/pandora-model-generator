package com.realtech.pandora.templates.dbtools.model.db;

import com.realtech.pandora.templates.dbtools.Config;
import org.apache.log4j.Logger;

import java.sql.DriverManager;

/**
 * Created by admin on 2017/4/25.
 */
public class DBManager {

    private static final Logger log = Logger.getLogger(DBManager.class);

    private final static DBSqlServer DBSQLSERVER = new DBSqlServer();
    private final static DBMysql DBMYSQL = new DBMysql();

    public static DBBase getInstance() {
        DBBase db = null;
        switch (Config.dbType) {
            case 1: break;
            case 2: db = DBMYSQL;break;
            case 3: db = DBSQLSERVER;break;
            default: break;
        }
        db.setDriverName(Config.driverName);
        db.setSqlUrl(Config.sqlUrl);
        db.setSqlUser(Config.sqlUser);
        db.setSqlPassword(Config.sqlPassword);
        try {
            Class.forName(db.getDriverName());
            db.setConn(DriverManager.getConnection(db.getSqlUrl(), db.getSqlUser(), db.getSqlPassword()));
        } catch (Exception e) {
            throw new Error(e);
        }
        return db;
    }

    /**
     * 改变链接的数据库
     * @param dataBase
     */
    public static void changeDataBase(String dataBase) {
        //jdbc:jtds:sqlserver://192.168.200.210:1433/RTMIOT_0714
        DBBase db = getInstance();
        String oldSqlUrl = db.getSqlUrl();
        String newSqlUrl = oldSqlUrl.substring(0, oldSqlUrl.lastIndexOf("/") + 1) +  dataBase;
        log.info("[" + oldSqlUrl + "] change to [" + newSqlUrl + "]");
//        db.setSqlUrl(newSqlUrl);
        Config.sqlUrl = newSqlUrl;
    }

    public static String getDataBaseName() {
        return getInstance().getSqlUrl().substring(getInstance().getSqlUrl().lastIndexOf("/") + 1);
    }

}
