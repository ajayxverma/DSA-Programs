/* Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime. So, it is much more flexible than the traditional array. It is found in the java.util package. It is like the Vector in C++.

The ArrayList in Java can have the duplicate elements also. It implements the List interface so we can use all the methods of the List interface here. The ArrayList maintains the insertion order internally.

It inherits the AbstractList class and implements List interface.

The important points about the Java ArrayList class are:

Java ArrayList class can contain duplicate elements.
Java ArrayList class maintains insertion order.
Java ArrayList class is non synchronized.
Java ArrayList allows random access because the array works on an index basis.
In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases. For example:
 */


package CollectionsFramework.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListfuns {

    public static void ArrayInt(){
        ArrayList<Integer> li = new ArrayList<>();
        //void add(int index, E element) It is used to insert the specified element at the specified position in a list.
        li.add(0, 5);
        li.add(4);
        li.add(2,6);
        li.add(1, 5);
        String[] arr = {"Array to List","1","2", "3","4","5","6","7","8"};
        List<String> li2 = Arrays.asList(arr);

        Iterator ie = li.iterator();

        for (String s: li2) {
            System.out.println(s);
            
        }
        
        
        
       
        
    }


    public static void main(String[] args) {
        ArrayInt();
        
    }
    
}
