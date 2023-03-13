package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BasisStream {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(6);
        list1.add(7);
        list1.add(3);

        List<Integer> usingmap = list1.stream().map(x -> x * x).collect(Collectors.toList());

        for (Integer integer : usingmap) {
            System.out.println(integer);
            
        }
        List<Integer> usingSort = list1.stream().sorted().collect(Collectors.toList());
        System.out.println("using Steam sort method : "+usingSort);

        //to interate using Stream API 
        list1.stream().forEach(x -> System.out.println("for Each :"+x));

        List<String> list2 = new ArrayList<>();

        list2.add("java");
        list2.add("python");
        list2.add("py");
        list2.add( "a");

        List<String> usingfilter = list2.stream().filter(x -> x.startsWith("p")).collect(Collectors.toList());
        System.out.println(usingfilter);

    }
    
}
