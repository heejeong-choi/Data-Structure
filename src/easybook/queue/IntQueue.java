package easybook.queue;

public class IntQueue {
    private int max; //큐 최대 용량
    private int front; //첫번째 요소 커서
    private int rear; //마지막 요소 커서
    private int num; //현재 데이터 개수
    private int[] que; //큐 본체

    //실행 시 예외: queue가 비어있는 경우
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {}
    }

    //실행시 예외: queue가 가득 찬 경우
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }

    //생성자
    public IntQueue(int capacity) {
        num = front = rear = 0;
        max = capacity;

        try {
            que = new int[max]; //큐 본체용 배열을 생성
        } catch (OutOfMemoryError outOfMemoryError) { ////생성할 수 없는 경우
            max = 0;
        }
    }

    //queue에 데이터를 인큐 하는 메서드
    public int enque(int x) throws OverflowIntQueueException {
        if(num >= max)
            throw new OverflowIntQueueException(); //큐가 가득 찬 경우
        que[rear++] = x;
        num++;

        if(rear == max)
            rear = 0;

        return x;
    }

    //queue에 데이터를 디큐하는 메서드
    public int deque() throws EmptyIntQueueException {
        if(num <= 0)
            throw new EmptyIntQueueException(); //큐가 비어있는 경우
        int x = que[front++];
        num --;

        if(front == max)
            front = 0;

        return x;
    }

    //queue에 데이터 피크
    public int peek() throws EmptyIntQueueException {
        if(num <= 0)
            throw new EmptyIntQueueException(); //큐가 비어있는 경우
        return que[front];
    }

    //queue에 x를 검색해 인덱스를 반환, 찾지 못하면 -1을 반환
    public int indexOf(int x) {
        for(int i=0; i<num; i++) {
            int idx = (i+front)%max;
            if(que[idx] == x)
                return idx; //검색 성공
        }

        return -1; //검색 실패
    }

    //큐 비우기
    public void clear() {
        num = front = rear = 0;
    }

    //큐 용량을 반환하기
    public int capacity() {
        return max;
    }

    //큐에 쌓여 있는 데이터 수를 반환
    public int size() {
        return num;
    }

    //큐가 비어있는지 확인하기
    public boolean isEmpty() {
        return num <= 0;
    }

    //큐가 가득 차있는지 확인하기
    public boolean isFull() {
        return num >= max;
    }

    //큐 안의 모든 데이터를 프런트에서 레어 순으로 출력하기
    public void dump() {
        if(num <= 0)
            System.out.println("큐가 비어있습니다.");
        else {
            for(int i=0; i<num; i++)
                System.out.print(que[(i+front) % max] + " ");
            System.out.println( );
        }
    }
}
