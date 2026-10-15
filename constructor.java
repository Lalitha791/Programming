class User {
    String name;

    User() {
        name = "Default";
    }
}

public class Solution {
    public static void main(String[] args) {
        User u = new User();
        System.out.println(u.name);
    }
}
