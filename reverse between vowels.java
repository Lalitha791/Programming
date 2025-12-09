import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();

        String[] words = sen.split(" ");
        String vowels = "aeiouAEIOU";
        String ans = "";

        for (String w : words) {
            int first = -1, last = -1;

            for (int i = 0; i < w.length(); i++) {
                if (vowels.indexOf(w.charAt(i)) != -1) {
                    first = i;
                    break;
                }
            }

            for (int i = w.length() - 1; i >= 0; i--) {
                if (vowels.indexOf(w.charAt(i)) != -1) {
                    last = i;
                    break;
                }
            }

            if (first == -1 || last == -1 || first == last) {
                ans += w + " ";
            } else {
                String rev = new StringBuilder(w.substring(first, last + 1)).reverse().toString();
                ans += w.substring(0, first) + rev + w.substring(last + 1) + " ";
            }
        }

        System.out.println(ans.trim());
    }
}
