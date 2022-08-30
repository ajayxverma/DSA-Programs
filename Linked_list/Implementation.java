package Linked_list;

import java.util.Arrays;
import java.util.LinkedList;

public class Implementation {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("1 ");
        list.add("2");
        list.add("3 ");
        list.add("4");

        LinkedList<String> mylist = new LinkedList<String>();

        //mylist.add(); to add a element in the linkedlist 
        mylist.add("1");
        mylist.add("2");
        mylist.add("3");
        mylist.add("4");

        System.out.println("To find the index of an element . The index is "+list.indexOf("list"));
        //to concanate the Strings
        list.addAll(mylist);
        //to append emement at last use OfferLast()
        mylist.offerLast("5");
        

        System.out.println("The element in the linked_list is "+list);
        System.out.println("this is an example of offerlast() "+mylist);

        //to append emement at First use OfferFirst()
        mylist.offerFirst("00");
        System.out.println("this is an example of offerFirst() "+mylist);
        //To clear the elements for the Linked lsit use clear()
        mylist.clear();
        System.out.println("The element in the  seconed linked_list is "+mylist);
        System.out.println("    ");

        //************************************************************************* */
        LinkedList<String> stk = new LinkedList<>();

        stk.push("A");
        stk.push("B");
        stk.push("C");
        stk.push("D");
        System.out.println("The element in the Stack are "+stk);
        String s=stk.pop();
        System.out.println("The element in the Stack after the pop() are "+stk);
        System.out.println("The element that was poped was "+s);
        System.out.println("    ");
        
        //************************************************************************* */
        LinkedList<String> list1 = new LinkedList<>(); 
        list1.add("1 ");
        list1.add("2");
        list1.add("3 ");
        list1.add("4");
        System.out.println(" Elements before using the remove() "+list1);
        //reove() is used to remove form the list
        list1.remove();
        System.out.println(" Elements After using the remove() "+list1);
        //set(<index>,<element>) is used to replace the element at the given index

       System.out.println(" The ement that ware replaced with "+list1.set(1,"22")); 
       System.out.println(" The ement that ware replaced with "+list1.set(2,"33"));
        System.out.println(" Elements After using the set() "+list1);
        list1.add(" 5");
        System.out.println(" Elements After using the set() "+list1);
        //size() is used to find the size of the linked list
        System.out.println(" The size of the Linked list is "+ list1.size());

        System.out.println("    ");
        
        //************************************************************************* */

        //To convert from array to LinkedList

        String arr[] = {"1", "2", "3", "4", "5", "6"};
        LinkedList<String> arrtoll = new LinkedList<>();
        for(int i=0; i<arr.length; i++){
            arrtoll.add(arr[i]);
        }

        System.out.println(" The element in the array is "+ arr);
        System.out.println(" The element in the LInked list  is "+ arrtoll);

        //To conver for LinkedList to array
        System.out.println("    ");
        System.out.println("    ");

        LinkedList<String> lltoarr = new LinkedList<>();
        lltoarr.add("A");
        lltoarr.add("B");
        lltoarr.add("C");
        lltoarr.add("D");
        lltoarr.add("E");
        lltoarr.add("F");
        
        int size = lltoarr.size();

        System.out.println("The element in the lltoarr is"+lltoarr);


        String[] arr1 = new String[size];
        arr1 =lltoarr.toArray(arr1);
        System.out.println("The element in the array is  "+Arrays.toString(arr1));


    



    }
}
