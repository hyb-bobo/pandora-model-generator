package com.realtech.pandora.templates.dbtools.generatorEnum;

/**
 * Created by admin on 2018/5/18.
 */
public class MakeCommonEnum {
    public static final String[] fieldToAdd = new String[]{
            "TEamSparePartReturnStatusEnum", "备件退料-状态"


};

    public static void main(String[] args) {

        for (int i=0;i<fieldToAdd.length;i+=2){
            getEnum(fieldToAdd[i],fieldToAdd[i+1]);
            System.out.println("-----------------***************************************-------------------------");
            System.out.println("-----------------***************************************-------------------------");
        }


    }

    public static void getEnum(String keyName , String keyNameExplain) {

        System.out.println();
        System.out.println("================================enum.js=============================");
        System.out.println();
        System.out.println(toLowerCaseFirstOne(keyName)+"\t\t\t\t\t:[],/*"+keyNameExplain+"*/");

        System.out.println();

        System.out.println("|| base_info."+toLowerCaseFirstOne(keyName)+".length == 0");
        System.out.println();
        System.out.println("================================CommonController.java===============================");
        System.out.println();

        System.out.println("/*"+keyNameExplain+"*/");
        System.out.println("obj.put(\""+toLowerCaseFirstOne(keyName)+"\","+keyName+".toJsonArr());");
        System.out.println();

        String anEnum = keyName.substring(0, keyName.indexOf("Enum"));
        anEnum = toLowerCaseFirstOne(anEnum);
        System.out.println("@ApiOperation(value = \""+keyNameExplain+"\")");
        System.out.println("@RequestMapping(value = "+""+"\"/"+anEnum+"\", method = RequestMethod.GET)");
        System.out.println("public @ResponseBody");
        System.out.print("JSONObject "+anEnum+"(){");
        System.out.println("return RCode.returnSUCCESS("+keyName+".toJsonArr());}");
        System.out.println();

    }

    public static String toLowerCaseFirstOne(String s){
        if(Character.isLowerCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
    }

}
