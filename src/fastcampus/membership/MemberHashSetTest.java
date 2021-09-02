package fastcampus.membership;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberKang = new Member(1003, "baekho");
        Member memberKo = new Member(1004, "0pyo");
        Member memberBae = new Member(1005, "jeseong");

        memberHashSet.addMember(memberBae);
        memberHashSet.addMember(memberKo);
        memberHashSet.addMember(memberKang);

        memberHashSet.showAllMember();

        Member memberChoi = new Member(1003, "jennyfromdeblock"); //아이디 중복 만들기

        memberHashSet.addMember(memberChoi);
        memberHashSet.showAllMember();
    }
}
