package Collection.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        stack.push(70); // Stack is full


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
