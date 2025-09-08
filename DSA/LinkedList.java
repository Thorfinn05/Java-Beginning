import java.util.*;

class Node {
    int data;
    Node next;
}

class Operation {
    Node createLinkedList(Node Start){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data or type -1 to exit: ");
        int data1 = sc.nextInt();
        while(data1 != -1){
            Node newNode = new Node();
            newNode.data = data1;
            newNode.next = null;
            if(Start == null){
                Start = newNode;
            }
            else{
                Node temp = Start;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
                temp = newNode;
            }
            System.out.println("Enter data[type -1 to exit]: ");
            data1 = sc.nextInt();
        }
        return Start;
    }
    void display(Node Start){
        Node ptr = Start;
        while(ptr != null){
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Operation ob = new Operation();
        Node Start = null;
        System.out.println("\n--- Linked List Menu ---");
        System.out.println("1. Create (Add Node at End)");
        System.out.println("2. Display");
        System.out.println("3.Exit");
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("Enter choice: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    Start = ob.createLinkedList(Start);
                    break;
                case 2:
                    ob.display(Start);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
            }
        } while (true);
    }
}
