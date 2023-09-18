

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FruitsIntoBasketII {

    public static int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> count = new HashMap<>();
        int max1 = 0, key = 0;
        for(int i = 0; i < fruits.length; i++) {
            if(count.containsKey(fruits[i])) {
                count.put(fruits[i], count.get(fruits[i]) + 1);
                max1 = Math.max(max1, count.get(fruits[i]));
                key = fruits[i];
            } else {
                count.put(fruits[i], 1);
            }
        }
        
        count.remove(key);

        int max2 = 0;
        for(Map.Entry<Integer,Integer> ma : count.entrySet()) {
            max2 = Math.max(ma.getValue(), max2);
        }

        return max2+max1;
        
    }

    public static void main(String[] args) {

        int[] fruits = {1,2,3,2,2};
        System.out.println(totalFruit(fruits));
        


        
    }
    
}
