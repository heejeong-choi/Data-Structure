package javabook;

import java.util.*;

public class scoreCalc {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("Heejeong", 95);
        hashMap.put("Quintarus", 80);
        hashMap.put("Choi", 100);
        hashMap.put("Jackson", 75);

        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();

        while(iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry)iterator.next();
            System.out.println("Name: " + mapEntry.getKey() + "Score: " + mapEntry.getValue());
        }

        set = hashMap.keySet();
        System.out.println("The name of Students: " + set);

        Collection values = hashMap.values();
        iterator = values.iterator();

        int total = 0;

        while(iterator.hasNext()) {
            int i = (int)iterator.next();
            total += i;
        }

        System.out.println("total score: " + total);
        System.out.println("Average: " + (float)total/set.size());
        System.out.println("The highest score: " + Collections.max(values));
        System.out.println("The lowest score: " + Collections.min(values));
    }
}
