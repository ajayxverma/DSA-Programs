package Arrays;

public class allinfoinjarray {

 
    public static void main(String[] args) {

        /*
        check the below link for more infor regarding the 2d length
        https://www.javatpoint.com/arr-length-vs-arr-0-length-vs-arr-1-length-in-java */
        
        int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } , { 9, 10, 11, 12 }, { 9, 10, 11, 12 } };  
        System.out.println("The total number of rows "+mat.length);  // mat.length is the total number of rows.
        System.out.println("The number of columns in 0th row "+mat[0].length); //mat[0].length is the number of columns in 0th row 
        System.out.println("The total no of colums in the 1st row "+mat[1].length); //mat[1].length should have the same value as mat[0].length it also prints the total no of colums in the array
         
    }
    
}
