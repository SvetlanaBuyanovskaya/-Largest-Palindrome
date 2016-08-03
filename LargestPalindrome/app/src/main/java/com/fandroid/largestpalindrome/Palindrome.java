package com.fandroid.largestpalindrome;


public class Palindrome {

    public static void main(String[] args) {

        long largest = 1;
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i < 999; i++) {
            for (int j = 1; j < 999; j++) {
                long num = i * j;
                char[] array = Long.toString(num).toCharArray();
                int length = array.length;
                if (length % 2 == 0) {
                    boolean polindrom = true;
                    for (int k = 0; k < length / 2; k++) {
                        if (array[k] != array[length - 1 - k]) {
                            polindrom = false;
                        }
                    }
                    if (polindrom && (num > largest)) {
                        largest = num;
                        num1 = i;
                        num2 = j;
                    }
                }
            }
        }

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(largest);
    }

}
