import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;


public class demo {
    

    public static void main(String[] args) {

    String[] dictionary = new String[] { "bottle", "how",  "hello", "who" };
    char[] tiles = new char[] { 'w', 'a', 'h', 'o' , 'e', 'b','t', 'l'};
    List<Character> tiless = new ArrayList<>();
    for (char c : tiles) {
        tiless.add(c);    
    }
    for (int i = 0; i < dictionary.length; i++) {
            boolean flag = true;
        for (int j = 0; j < dictionary[i].length(); j++) {
            char temp = tiles[j];
            String temap2 = dictionary[i];
          
            if(!tiless.contains(temap2.charAt(j))){
                flag = false;
                break;
            }
           
            
            } 
            if(flag) System.out.println(dictionary[i]);
        }
      
        
    }
        
    }

