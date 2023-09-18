package Treess;
import java.util.*;

public class practices {

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
    static class bTree{
        static int idx = -1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newode = new Node(nodes[idx]);
            newode.left = buildtree(nodes);
            newode.right = buildtree(nodes);

            return newode;

        }
    }

    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
       

    }
    public static void inorder(Node root){
        if(root == null){
            return ;
        }
       
        preorder(root.left);
        System.out.print(root.data);
        preorder(root.right);
       

    }

    public static void postorder(Node root){
        if(root == null){
            return ;
        }
        
        preorder(root.left);
        System.out.print(root.data);
        preorder(root.right);

    }
    public static void levelordertraversal( Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNod = q.remove();
            if(currNod == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNod.data);
                if(currNod.left != null) q.add(currNod.left);

                if(currNod.right != null) q.add(currNod.right);
            }
        }
    }


    public static void main(String[] args) {
        
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,8,-1,-1,6,-1,-1};
        bTree tree = new bTree();
        Node root = tree.buildtree(nodes);
       System.out.println(root.data);
       levelordertraversal(root);

        
    }
    
}


