package Strings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// for Question refer : https://leetcode.com/problems/partition-labels/description/
// solution below for the above question:

public class PartitionLabels {

    public static List<Integer> partation(String s){
         
        HashMap<Character, Integer> lastindex = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            lastindex.put(c, i);
        }

        lastindex.entrySet().forEach(ele -> {
            System.out.println(ele.getKey()+ " : " + ele.getValue());
        });

        List<Integer> solList = new ArrayList<>();
        int prev = -1;
        int max = 0;

        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            max = Math.max(max, lastindex.get(ch));
            if(max == i){
                solList.add(max - prev);
                prev = max;
            }
        }



        return solList;

    }

    public static void main(String[] args) {
        String s= "ababcbacadefegdehijhklij";
        List<Integer> sol =partation(s);

        sol.forEach(a -> {
            System.out.print(a +" :");
        });

    }
    
}
