package javabook;

import java.util.TreeSet;

public class TreemapEx2 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        String from = "b";
        String to = "d";

        treeSet.add("alien"); treeSet.add("banana"); treeSet.add("bat");
        treeSet.add("car"); treeSet.add("Car"); treeSet.add("dance");
        treeSet.add("dizzy"); treeSet.add("elephant"); treeSet.add("elevator");
        treeSet.add("eAsy"); treeSet.add("Easy"); treeSet.add("flower");

        System.out.println(treeSet);
        System.out.println("range search: from " + from + " to " + to);
        System.out.println("b and c : " + treeSet.subSet(from, to));
        System.out.println("from b to d : " + treeSet.subSet(from, to + "zzz"));
    }
}
