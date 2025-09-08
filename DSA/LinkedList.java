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
                // temp = newNode;
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

    Node insertAtBeginning(Node Start){
        Node newNode = new Node();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter data: ");
        int data1 = sc.nextInt();

        newNode.data = data1;
        newNode.next = null;

        newNode.next = Start;
        Start = newNode;

        return Start;
    }

    Node insertAtEnd(Node Start){
        Node newNode = new Node();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        int data1 = sc.nextInt();

        newNode.data = data1;
        newNode.next = null;

        if (Start == null) {
            Start = newNode;
            return Start;
        }

        Node temp = Start;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return Start;
    }

    Node insertAtPos(Node Start){
        Node newNode = new Node();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        int data1 = sc.nextInt();
        newNode.data = data1;
        newNode.next = null;
        System.out.println("Enter pos: ");
        int pos = sc.nextInt();
        Node ptr = Start, preptr = ptr;
        
        if(pos==1){
            newNode.next = Start;
            Start = newNode;
        }
        else{
            int i=1;
            while(i<pos){
                preptr = ptr;
                ptr = ptr.next;
                i++;
            }
            preptr.next = newNode;
            newNode.next = ptr;
        }
        return Start;
    }

    Node deleteNode(Node Start){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pos: ");
        int pos = sc.nextInt();

        if(pos == 1){
            Node ptr = Start;
            Start = ptr.next;
            ptr = null;
        }
        else{
            int i=1; Node ptr = Start, preptr = ptr;
            while(i<pos){
                preptr = ptr;
                ptr = ptr.next;
                i++;
            }
            preptr.next = ptr.next;
            ptr = null;
        }
        return Start;
    }

    void search(Node Start){
        Node ptr = Start;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter val: ");
        int val = sc.nextInt();
        int i=1;
        while(ptr != null){
            if(ptr.data == val){
                System.out.println("Element "+val+" found at position "+i);
                return;
            }
            ptr = ptr.next;
            i++;
        }
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
        System.out.println("4. Insert at Beginning");
        System.out.println("5. Insert at End");
        System.out.println("6. Insert");
        System.out.println("7. Delete");
        System.out.println("8. Search");
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
                case 4:
                    Start = ob.insertAtBeginning(Start);
                    break;
                case 5:
                    Start = ob.insertAtEnd(Start);
                    break;
                case 6:
                    Start = ob.insertAtPos(Start);
                    break;
                case 7:
                    Start = ob.deleteNode(Start);
                    break;
                case 8:
                    ob.search(Start);
                    break;
            }
        } while (true);
    }
}
