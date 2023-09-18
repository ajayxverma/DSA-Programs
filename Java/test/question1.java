package test;

import java.util.Scanner;

public class question1 {

    class Person{
        String name;
        String countryCode;
        Person(String name, String countryCode){
          this.name=name;
          this.countryCode=countryCode;  

        }
    }
    
    class Mobile{
        Person person=null;
        public String addPerson(String name, String countryCode){
            
            if(countryCode.charAt(0)!='+') {
                return "invalid country code";
            } else if(!Character.isUpperCase(name.codePointAt(0))) {
                return "invalid format";
            } else{
                Person person= new Person(name, countryCode);
                return "Added";
            }
        }
        public String getMobileNumber(String data){
            if(!data.matches("\\d{6-10}")) {
                return "incorrect details";
            } else{
                String str = data.replaceAll("[^0-9]", "");
                return str;
            }
        }  
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        String countrycode = sc.nextLine();
        System.out.println(name+""+countrycode);
        question1 q= new question1();
        Mobile mob = q.new Mobile();
        System.out.println("enter no");
        String num = sc.nextLine();
        String res=mob.getMobileNumber(num);
        System.out.println(res);

        
    }
    
}
