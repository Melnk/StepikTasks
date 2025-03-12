package org.example.level1;

public class ReverseByte {
    int reverseByte(int n) {
        return (Integer.reverseBytes(n));
    }

    public static void main(String[] args) {
        ReverseByte reverseByte = new ReverseByte();
        System.out.println(reverseByte.reverseByte(0xfe01ccd1));
    }
}
