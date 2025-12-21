
interface StackOperations {
    void push(int item);
    int pop();
    int peek();
    boolean isEmpty();
    void display();
}

abstract class AbstractStack implements StackOperations {
    protected int[] stack;
    protected int top = -1;
    public AbstractStack(int size){
        stack = new int[size];
    }
}

class MyStack extends  AbstractStack {
    public MyStack(int size){
        super(size);
    }
    public void push(int item) {
        if(top == stack.length - 1) {
            System.out.println("Overflow!");
        }
        else {
            top ++;
            stack[top] = item;
        }
    }
    public int pop(){
        if(top == -1){
            System.out.println("Underflow!");
            return -1;
        }
        else {
            return stack[top--];
        }
    }
    public int peek(){
        if(top == -1){
            System.out.println("Underflow!");
            return -1;
        }
        else{
            return stack[top];
        }
    }
    public boolean isEmpty(){
        if(top == -1)
            return true;
        else
            return false;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("The tack is Empty!");
        }
        else{
            for(int i=top; i>1; i++){
                System.out.println("\t" + stack[i]);
            }
        }
        System.out.println();
    }
}

public class StackAbstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stack Size: ");
        int size = sc.nextInt();
        MyStack s = new MyStack(size);
        do {
            System.out.println("Enter item: ");
        }
    }
}

