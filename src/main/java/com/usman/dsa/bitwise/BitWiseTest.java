package com.usman.dsa.bitwise;

public class BitWiseTest {
    public static void main(String[] args) {
        int a = 0xFFFF;
        int b = 0xAAAA;
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("a = " + Integer.toBinaryString(b));
        System.out.printf("%d | %d = %d \n", a, b, a | b);
        System.out.printf("%d & %d = %d \n", a, b, a & b);
        System.out.printf("%d ^ %d = %d \n", a, b, a ^ b);
        System.out.printf("%d >> 2 = %d \n", a, a >> 2);
        System.out.printf("%d << 2 = %d \n", a, a << 2);
        System.out.printf("%d~ = %d \n", a, ~a);
    }
}
