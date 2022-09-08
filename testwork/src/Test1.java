import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = checkValidString_1(s);
        System.out.println(flag);
    }

    public static boolean checkValidString_1(String s) {
        int minCount = 0, maxCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                minCount++;
                maxCount++;
            } else if (c == ')') {
                minCount = Math.max(--minCount, 0);
                maxCount--;
                if (maxCount < 0) {
                    return false;
                }
            } else {
                minCount = Math.max(--minCount, 0);
                maxCount++;
            }
        }
        return minCount == 0;
    }

    public static boolean checkValidString_2(String s) {
        int minCount = 0, maxCount = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                minCount++;
                maxCount++;
            } else if (c == ')') {
                minCount = Math.max(minCount - 1, 0);
                maxCount--;
                if (maxCount < 0) {
                    return false;
                }
            } else {
                minCount = Math.max(minCount - 1, 0);
                maxCount++;
            }
        }
        return minCount == 0;
    }
}
