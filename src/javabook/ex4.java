package javabook;

import java.util.HashSet;
import java.util.Iterator;

// 집합
public class ex4 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet unionSet = new HashSet();
        HashSet intersectSet = new HashSet();
        HashSet diffSet = new HashSet();

        setA.add("1"); setA.add("2"); setA.add("3"); setA.add("4"); setA.add("5");
        System.out.println("setA: "+setA);

        setB.add("2"); setB.add("4"); setB.add("6"); setB.add("8"); setB.add("10");
        System.out.println("setB: "+setB);

        Iterator iterator = setB.iterator();
        while(iterator.hasNext()) {
            Object tmp = iterator.next();
            if(setA.contains(tmp))
                intersectSet.add(tmp);
        }

        iterator = setA.iterator();
        while(iterator.hasNext()) {
            Object tmp = iterator.next();
            if(!setB.contains(tmp))
                diffSet.add(tmp);
        }

        iterator = setA.iterator();
        while(iterator.hasNext())
            unionSet.add(iterator.next());

        iterator = setB.iterator();
        while(iterator.hasNext())
            unionSet.add(iterator.next());

        System.out.println("A ∩ B = " + intersectSet + "; intersection set");
        System.out.println("A ∪ B = " + unionSet + "; union set");
        System.out.println("A - B = " + diffSet + "; difference set");
    }
}
