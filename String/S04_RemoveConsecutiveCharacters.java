package String;

import java.util.Scanner;

public class S04_RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :");
        String s = sc.next();

        String ans = removeConsecutiveCharacter(s);
        System.out.println(ans);
    }
    public static String removeConsecutiveCharacter(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0)); // Add the first character

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
