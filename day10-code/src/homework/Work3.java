package homework;
public class Work3 {
    public static void main(String[] args) {
        String str = "上海自来水来自海上";
        System.out.println(isSym(str));
    }

    public static boolean isSym(String str) {
        // 为了程序的健壮，如果传递的是空值，返回false
        if (str == null) {
            return false;
        }
        // 转换为StringBuilder
        StringBuilder sb = new StringBuilder(str);
        // 反转，再转成String
        String reStr = sb.reverse().toString();
        // 比较与原字符串是否相等
        // 相等返回true，不相等返回false，正好与equals的返回值一致，直接返回即可。
        return reStr.equals(str);
    }
}