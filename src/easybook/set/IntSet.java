package easybook.set;

//int형 집합
public class IntSet {
    private int max; //집합의 최대 개수
    private int num; //집합의 요소 개수
    private int[] set; //집합 본체 배열로 구현

    //생성자
    public IntSet(int capacity) {
        num = 0;
        max = capacity;

        try {
            set = new int[max]; //집합 배열 생성
        } catch (OutOfMemoryError e) { //배열 생성 실패
            max = 0;
        }
    }

    //집합의 최대 개수를 반환하는 메서드
    public int capacity() {
        return max;
    }

    //집합의 현재 요소 개수를 반환하는 메서드
    public int size() {
        return num;
    }

    //집합에서 n을 검색하는 케이스(index 반환)
    public int indexOf(int n) {
        for(int i=0; i<num; i++)
            if(set[i]==n)
                return i; //검색에 성공
        return -1; //검색 실패 경우
    }

    //집합에 n이 있는지 없는지 확인
    public boolean contains(int n) {
        return (indexOf(n) != -1) ? true : false ;
    }

    //집합에 n을 추가하기
    public boolean add(int n) {
        if(num >= max || contains(n) == true) //가득 찼거나 이미 n이 존재하는 경우
            return false;
        else {
            set[num++] = n; //가장 마지막 자리에 추가하기
            return true;
        }
    }

    //집합에서 n을 삭제하기
    public boolean remove(int n) {
        int idx; //n이 저장된 요소의 인덱스

        //비어 있거나 n이 존재하지 않는 경우
        if(num <= 0 || (idx = indexOf(n)) == -1)
            return false;
        else {
            set[idx] = set[--num]; //마지막 요소를 삭제한 곳으로 옮긴다.
            return true;
        }
    }

    //집합 s에 복사하기
    public void copyTo(IntSet intSet) {
        int n = (intSet.max < num) ? intSet.max : num; //복사할 요소 개수

        for(int i=0; i<n; i++)
            intSet.set[i] = set[i];

        intSet.num = n;
    }

    //집합 s를 복사하기
    public void copyFrom(IntSet intSet) {
        int n = (max < intSet.num) ? max : intSet.num; //복사할 요소의 개수

        for(int i=0; i<n; i++)
            set[i] = intSet.set[i];

        num = n;
    }

    //집합 s와 같은지 확인하기
    public boolean equalTo(IntSet intSet) {
        if(num != intSet.num) //요소의 개수가 같지 않으면
            return false; //집합도 같지 않습니다.

        for(int i=0; i<num; i++) {
            int j = 0;
            for( ; j < intSet.num; j++)
                if(set[i] == intSet.set[j])
                    break;
                if(j == intSet.num) //set[i]는 s에 포함되지 않습니다.
                    return false;
        }

        return true;
    }

    //집합 s1과 s2의 합집합을 복사하기
    public void unionOf(IntSet intSet1, IntSet intSet2) {
        copyFrom(intSet1); //집합 s1을 복사한다
        for(int i=0; i<intSet2.num; i++) //집합 s2의 요소를 추가한다.
            add(intSet2.set[i]);
    }

    //"{a b c}" 형식의 문자열로 표현 바꾸기
    public String toString() {
        StringBuffer sb = new StringBuffer("{ ");

        for(int i=0; i<num; i++)
            sb.append(set[i]+" ");

        sb.append("}");

        return sb.toString();
    }

    public static void main(String[] args) {
        IntSet intSet1 = new IntSet(20);
        IntSet intSet2 = new IntSet(20);
        IntSet intSet3 = new IntSet(20);

        intSet1.add(10); //intSet1 = {10}
        intSet1.add(15); //intSet1 = {10, 15}
        intSet1.add(20); //intSet1 = {10, 15, 20}
        intSet1.add(25); //intSet1 = {10, 15, 20, 25}
        intSet1.copyTo(intSet2); //intSet2 = {10, 15, 20, 25}

        intSet2.add(12); //intSet2 = {10, 15, 20, 25, 12}
        intSet2.remove(25); //intSet2 = {10, 15, 20, 12}

        intSet3.copyFrom(intSet2); //intSet3 = {10, 15, 20, 12}

        System.out.println("intSet1 : " + intSet1);
        System.out.println("intSet2 : " + intSet2);
        System.out.println("intSet3 : " + intSet3);

        System.out.println("집합 intSet1에 15는 " + (intSet1.contains(15) ? "포함" : "미포함"));
        System.out.println("집합 intSet2에 25는 " + (intSet2.contains(25) ? "포함" : "미포함"));
        System.out.println("집합 intSet1과 intSet2는 " + (intSet1.equalTo(intSet2) ? "같다" : "다르다"));
        System.out.println("집합 intSet2와 intSet3는 " + (intSet2.equalTo(intSet3) ? "같다" : "다르다"));

        intSet3.unionOf(intSet1, intSet2); //intSet3 <- intSet1 합집합 intSet2

        System.out.println("집합 intSet1과 intSet2의 합집합은 " + intSet3 + " 입니다. ");
    }
}
