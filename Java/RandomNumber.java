public class RandomNumber {
    public static void main(String[] args) {
        System.out.println("1st random rumber is "+ Math.random());
        System.out.println("2nd random rumber is "+ Math.random());
        System.out.println("3rd random rumber is "+ Math.random());
        System.out.println("4th random rumber is "+ Math.random());
        System.out.println("5th random rumber is "+ Math.random());

        int min=100, max=500;
        double r= Math.random()*(max-min+1)+min;
        System.out.println("Random number between"+max + " and " +min+ " is" + r);
        double p= Math.random()*(max-min+1)+min;
        System.out.println("Random number between"+max + " and " +min+ " is" + p);
        double q= Math.random()*(max-min+1)+min;
        System.out.println("Random number between"+max + " and " +min+ " is" + q);
        double o= Math.random()*(max-min+1)+min;
        System.out.println("Random number between"+max + " and " +min+ " is" + o);
        double l= Math.random()*(max-min+1)+min;
        System.out.println("Random number between"+max + " and " +min+ " is" + l);


    }
}
