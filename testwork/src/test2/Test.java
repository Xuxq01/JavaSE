package test2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("-----欢迎来到通讯录-----");
        System.out.println("---1.添加     2.删除---");
        System.out.println("---3.修改     4.查询---");
        System.out.println("---5.备注     6.退出---");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String choose = sc.next();
            switch(choose){
                case "1" -> System.out.println("添加");
                case "2" -> System.out.println("删除");
                case "3" -> System.out.println("修改");
                case "4" -> System.out.println("查询");
                case "5" -> System.out.println("备注");
                case "6" -> System.exit(0);
                default -> System.out.println("没有这个选项,请重新选择");
            }
        }
    }
}
