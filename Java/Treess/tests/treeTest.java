package Treess.tests;

public class treeTest {
    
    public class Node {
        Node left;
        Node right;
        int data;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int index = -1;
    public Node CreateTree(int[] nodes) {
        index++;
        if(nodes[index] == -1) return null;
        
        Node newNode = new Node(nodes[index]);
        newNode.left = CreateTree(nodes);
        newNode.right = CreateTree(nodes);
        return newNode;

    }

    public static void main(String[] args) {

        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,8,-1,-1,6,-1,-1};
        treeTest tree = new treeTest();
        Node node = tree.CreateTree(nodes);

        System.out.println(node.data);
        
        
    }
    
}
