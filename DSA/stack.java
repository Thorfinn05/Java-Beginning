import java.util.*;

class Node{
    int data;
    Node next;
}

class Operation{
    Node push(Node head){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter val: ");
        int val = sc.nextInt();
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;
        head = newNode;
        return head;
    }

    Node pop(Node head){
        if(head == null){
            System.out.println("Empty Stack!");
        }
        System.out.println("Popped element: " + head.data);
        head = head.next;
        return head;
    }

    void display(Node head){
        if(head == null){
            System.out.println("Empty Stack!");
        }
        Node ptr = head;
        while(ptr != null){
            System.out.println("| "+ptr.data+" |");
            ptr = ptr.next;
        }
        System.out.println("-----");
    }
}

public class stack {
    public static void main(String[] args) {
        Node head = null;
        Operation ob = new Operation();
        System.out.println("---Stack Operations---");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        int ch;
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("Enter choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    head = ob.push(head);
                    break;
                case 2:
                    head = ob.pop(head);
                    break;
                case 3:
                    ob.display(head);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
            }
        } while (true);
    }
}
