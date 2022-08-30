import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        
        int find,temp,rev=0;
        System.out.println(" Enter the number to check");
        Scanner sc = new Scanner(System.in);
        find=sc.nextInt();
        temp=find;
        while(temp>0){
            int t=temp%10;
            rev =(rev*10)+t;
            temp=temp/10;

        }
        System.out.println(rev);
        if(find==rev){
            System.out.println(find+" is an Palindrome number");
        } else{
            System.out.println(find+" is not an Palindrome number");
        }
    }
}
