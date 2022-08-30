package Linked_list;

public class pract {

    Node head;
    int size;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addfirst(String data1){

        Node newNode = new Node(data1);
        if(head==null){
            head= newNode;
            return;

        }

        newNode.next = head;
        head = newNode;
    }

    public void addlast(String data2){
        Node newNode = new Node(data2);

        if(head==null){
            head= newNode;
            return;

        }

        Node currNode = head;
        while(currNode.next != null){

            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void printll(){
        Node currNode = head;

        if(head == null){

            System.out.println(" The list is empty");
        } else {
        
            while(currNode != null){
                System.out.print(currNode.data+" <-");
                currNode=currNode.next;
            }

        }
    }

    public void removefirst(){
        if(head == null){
            System.out.println(" the list is empty");
            return;

        }

        head=head.next;
        size--;
    }


    public int size(){
        return size;

    }

    public void removdlast(){
        if(head == null){
            System.out.println(" the list is empty");
            return;

        }
        size--;

        Node secondlast = head;
        Node last = head.next;
        while(last.next != null){

            secondlast = secondlast.next;
            last = last.next;
        }
        secondlast.next = null;


    }

    public static void main(String[] args) {
        pract ll = new pract();
        ll.addfirst("a");
        ll.addfirst("b");
        ll.addfirst("c");
        ll.addfirst("d");
        ll.addfirst("e");

        ll.addlast("f");
        
        ll.printll();
        
        System.out.println('\n'+" The size of the ll is = "+ll.size());


        
    }
    
}
