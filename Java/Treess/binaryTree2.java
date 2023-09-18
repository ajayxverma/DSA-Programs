package Treess;

import java.util.Scanner;

public class binaryTree2 {
    static Scanner sc = null;
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }
    
        
        public static Node buildtree(){
           Node root = null;
           System.out.println("Enter the data: ");
           int data = sc.nextInt();

           if(data == -1) return null;
           root = new Node(data);
           System.out.println(" enter the left for: "+ data);
           root.left = buildtree();
           System.out.println("enter the right for: "+ data);
           root.right = buildtree();
            return root;

       
    }


    public static void main(String[] args) {
        
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        sc =new Scanner(System.in);
        
        Node root = buildtree();
       System.out.println(root.data);
        
    }  
    
}
