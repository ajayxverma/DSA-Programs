package Arrayss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


// Question for the below problem : https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
public class ArrayIntersection2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
     HashMap<Integer , Integer> freq = new HashMap<>();
     for (int i : nums1) {
        int fre = freq.getOrDefault(i , 0);
        freq.put(i, fre + 1); 
     }
     ArrayList<Integer> sol = new ArrayList<>();
     for (int i : nums2) {

        if( freq.get(i) != null && freq.get(i) > 0 ) {
            sol.add(i);
            freq.put(i, freq.get(i) - 1 );
        }     
     }
    int[] res = new int[sol.size()];
    for (int i = 0; i < res.length; i++) {

        res[i] = sol.get(i);   
    }

    return res;    
    }

    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        intersect(nums1, nums2);
        
    }
    
}
