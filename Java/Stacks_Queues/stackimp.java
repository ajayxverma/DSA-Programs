package Stacks_Queues;

public class stackimp {
    Node head;

     class Node{
        int data;
        Node next;
       

        public Node(int data){
            this.data= data;
            this.next = null;

        }
    }

    public  class stack{
           

        public  boolean isempty(){
          
            return head==null;


        }

        public void push(int data){
            Node newnode = new Node(data);

            if(isempty()){
                head = newnode;
                return;

            }
            newnode.next=head;
            head = newnode;


        }
        public int pop(){
            if(isempty()){
                return -1;
            }
            int top = head.data;

            head=head.next;
            return top;
            
        }
        public int peek() {
            if(isempty()){
                return -1;
            }
            return head.data;

        }
    }

    public static void main(String[] args) {

        stackimp nod = new stackimp();
        stack s = nod.new stack();

        s.push(2);
        s.push(2);
        s.push(7);
        s.push(9);
        s.push(3);
        System.out.println("before pop"+s.peek());

        s.pop();
       
        
        while(!s.isempty()){
            System.out.println(s.peek());
            s.pop();
        }
       

    }
    
}
