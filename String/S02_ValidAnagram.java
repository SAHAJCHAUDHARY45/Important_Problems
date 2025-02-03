package String;

import java.util.Arrays;
import java.util.Scanner;

public class S02_ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1:");
        String s1 = sc.next();

        System.out.println("Enter String 2:");
        String s2 = sc.next();

        if (isAnagram(s1,s2)) System.out.println("Anagram.");
        else System.out.println("Not Anagram.");
    }
    public static boolean isAnagram(String s, String t) {

        s = s.toLowerCase();
        t = t.toLowerCase();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars,tChars);
    }
}
