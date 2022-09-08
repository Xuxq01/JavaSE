package com.itheima.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A05_SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        //比较两个时间
        //下单并付款的时间 跟 开始时间 和 结束时间
        //1.定义字符串表示三个时间
        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String orderStr = "2023年11月11日 0:01:00";

        //2.解析上面三个时间,得到Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);
        Date orderDate = sdf.parse(orderStr);

        //3.得到三个时间的毫秒值
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime = orderDate.getTime();

        //4.判断
        if(orderTime >= startTime && orderTime <= endTime){
            System.out.println("参加秒杀活动成功");
        }else{
            System.out.println("参加秒杀活动失败");
        }
    }
}
