/*

public class RandomTest {
    public static void main(String[] args) {
        char[] arr = new char[52];
        String result = "";
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            if(i < 26){
                arr[i] = (char)(97 + i);
            }else{
                arr[i] = (char)(65 + i - 26);
            }
        }
        for (int i = 0; i < 5; i++) {
            int randomIndex = r.nextInt(arr.length);
            result = result + arr[randomIndex];
        }
        result = result + r.nextInt(10);
        char[] newArr = new char[6];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = result.charAt(i);
        }
        for (int i = 0; i < newArr.length; i++) {
            int p = r.nextInt(6);
            char t = newArr[i];
            newArr[i] = newArr[p];
            newArr[p] = t;
        }
        String newResult = "";
        for (int i = 0; i < newArr.length; i++) {
            newResult = newResult + newArr[i];
        }
        System.out.println(newResult);
    }
}
*/

import java.util.Random;

public class RandomTest{
    public static void main(String[] args) {
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if(i < 26){
                arr[i] = (char)(97 + i);
            }else{
                arr[i] = (char)(65 + i - 26);
            }
        }
        Random r = new Random();
        String result = "";
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(arr.length);
            result = result + arr[index];
        }
        result = result + r.nextInt(10);
        char[] newArr = new char[6];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = result.charAt(i);
        }
        for (int i = 0; i < newArr.length; i++) {
            int newIndex = r.nextInt(6);
            char temp = newArr[i];
            newArr[i] = newArr[newIndex];
            newArr[newIndex] = temp;
        }
        String newResult = "";
        for (int i = 0; i < newArr.length; i++) {
            newResult = newResult + newArr[i];
        }
        System.out.println(newResult);
    }
}
