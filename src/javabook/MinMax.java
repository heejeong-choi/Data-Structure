package javabook;

import java.util.TreeSet;

public class MinMax {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        int[] score = {45, 81, 90, 100, 74, 60, 92, 88, 55};

        for(int i=0; i<score.length; i++) {
            treeSet.add(new Integer(score[i]));
        }

        System.out.println("fewer than 60: " + treeSet.headSet(new Integer(60)));
        System.out.println("bigger than 60: " + treeSet.tailSet(new Integer(60)));
    }
}
