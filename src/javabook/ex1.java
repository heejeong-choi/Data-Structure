package javabook;

import java.util.HashSet;
import java.util.Iterator;

public class ex1 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
        HashSet hashSet = new HashSet();

        for(int i=0; i< objArr.length; i++) {
            hashSet.add(objArr[i]);
            // hashset에 objArr으 요소들을 저장
        }

        // hashSet에 저장된 요소를 출력
        System.out.println(hashSet);

        //HashSet에 저장된 요소들을 출력
        Iterator iterator = hashSet.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
