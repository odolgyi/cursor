package homework5.stack;

public class StackDemo {
    public static void main(String[] args) {
        MyStack customStack = new MyStack(10);
        customStack.pop();
        customStack.push(5);
        customStack.push(6);
        customStack.push(9);
        customStack.push(10);
        System.out.println("Use method pop");
        customStack.pop();
        customStack.pop();
        customStack.pop();
        System.out.println();
    }
}