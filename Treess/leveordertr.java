package Treess;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class leveordertr {
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

    public static Node levelordertraversal( Node root){
        if(root == null){
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currentNode = q.remove();
            if(currentNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                } 
            } else {
                System.out.println(currentNode.data);
                if(currentNode.left != null) q.add(currentNode.left);

                if(currentNode.right != null) q.add(currentNode.right);
            }
        }

        return root;
    }


    public static void main(String[] args) {
        
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        sc =new Scanner(System.in);
        
        Node root = buildtree();
       System.out.println(root.data);
       levelordertraversal(root);

        
    }  
    
}
