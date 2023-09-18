package Leetcode_java.solution;

public class solution {

    public static int countPrimes(int n) {

                int ans = 0;
                boolean[] isComposite= new boolean[n]; // false is prime
                for(int i = 2; i < n; i ++){
                    if(!isComposite[i]){
                        ans ++;
                        if(i < Integer.MAX_VALUE / i)
                            for(int j = i*i; j < n; j += i){


                                isComposite[j] = true;
                            }
                    }
                }
             return ans;   
    }
      
    public static void main(String[] args) {
        
       
      System.out.println(countPrimes(100)); 


    }
    
}
