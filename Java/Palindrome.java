import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
     int orgin,t,num,temp=0;

     try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a number to check ");
         num=sc.nextInt();
    }
     orgin=num;
        while(num>0){
            t=num%10;
            temp=(temp*10)+t;
            num=num/10;
        }
        System.out.println(orgin +"  or  "+ temp);
        if(temp==orgin){
        System.out.println(orgin+" Is a Palindrome");
        } else{
            System.out.println(orgin+" Is not a Plaindrome");
        }
    }
}
