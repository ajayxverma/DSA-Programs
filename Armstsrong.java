import java.util.Scanner;

/**
 * Armstsrong
 */
public class Armstsrong {

    static boolean amstrong(int n){
    int temp,len=0,sum=0,last=0;

    temp=n;

    while(temp>0){
        temp=temp/10;
        len++;
    }
    temp=n;
    while(temp>0){
      last=temp%10;
        sum+=(Math.pow(last, len));
        temp=temp/10;

    }

    if(n==sum)
    return true;
    else
    return false;
}

    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number to check");
        try (Scanner sc = new Scanner(System.in)) {
            num=sc.nextInt();
        }
        if(amstrong(num)){
            System.out.println(num +"is a Armstrong Number");
        } else{
            System.out.println(num +"is not a Armstrong Number");
        }
    }
}