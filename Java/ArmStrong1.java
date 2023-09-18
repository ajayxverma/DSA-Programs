import java.util.Scanner;

/**
 * Armstsrong
 */
public class ArmStrong1 {




    public int findcoount(int t){
        int count=0;
        while(t>0){
            t=t/10;
            count++;
           
            }
            return count;
        }  
    public static void main(String[] args) {
        int find =0,count;
        System.out.println(" Enter the number");
        Scanner sc = new Scanner(System.in);
        find = sc.nextInt();
        int t= find;
        ArmStrong1 ab = new ArmStrong1();
        count =ab.findcoount(t);
        System.out.println(count +" this is the count");
        
        System.out.println(count);
        int sum=0;
        while(t>0){
            int temp=t%10;
            sum = (int) (sum+(Math.pow(temp,count)));
            t =t/10;
        }
        System.out.println("The sum of the number is "+sum);
        if(find==sum){
            System.out.println(find+" is an Armtrong number");

        } else
        {
            System.out.println(find+" is not an Armstrong number");
        }
    }
}







    