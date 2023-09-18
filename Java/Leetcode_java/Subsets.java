

import java.util.ArrayList;
import java.util.List;


//for LeetCode questin : https://leetcode.com/problems/subsets/description/

// Solution for the above question using brute force method find below:

public class Subsets {
    public static List<List<Integer>> subset(int[] nums){

        List<List<Integer>> subsetss = new ArrayList<>();
        subsetss.add(new ArrayList());

        for (int i = 0; i < nums.length; i++) {
            int len = subsetss.size();

            for (int j = 0; j < len; j++) {
                List<Integer> temp = new ArrayList<>(subsetss.get(j));
                temp.add(nums[i]);
                subsetss.add(temp); 
            }
            
        }
        return subsetss;
    }
    public static void main(String[] args) {

        int[] sets = {1,2,3};
        List<List<Integer>> sol = subset(sets);

        for (List<Integer> list : sol) {
            System.out.println(list);
            
        }
        
    }
    
}
