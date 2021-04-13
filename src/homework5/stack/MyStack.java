package homework5.stack;

public class MyStack {
    int size;
    int arr[];
    int top;

    MyStack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int pushedElement) {
        if (!isFull()) {
            top++;
            arr[top] = pushedElement;
            System.out.println("Pushed element:" + pushedElement);
        } else {
            System.out.println("Stack is full!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("Popped element :" + arr[returnedTop]);
            return arr[returnedTop];
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

    public int peek() {
        if (!this.isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return size - 1 == top;
    }
}
