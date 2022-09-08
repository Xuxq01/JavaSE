package com.itheima.test4;

import java.util.Scanner;

public class MoneyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("请输入金额:"));
        int money = sc.nextInt();
        while(true){
            if (money >= 0 && money <= 9999999){
                break;
            }else{
                System.out.println("金额无效");
            }
        }
        System.out.println(money);

        String numCapital = new String();
        while(true){
            int ge = money % 10;
            money /= 10;
            numCapital = getCapitalNumber(ge) + numCapital;
            if(money == 0){
                break;
            }
        }
        int count = 7 - numCapital.length();
        for(int i = 0; i < count; i++){
            numCapital = "零" + numCapital;
        }
        System.out.println(numCapital);

        String[] arr = {"佰","拾","万","仟","佰","拾","元"};

        String result = "";

        for(int i = 0; i < numCapital.length(); i++){
            char c = numCapital.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);
    }


    public static String getCapitalNumber(int number){
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","扒","玖"};
        return arr[number];
    }

}
