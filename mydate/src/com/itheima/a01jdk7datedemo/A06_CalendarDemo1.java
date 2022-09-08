package com.itheima.a01jdk7datedemo;

import java.util.Calendar;
import java.util.Date;

public class A06_CalendarDemo1 {
    public static void main(String[] args) {
        //1.获取日历对象
        //细节1:Calendar是一个抽象类,不能直接new,而是通过一个静态方法获取到子类对象
        //底层原理:
        //会根据系统的不同时区来获取不同的日历对象
        //会把当前时间中的纪元,年,月,日,时,分,秒,星期等等的都放到一个数组当中
        //0   :   纪元
        //1   :   年
        //2   :   月
        //3   :   一年中的第几周
        //4   :   一月中的第几周
        //5   :   一月中的第几天(日期)
        //...16
        //细节2:
        //月份:范围0~11,如果获取出来的是0,那么实际上是1月
        //星期:星期日是一周中的第一天
        //1(星期日)  2(星期一) .... 7(星期六)
        Calendar c = Calendar.getInstance();

        //2.修改一下日历代表的时间
        Date d = new Date(0L);
        c.setTime(d);
        System.out.println(c);


        //public int get(int field)
        //public void set(int field,int value)
        //public void add(int field,int amount)

        c.set(Calendar.YEAR,2000);
        c.set(Calendar.MONTH,11);
        c.set(Calendar.DAY_OF_MONTH,10);

        //调用方法在这个基础上加一个月
        c.add(Calendar.MONTH,1);

        //Java在Calendar类中,把索引对应的数字都定义为常量
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + ", " + month + ", " + date + ", " + getWeek(week));
    }
    //传入对应数字: 1~7
    //返回对应星期
    public static String getWeek(int index){
        //定义一个数组,让汉字星期几,跟1~7产生对应关系
        String[] arr = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        //根据索引返回对应的星期
        return arr[index];
    }
}