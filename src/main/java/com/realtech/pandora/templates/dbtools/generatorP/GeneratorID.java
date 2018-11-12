package com.realtech.pandora.templates.dbtools.generatorP;

import com.realtech.pandora.util.OidUtil;

/**
 * Created by lilang on 2018/1/22.
 * 随机生成ID
 */
public class GeneratorID {
    public static void main(String [] args){
        for(int i=0;i<=50;i++){
            System.out.println(OidUtil.newId());
        }
    }
}
