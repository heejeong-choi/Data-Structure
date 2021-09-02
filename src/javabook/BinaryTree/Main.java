package javabook.BinaryTree;

// binaryTree에 자료를 추가 또는 조회하는 클래스
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add(10, "heejeong");
        tree.add(20, "que");
        tree.add(30, "jackson");
        tree.add(40, "choi");

        //Searching data

        Object obj = tree.get(20);
        System.out.println(obj);

        Object obj2 = tree.get(40);
        System.out.println(obj2);
    }
}
