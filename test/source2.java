package test;

import java.util.ArrayList;

public class source2 {
    public String intIndex(ArrayList<String> list, int ind){
        int index=list.indexOf(ind);
        
        return String.valueOf(index);

    }
    public ArrayList<String> addAfter(ArrayList<String> a, String m, String n){
        a.add(m);
        a.add(n);
        return a;
    }
    
}
