package test;

import java.io.IOException;

import javax.management.modelmbean.RequiredModelMBean;

public class source3 {

    class Company{
        String name;
        int requiredCandidates;
        Company(String name, int requiredCandidates){
            this.name=name;
            this.requiredCandidates=requiredCandidates;
        }
    }
    class JObPortal{
        public String applyJOb(Company jobData, String companyName, int numberOfCandidates) throws IOException{
            try {
                if(jobData.name!=companyName) {
                    String str = "no such company found";
                    CompanyNotFoundException exp1 = new CompanyNotFoundException(str);
                    throw exp1;
                }
            } catch(Exception e){
                e.printStackTrace();
            }
            try {
                if(jobData.requiredCandidates< numberOfCandidates) {
                    String str = "no vacancy available";
                    NoVacancyFoundException exp2 = new NoVacancyFoundException(str);
                    throw exp2;

                }
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
             
        
           jobData.requiredCandidates-=numberOfCandidates;
           return "Applied successfully";


        }
    }
    class CompanyNotFoundException extends Exception{
        public CompanyNotFoundException(String str){
            super(str);


        }
    }

    class NoVacancyFoundException extends Exception{
        public NoVacancyFoundException(String str){
            super(str);
        }
       
    }
  



    public static void main(String[] args) {
        
    }
    
}
