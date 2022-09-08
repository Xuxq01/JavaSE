package homework;

import java.util.Random;

public class Work2 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i <= 25){
                chs[i] = (char)(97 + i);
            }else{
                chs[i] = (char)(65 + i - 26);
            }
        }
        String code = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            code = code + chs[randomIndex];
        }
        int number = r.nextInt(10);
        code = code +number;
        char[] arr = code.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            char t = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = t;
        }
        code = new String(arr);
        System.out.println(code);
    }
}
