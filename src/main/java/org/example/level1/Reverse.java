package org.example.level1;

public class Reverse {
    int reverse(int n) {
        return Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        System.out.println(reverse.reverse(655));
    }
}
