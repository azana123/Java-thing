package Calculator_ahh_project;

public class charStack {
    private char[] arr;
    private int top;
    private int capacity;

    public charStack(){}
    public charStack(int size){
        arr = new char[size];
        capacity = size;
        top = -1;
    }

    public void push(char x){
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top] = x;
    }

    public char pop(){
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return '\0';
        }
        return arr[top--];
    }

    public char peek(){
        if (top != -1) {
            return arr[top];
        }
        return '\0';
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
