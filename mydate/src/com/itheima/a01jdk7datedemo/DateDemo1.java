package com.itheima.a01jdk7datedemo;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        /*public Date()
        public Date(long date)


        public void setTime(long time)
        public long getTime()
        */

        //1.创建对象表示一个时间
        Date d1 = new Date();
        System.out.println(d1);

        //2.创建对象表示一个指定的时间
        Date d2 = new Date(0L);
        System.out.println(d2);

        //3.setTime修改时间
        d2.setTime(1000L);//1000毫秒,即一秒钟
        System.out.println(d2);

        //4.getTime获取当前时间的毫秒值
        long time = d2.getTime();
        System.out.println(time);
    }
}
