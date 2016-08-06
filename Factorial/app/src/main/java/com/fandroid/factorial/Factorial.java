package com.fandroid.factorial;

public class Factorial {
    public static void main(String args[]) {
        DecimalBigInt fact = new DecimalBigInt(1);
        for (int i = 1; i <= 100; i++) {
            fact = fact.times(new DecimalBigInt(i));
        }
        int sum = 0;
        String s = fact.toDecimalString();
        for (int i = 0; i < s.length(); i++) {
            sum = sum + Integer.parseInt("" + s.charAt(i));
        }
        System.out.println("FAC (100) =" + fact.toDecimalString() + ""
                + "\n" + "Summ of te digist:" + sum);
    }
}