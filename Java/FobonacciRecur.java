public class FobonacciRecur {
    static int n1=0,n2=1,n3=0;
    static void findfibonacci(int count){
      if(count>0){
        n3=n1+n2;
        n1=n2;
        n2=n3;
        System.out.println(+n3);
        findfibonacci(count-1);
      }
       
    }
    public static void main(String[] args) {
        System.out.println(n1+"\n"+n2);
        int count=20;
        findfibonacci(count-2);
    }
}
