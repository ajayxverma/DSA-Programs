/* https://leetcode.com/problems/sliding-window-maximum/discuss/458121/Java-All-Solutions-(B-F-PQ-Deque-DP)-with-Explanation-and-Complexity-Analysis

 */

package Algorithms;

import java.util.Collection;
import java.util.PriorityQueue;
import java.util.*;
public class SWMusingPQueue {
    private static ArrayList maxumsofK(int[] arr, int k) {

        PriorityQueue<Integer> mq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i <k; i++) {
            mq.add(arr[i]);  
        }
        ArrayList<Integer> sol = new ArrayList<>();
        sol.add(mq.peek());
        mq.remove(arr[0]);
        for (int i = k; i < arr.length; i++) {
            mq.add(arr[i]);
            sol.add(mq.peek());
            mq.remove(arr[i-k+1]);  
        }

        return sol;
    }

    public static void main(String[] args) {
        int a=4;
        int [] arr = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
       ArrayList sol= maxumsofK(arr,a);
       System.out.println(sol);
    }

   
    
}
