package com.fandroid.factorial;


import java.math.BigInteger;

public class Factorial {
    public static void main(String args[])
    {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= 100; i++)
        {
            fact = fact.multiply(new BigInteger(new Integer(i).toString()));
        }

        long sum = 0;
        String s = fact.toString();
        for (int i = 0; i < s.length(); i++)
        {
            sum = sum + Long.parseLong("" + s.charAt(i));
        }
        System.out.print(sum);
    }
}

