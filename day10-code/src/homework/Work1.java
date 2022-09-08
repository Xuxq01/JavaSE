package homework;

import java.util.Random;
import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串");
        String str = sc.next();
        char[] arr = str.toCharArray();
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            char t = arr[i];
            arr[i] = arr[index];
            arr[index] = t;
        }
        str = new String(arr);
        System.out.println(str);
    }
}
