import java.util.Scanner;

class solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            nums[i]=sum;

        }
        return nums;
        
    }
    
    public static void main(String[] args){
        int len;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element");
        len = sc.nextInt();
        System.out.println("Enter the elements");
        int arr[] = new int[10];
        for(int i=0; i<len; i++){
            arr[i]=sc.nextInt();
            
        }
        solution asum = new solution();
        asum.runningSum(arr);
        System.out.println(" The sum of the Running array is");
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+ " ");

        }
       
        
        
        
        } 
    }
