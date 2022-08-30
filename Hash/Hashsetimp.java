package Hash;
import java.util.HashSet;
import java.util.Iterator;

public class Hashsetimp {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(2);

        System.out.println(hs);

        Iterator it = hs.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        
        
        
    }
}
