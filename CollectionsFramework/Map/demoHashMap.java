package CollectionsFramework.Map;

import java.util.HashMap;

public class demoHashMap {

        public static int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> map = new HashMap<>();
            int[] sol = new int[2];
            for(int i = 0; i < nums.length; i++){
                int temp = target - nums[i];
                map.put(nums[i],i);
                if(map.containsKey(temp)){
                    sol[0] = map.get(temp);
                    sol[1] = i;
                }
            }
    
            return sol;
        }
    
        public static void main(String[] args) {
           int[] arr = {2,7,11,15};

           int target = 9;

           int[] sol = twoSum(arr, target);

           for (int i : sol) {
            System.out.println(i);
            
           }
            


        }

        
}
