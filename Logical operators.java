5. Logical operators
Logical operators combine multiple conditions.
| && | AND | Both conditions must be true |
| || | OR | At least one condition must be true |
| ! | NOT | Reverses the result |



public class LogicalExample {
    public static void main(String[] args) {

        int age = 22;
        int marks = 80;

        System.out.println(age >= 18 && marks >= 60);
        System.out.println(age >= 18 || marks >= 90);
        System.out.println(!(age >= 18));
    }
}                                                                                        true
                                                                                          true
                                                                                          false
