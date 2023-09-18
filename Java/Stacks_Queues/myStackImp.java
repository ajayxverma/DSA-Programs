package Stacks_Queues;

import java.util.Scanner;

public class myStackImp {
    Node head;
  class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
        
    }
}
    public class myStack{
        boolean isempty(){
            return head == null;
        }

        public void push(int data){
            Node newnode = new Node(data);
            if(isempty()){

                head = newnode;
                return;
            }

            newnode.next = head;
            head = newnode;
        }

        public int pop(){
            if(isempty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek(){
            if(isempty()){
                return -1;
            }
            return head.data;

        }
        
    }


    public static void main(String[] args) {

        myStackImp stk = new myStackImp();
        myStack stack = stk.new myStack();
        Scanner sc = new Scanner(System.in);
        int size = 5;
        while(size>0){
            System.out.println(" Enter the " + size + " element ");
            stack.push(sc.nextInt());
            size --;
        }

        System.out.println(stack.peek());
        
        

        
    }

}