package fastcampus.membership;

public class MemberArrayListTest {

    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberChoi = new Member(1001, "Heejeong");
        Member memberJackson = new Member(1002, "Que");

        memberArrayList.addMember(memberChoi);
        memberArrayList.addMember(memberJackson);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberJackson.getMemberId());
        memberArrayList.showAllMember();
    }
}
