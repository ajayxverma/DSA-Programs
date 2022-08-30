package Linked_list;

public class implement2 {

     Node head;
     int size;
     implement2(){
        this.size=0;
     }
    class Node{
        String data;
        Node next;

        Node(String data1){
            this.data =data1;
            this.next = null;
            size++;
        }
    
    }
    public void addFirst(String data2){
        Node newNode = new Node(data2);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next= head;
        head = newNode;
    }

    public void addlast(String data3){
        Node newNode = new Node(data3);
        if (head == null) {
            head = newNode;
            return;
        } 
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next=newNode;
    }

    public void Printll( ){
        Node currNode = head;
        

        if(head == null){
            System.out.println(" Null");

        } else{
            while(currNode != null){
                System.out.print(currNode.data+" -> ");
                currNode = currNode.next;
            }
        }        
    }
     //Delete first

    public void deletefirst(){
        if (head == null) {

            System.out.println(" The Linked list is empty");
            return;
        } 
        head= head.next;
        size--;
    }

    //Delete last
    public void deletelast(){

        if (head == null) {

            System.out.println(" The Linked list is empty");
            return;
        } 

        size--;

        if(head.next == null){
            head = null;
            return;
        } 
        else
        {
        Node secondlast = head;
        Node last = head.next;

        while(last.next != null){

            
            last = last.next;
            secondlast= secondlast.next;
        }
        secondlast.next = null;}
    }

    public int  getsize(){
        return size;
    }
    

    
    public static void main(String[] args) {

        implement2 list = new implement2();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");
        list.deletelast();
     
        list.Printll();
        System.out.println();

        System.out.println("The size of the linked list is "+list.getsize());
        


    }
    
}
