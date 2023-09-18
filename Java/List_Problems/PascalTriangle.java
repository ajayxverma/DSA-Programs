package List_Problems;

import java.util.ArrayList;
import java.util.List;

// for question refer : https://leetcode.com/problems/pascals-triangle/description/
// for solution  refer below :

public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            l.add(0,1);
            for(int j = 1; j < l.size()-1; j++){
                l.set(j,l.get(j) + l.get(j+1));
            }
            sol.add(new ArrayList<Integer>(l));
            
        }
       
        return sol;
    }

    public static void main(String[] args) {
        
        int nums = 5;

        generate(nums);
        /* List<Integer> l = new ArrayList<>();
        l.add(0,1);
        System.out.println(l.size());
        System.out.println(l.get(1));
        for (Integer integer : l) {
            System.out.print(l); */
        }

}
    
