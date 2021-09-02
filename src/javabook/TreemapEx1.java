package javabook;

import java.util.TreeSet;

public class TreemapEx1 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        int[] score = {66, 71, 100, 55, 94, 49, 83, 91, 30, 60};

        for(int i=0; i<score.length; i++) {
            treeSet.add(score[i]);
        }

        System.out.println("less than 60: " + treeSet.headSet(60)); //60 미만
        System.out.println("more than 60: " + treeSet.tailSet(60)); //60 이상
    }
}
