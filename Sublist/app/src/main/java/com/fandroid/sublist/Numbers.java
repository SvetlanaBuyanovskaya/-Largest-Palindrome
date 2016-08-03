package com.fandroid.sublist;

import java.util.ArrayList;

public class Numbers {
    public static void main(String[] args) {

        ArrayList<Pair> listOfPairs = new ArrayList<Pair>();

        listOfPairs.add(new Pair(1, 4));
        listOfPairs.add(new Pair(2, 5));
        listOfPairs.add(new Pair(7, 3));
        listOfPairs.add(new Pair(4, 6));
        listOfPairs.add(new Pair(7, 7));

        int longestLength = 0;
        int subListFirstIndex = 0;
        int currentLength = 0;

        for (int i = 0; i < listOfPairs.size() - 1; i++) {

            if (listOfPairs.get(i).getFirstNumber() < listOfPairs.get(i + 1).getFirstNumber() &&
                    listOfPairs.get(i).getSecondNumber() > listOfPairs.get(i + 1).getSecondNumber()) {
                currentLength++;
                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    subListFirstIndex = i + 1 - currentLength;
                }

            } else currentLength = 0;

        }

        for (int i = subListFirstIndex; i <= subListFirstIndex + longestLength; i++) {
            System.out.println(listOfPairs.get(i).getFirstNumber() + " " + listOfPairs.get(i).getSecondNumber());

        }
    }

}

