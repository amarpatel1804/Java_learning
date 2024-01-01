import java.util.Stack;

public class starckOpertaions {
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        boolean result=stk.isEmpty();

        System.out.println("Is the Stack Empty?"+result);

        stk.push(10);
        stk.push(2);
        stk.push(5);
        stk.push(7);

        System.out.println("Element in stack: "+stk);
        result=stk.isEmpty();

    }
}
