package easybook.stack;

public class IntStack {

    //스택 용량
    private int maxValueOfStack;
    //스택 포인터
    private int stackPointer;
    //스택 본체
    private int[] stackCase;

    //해당 메서드 실행시 예외상황: 스택이 비어있는 경우
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    //해당 메서드 실행시 예외상황: 스택이 가득 찬 경우
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    //생성자
    public IntStack(int capacity) {
        stackPointer = 0;
        maxValueOfStack = capacity;

        try{
            stackCase = new int[maxValueOfStack]; //스택 본체용 배열을 생성한다
        } catch (OutOfMemoryError outOfMemoryError) { //생성 할 수 없는 경우
            maxValueOfStack = 0;
        }
    }

    //스택에 x값을 푸시한다
    public int push(int x) throws OverflowIntStackException {
        if(stackPointer >= maxValueOfStack) //스택이 가득 찬 경우
            throw new OverflowIntStackException();

        return stackCase[stackPointer++] = x;
    }

    //스택에서 데이터를 팝(꺼내는 것) 구현
    public int pop() throws EmptyIntStackException {
        if(stackPointer <= 0) //스택이 비어잇는 경우
            throw new EmptyIntStackException();
        return stackCase[--stackPointer];
    }

    //스택에서 데이터를 몰래 엿보는 메서드(peak)
    public int peek() throws EmptyIntStackException {
        if(stackPointer <= 0) //스택이 비어있는 경우
            throw new EmptyIntStackException();
        return stackCase[stackPointer - 1];
    }

    //스택에서 x를 찾아 인덱스를 반환 없으면 -1 반환 (-> 검색 메서드)
    public int indexOf(int x) {
        for(int i = stackPointer - 1; i >= 0; i++) //top에서 선형 검색
            if(stackCase[i] == x)
                return i; //검색 성공
        return -1; //검색 실패
    }

    //스택 비우기
    public void clear() {
        stackPointer = 0;
    }

    //스택의 용량을 반환
    public int capacity() {
        return maxValueOfStack;
    }

    //스택에 쌓여잇는 데이터 수를 반환
    public int size() {
        return stackPointer;
    }

    //스택이 비어있는지 체크하는 메서드
    public boolean isEmpty() {
        return stackPointer <= 0;
    }

    //스택이 가득 차 있는지 체크하는 메서드
    public boolean isFull() {
        return stackPointer >= maxValueOfStack;
    }

    //스택 안의 모든 데이터를 바닥부터 꼭대기 순서로 출력하는 메서드
    public void dump() {
        if(stackPointer <= 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for(int i=0; i<stackPointer; i++)
                System.out.print(stackCase[i] + " ");
            System.out.println();
        }
    }
}
