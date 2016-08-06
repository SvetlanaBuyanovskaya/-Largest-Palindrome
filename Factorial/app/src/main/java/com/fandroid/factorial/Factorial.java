package com.fandroid.factorial;

public class Factorial {
    public static void main(String args[]) {
        DecimalBigInt fac=DecimalBigInt.factorial(100);
        int sum = 0;
        String s = fac.toDecimalString();
        for (int i = 0; i < s.length(); i++) {
            sum = sum + Integer.parseInt("" + s.charAt(i));
        }
        System.out.println("factorial (100) =" + fac.toDecimalString()
                + "\n" + "Summ of te digist:" + s);
    }
}