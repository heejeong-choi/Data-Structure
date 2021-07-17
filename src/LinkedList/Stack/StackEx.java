package LinkedList.Stack;

public class StackEx {
    public static void main(String[] args) {
        java.util.Stack stack = new java.util.Stack<Integer>();

        System.out.println("LinkedList.Stack Created: ");

        for(int i=0; i<10; i++)
            stack.push(new Integer(i));

        // able to see the feature of LinkedList.Stack >> LIFO
        System.out.println("1st-pop: " + stack.pop());
        System.out.println("2nd-pop: " + stack.pop());
        System.out.println("3rd-pop: " + stack.pop());
        System.out.println("4rd-pop: " + stack.pop());

        // current stack state.
        System.out.println("LinkedList.Stack top: " + stack.peek());
    }
}
