/* You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1] */


package Leetcode_java;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Addtwonumn {

    static Node head1, head2;
   static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            this.next = null;
        }
   
    }

    public static Node addnumber(Node l1, Node l2){

        Node newlist = new Node(0);
        Node curr = newlist;
        Node p1 = l1;
        Node p2 = l2;
        int carry = 0;
        
        while(p1 != null || p2 != null){
            int sum =0;
            if(p1 == null ){
                sum+=p2.data;
                p2 = p2.next;
            } else if(p2 == null){
                sum+=p1.data;
                p1 = p1.next;

            } else {
                sum+=p1.data +p2.data;
                p1 = p1.next;
                p2 = p2.next;
            }

            if(carry>0){
                sum+=carry;
            }
            if(sum>=10){
                sum%=10;
                carry =1;
            } else {
                carry = 0;
            }
            Node newNode = new Node(sum);
            curr.next =newNode;
            curr= curr.next;

            if(carry>0){
                curr.next = new Node(1);
            }
        }
        return newlist.next;

    }

    


    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        Integer arr1[] = {1,3,4,5,6};
        Integer arr2[] = {1,4,8,8,5,6};
        Collections.addAll(l1, arr1);
        Collections.addAll(l2, arr2);
        Addtwonumn list1 = new Addtwonumn();
        list1.head1 = new Node(4);
        list1.head1.next = new Node(4);
        list1.head1.next.next = new Node(3);

        list1.head2 = new Node(5);
        list1.head2.next = new Node(6);
        list1.head2.next.next = new Node(4);
        Node sum = list1.addnumber(head1, head2);

        while (sum != null) {
            System.out.print(sum.data + " ");
            sum = sum.next;
        }


        

    
        
        
    }
    
}
