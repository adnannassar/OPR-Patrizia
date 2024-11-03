package Collection.Stack;

public class Stack {
    // Stack: Lifo Last in first out
    private int[] stack;
    private int last;

    public Stack(int size) {
        this.stack = new int[size];
        this.last = -1;
    }

    // push
    public void push(int value) {
        if(isFull()){
            System.out.println("Stack is full");
        } else {
            last++;
            stack[last] = value;
        }
    }

    // pop
    public int pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1; // flag for empty stack
        } else {
            int value = stack[last];
            last--;
            return value;
        }
    }

    // isEmpty
    public boolean isEmpty() {
        if(last == -1){
            return true;
        } else {
            return false;
        }
    }
    // isFull
    public boolean isFull() {
        if(last == stack.length - 1){
            return true;
        } else {
            return false;
        }
    }

}
