package LinkedList.Queue;

import java.util.LinkedList;

public class QueueEx {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.offer("Heejeong");
        linkedList.offer("Choi");
        linkedList.offer("Que");
        linkedList.offer("Jackson");

        System.out.println("Size = "+linkedList.size());

        while(linkedList.peek() != null) //읽을 값이 있는지 확인
            System.out.println(linkedList.poll()); // 값을 읽어서 출력하는 역할

        System.out.println("Size = "+ linkedList.size());
        //다읽어서 size가 0이됨.
    }
}
