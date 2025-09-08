import java.util.*;

class Node{
    int data;
    Node next;
}

class Operation{
    Node front = null;
    Node rear = null;

    void enqueue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter val: ");
        int val = sc.nextInt();
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;

        if(rear==null){
            front = rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    void dequeue(){
        if(front == null){
            System.out.println("Queue is Empty.");
            return;
        }
        System.out.println("Dequeued element: " +front.data);
        front = front.next;
        if(front==null){
            rear = null;
        }
    }

    void peek() {
        if (front == null) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }

    void display(){
        if(front == null){
            System.out.println("Empty queue!");
            return;
        }
        Node ptr = front;
        while(ptr != null){
            System.out.print(ptr.data + " <- ");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }
}

public class queue {
    public static void main(String[] args) {
        Node front = null;
        Node rear = null;
        Operation ob = new Operation();
        System.out.println("---Stack Operations---");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Peek");
        System.out.println("4. Display");
        System.out.println("5. Exit");
        int ch;
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("Enter choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    ob.enqueue();
                    break;
                case 2:
                    ob.dequeue();
                    break;
                case 3:
                    ob.peek();
                    break;
                case 4:
                    ob.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (true);
    }
}
