package fastcampus.membership;

import java.util.ArrayList;

public class MemberArrayList {

    //Member에 대한 ArrayList 선언하기
    private ArrayList<Member> arrayList;

    //Member로 선언한 ArrayList 생성하기
    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }

    //ArrayList에 멤버 추가하기
    public void addMember(Member member) {
        arrayList.add(member);
    }

    //멤버 아이디를 매개변수로 삭제여부 반환하기
    public boolean removeMember(int memberId) {
        //해당 아이디를 가진 멤버를 ArrayList에서 for문으로 찾기
        for(int i=0; i<arrayList.size(); i++) {
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();

            if(tempId == memberId) { //멤버 아이디가 매개변수과 일치한다면
                arrayList.remove(i); //해당 멤버를 삭제
                return true; //삭제되었다고 반환한다.
            }
        }
        System.out.println(memberId + " 가 존재하지 않습니다."); //for문 끝날때까지 return이 안되었을 때
        return false;
    }

    public void showAllMember() {
        for(Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }
}
