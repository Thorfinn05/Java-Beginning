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

    Node pop(Node )
}

public class stack {
    
}
