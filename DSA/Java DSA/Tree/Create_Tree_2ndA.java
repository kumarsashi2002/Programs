import java.util.Scanner;

public class Create_Tree_2ndA {

    static class Node{
        int data;
        Node left , right;
        Node(int data){
            this.data=data;
        }
    }
    static Scanner sc=new Scanner(System.in);
    
    static Node createTree(){
        // System.out.println("Enter data ");
        int data=sc.nextInt();
        Node root=null;
        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("Enter left for "+ data);
        root.left=createTree();
        System.out.println("Enter right for "+ data);
        root.right=createTree();
        return root;
    }

    public static void main(String args[]){
        System.out.println("Enter data ");
        Node root=createTree();
        System.out.println("root value is: " + root.data);
    }
}
