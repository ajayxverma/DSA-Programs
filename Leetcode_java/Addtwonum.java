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


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Addtwonum {

    public static LinkedList addnum(LinkedList nums1, LinkedList nums2){
        LinkedList<Integer> newlist = new LinkedList<Integer>();
        LinkedList  curr = newlist;
        Iterator p1 = nums1.iterator();
        Iterator p2 = nums2.iterator();
        
/* 
        int carry =0;
        while(p1 != null || p2 != null){
            int sum =0;
            if(p1 == null){
                sum+=p2.;
               p2.next();
            } else if(p2 == null){
                sum+=p1.value;
                p1 = p1.next;
            } else {
                sum+=p1
            }
            
 */
return nums2;
        }



    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        Integer arr1[] = {1,3,4,5,6};
        Integer arr2[] = {1,4,8,8,5,6};
        Collections.addAll(l1, arr1);
        Collections.addAll(l2, arr2);

        System.out.println("The size of l1 is "+l1.size());

        System.out.println(l1);
        

        Iterator it = l1.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
    }
    
}
