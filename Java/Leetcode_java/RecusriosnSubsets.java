

import java.util.ArrayList;
import java.util.List;

// for question goto https://leetcode.com/problems/subsets/description/

// Subset using Recustion below:


public class RecusriosnSubsets {

    public static List<List<Integer>> RecursiveSusbsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(0 , nums, new ArrayList<>(), subsets);

        return subsets;
    }

    private static void generateSubsets(int i, int[] nums, List<Integer> sub, List<List<Integer>> subsets) {
        subsets.add(new ArrayList(sub));

        for (int j = i; j < nums.length; j++) {
            sub.add(nums[i]);
            generateSubsets(i+1, nums, sub, subsets);
            sub.remove(sub.size()-1);
 
        }
    }

    public static void main(String[] args) {

        int[] sets = {1,2,3};

        List<List<Integer>> sol = RecursiveSusbsets(sets);

        for (List<Integer> list : sol) {
            System.out.print(list + " ");
            
        }
        
    }
    
}
