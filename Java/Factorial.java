import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        int sum=1,num;
        System.out.println("enter the number");
        try (Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();
        }
        for(int i=1; i<=num; i++){
            sum= sum*i;

        }
    System.out.println("The Factorial of "+num +" is "+ sum);
    }

}