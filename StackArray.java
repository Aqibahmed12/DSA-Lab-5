/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EURO COMPUTERS
 */
public class StackArray {
    
    int Size;
    int top;
    int[] stackArray;

    public StackArray(int size) {
        Size = size;
        stackArray = new int[Size];
        top = -1;
    }
    
    public void push( int data){
        if(top>=Size-1){
            System.out.println("Stack is full");
            return;
        }       
        stackArray[++top]=data;    
        
    }
    
    public int pop(){
       return stackArray[top--];
    }
    
    public int peek(){
        return stackArray[top];
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public boolean isFull(){
        return (top == Size-1);   
    }
    
    public void display(){
    
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.print("Stack elements: ");
            for(int i=0; i<=top; i++){
                System.out.print(stackArray[i]+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        StackArray stack=new StackArray(5);
        System.out.println(stack.isEmpty());
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        
//        System.out.println(stack.pop());
        
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.isFull());
        stack.push(35);
        stack.push(40);
        stack.push(45);
        
        stack.display();
//        System.out.println(stack.isFull());
//        System.out.println(stack.peek());
        
//        stack.display();
    
    }
}
