package javabook;

import java.util.HashSet;

public class ex3 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        hashSet.add(new Person("Heejeong", 27, "jennachoi27@gmail.com"));

        System.out.println(hashSet);
    }
}
