package com.realtech.pandora.templates.dbtools.generatorEnum;

public class EnumGenerator {
    /*
        String zhongwen = "0:复古;1:中式;2:时尚;3:唯美;4:清新;5:华丽;6:田园;7:森系;8:奇幻;9:民族;10:户外";
        String yinwen = "0: Retro; 1: Chinese; 2: Fashion; 3: Aesthetic; 4: Fresh; 5: Gorgeous; 6: Rural; 7: Forest; 8: Fantasy; 9: Ethnic; 10: Outdoor";
    */
    public static void main(String[] args) {
//      -1:全部;0:小时;1:天;2:周;3:月;4:季度;5:年;6:分;7:秒;


          /*保养工单执行流程-状态*/
//        String zhongwen = "0:已制单;1:已派工;2:已取消;3:已过期;4:已换工;5:已通知;6:已拒单;7:已接单;8:已签入;9:执行中;10:缺件暂停;11:已领件;12:已完成;13:已签出;14:已归档;15:已下发;16:已报工";
//        String yinwen = "0:Created; 1:Assigned;2:Canceled; 3:Date changed;4:Executor Changed ;5:Notified ;6:Rejected;7:Accepted ;8:Checked In;9:Executing;10:Pausing;11:Sparepart Getted;12:Completed;13:Checked Out;14:Archieved;15:Dispatched;16:Work Hour Reported";

        /*设备申购流程--设备申购单*/
//        String zhongwen = "0:已制单;1:待审核;2:主管批准;3:主管驳回;4:设备批准;5:设备驳回;6:财务批准;7:财务驳回;8:总经理批准;9:总经理驳回;10:已归档;11:已生效";
//        String yinwen = "0:Created; 1:Waiting Approval;2:ZG_Approval; 3:ZG_Rejected;4:SB_Approval ;5:SB_Rejected ;6:CW_Approval;7:CW_Rejected ;8:ZJL_Approval;9:ZJL_Rejected;10:Archieved;11:Taking Effected";

        /*设备采购申请表  --  单据类型：*/
//        String zhongwen = "0:保养备件申领单;1:点检备件申领单;2:维修备件申领单;3:设备采购申请单;4:设备预验收单;5:设备验收单;6:设备改造申请单;7:设备报废申请单";
//        String yinwen = "0:Maintenance Spare Part Application Form; 1:Check Spare Part Application Form;2:Reparation Spare Part Application Form; 3:Equipment Purchase Application Form;4:Equipment Previous Examine Form;5:Equipment Examine Form;6:Equipment Modification Application Form;7:Equipment Scrapping Application Form";
         /*设备采购申请表  --  单据状态：*/
//        String zhongwen = "0:已制单;1:待审核;2:OA审核中;3:OA已批准;4:OA已驳回;5:已生效;6:已作废";
//        String yinwen = "0:Created; 1:Waiting Approval;2:OA Approving; 3:OA Approved;4:OA Rejected ;5:Taking Effected ;6:Deprecated";

        String zhongwen = "3:保养备件退料单; 4:维修备件退料单";
        String yinwen = "3: maintenance spare parts return sheet; 4: repair spare parts return sheet";
        zhongwen = zhongwen.replace("：", ":");
        zhongwen = zhongwen.replace("；", ";");
        String[] zhongwens = zhongwen.split(";");
        String[] yinwens = yinwen.split(";");

        for (int i = 0; i < zhongwens.length; i++) {
            //Agents(0, "Agents", "代理商"),
            String yin_ = yinwens[i].split(":")[1].trim();
            yin_ = yin_.replace(" ","_");
            String zhong_ = zhongwens[i].split(":")[1].trim();
            System.out.println(yin_.toUpperCase() + " (" + i + ", \"" + yin_ + "\", \"" + zhong_ + "\"),");
        }


    }



}
