package HaspMap.HashSet;

import java.util.*;

// 로또번호 만들기
public class ex2 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        for (int i=0; hashSet.size()<6; i++) {
            int number = (int)(Math.random()*45)+1;
            hashSet.add(new Integer(number));
        }

        LinkedList lls = new LinkedList(hashSet);
        Collections.sort(lls); // 오름차순을 위한 collections
        System.out.println(lls);
    }
}
