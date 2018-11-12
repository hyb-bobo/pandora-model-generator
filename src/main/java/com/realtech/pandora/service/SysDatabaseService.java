package com.realtech.pandora.service;

import com.realtech.pandora.templates.dbtools.model.TableSet;
import com.realtech.pandora.templates.dbtools.model.db.DBBase;
import com.realtech.pandora.templates.dbtools.model.db.DBManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysDatabaseService {

    private DBBase dbBase = DBManager.getInstance();

    public List<String> queryAllDataBases() {
        return dbBase.queryAllDataBases();
    }

    public void changeModelStyle(String dr, String dataVersion, String createAt, String createBy, String updateAt, String updateBy, String deleteAt, String deleteBy) {
        TableSet.dr = dr;
        TableSet.dataVersion = dataVersion;
        TableSet.createAt = createAt;
        TableSet.createBy = createBy;
        TableSet.updateAt = updateAt;
        TableSet.updateBy = updateBy;
        TableSet.deleteAt = deleteAt;
        TableSet.deleteBy = deleteBy;
    }

}
