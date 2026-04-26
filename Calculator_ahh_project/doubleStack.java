package Calculator_ahh_project;

public class doubleStack {
    private double[] arr;
    private int top;
    private int capacity;

    public doubleStack(){}
    public doubleStack(int size){
        arr = new double[size];
        capacity = size;
        top = -1;
    }

    public void push(double x){
        if (top == capacity - 1) return;
        arr[++top] = x;
    }

    public double pop(){
        if (top == -1) return 0;
        return arr[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }
}