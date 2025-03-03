package org.example.level1;

import java.util.Locale;

public class Palindrome {
    public void decisionPalindrome(String s) {
        s = s.replaceAll("\\W", "").toLowerCase(Locale.ROOT);
        String k = "";
        for (int i = 0; i < s.length(); i++){
            char intermediate = s.charAt(s.length() - 1 - i);
            k = k + intermediate;
        }
        System.out.println(k.equals(s) ? "yes" : "no");
    }

    public void decisionPalindromeOptimization(String s) {
        s = s.replaceAll("\\W", "").toLowerCase(Locale.ROOT);
        System.out.println(s.equals(new StringBuilder(s).reverse().toString()) ? "yes" : "no");
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.decisionPalindromeOptimization("Madam i’m Adam");
    }
}
