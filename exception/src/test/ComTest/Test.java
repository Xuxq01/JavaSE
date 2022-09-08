package test.ComTest;

public class Test {
    public static void main(String[] args) {
        UserService userService = new UserService();
        try {
            userService.register("张三","123456");
        } catch (IllegalNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
