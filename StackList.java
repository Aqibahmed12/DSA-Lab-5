/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EURO COMPUTERS
 */

public class StackList {
    
    public class Node{
    
        int data;
        Node next;
        
        public Node(int data){
        this.data=data;
        this.next=null;
        
        }
    }
    
    private Node top;
    
    public StackList(){
    
        this.top=null;
    }
    
    public void push (int data){
    
        Node newNode =new Node(data);
        if(top==null){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
    }
    
    public int peek() {
        return top.data;
    }
    
    public int pop(){
        int temp=top.data;
        top=top.next;
        return temp;
    }
    
    public boolean isEmpty(){
        return top==null;
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            Node current = top;
            System.out.print("Stack elements: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        StackList sList=new StackList();
        sList.push(10);
        sList.push(20);
        sList.push(30);
        
        System.out.println(sList.pop());
        sList.display();
    }
}














































/*

public class QueueList {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front, rear;

    public QueueList() {
        this.front = this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        }
        int temp = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return temp;
    }

    public int peek() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            Node current = front;
            System.out.print("Queue elements: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueList qList = new QueueList();
        qList.enqueue(10);
        qList.enqueue(20);
        qList.enqueue(30);

        System.out.println(qList.dequeue());
        qList.display();
    }
}

*/