package linklist;



public class ConvertBSTtoDLL {

    public static Node convertBSTtoDLL(Node root){
        if(root ==null) return root;
        convertBSTtoDLLutil(root);
        if(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static Node convertBSTtoDLLutil(Node root){
        if(root==null) return root;
        if(root.left!=null){
            Node leftroot=convertBSTtoDLLutil(root.left);
            if(leftroot.right!=null) leftroot=leftroot.right;
            leftroot.right=root;
            root.left=leftroot;
        }
        if(root.right!=null){
            Node rightroot=convertBSTtoDLLutil(root.right);
            if(rightroot.left!=null) rightroot=rightroot.left;
            root.right=rightroot;
            rightroot.left=root;
        }
        return root;
    }
    public static void main(String[] args) {
        Node n1=new Node(3);
        Node n2=new Node(5);
        Node n3=new Node(1);
        Node n4=new Node(6); Node n5=new Node(2);
        Node n6=new Node(0); Node n7=new Node(8);
        Node n8=new Node(7); Node n9=new Node(4);
        Node root=n1; n1.left=n2;n1.right=n3; n2.left=n4;n2.right=n5;n3.left=n6;n3.right=n7;n5.left=n8;n5.right=n9;
        Node head = convertBSTtoDLL(root);
        while(head!=null){
            System.out.print(head.data + " ");
            head=head.right;
        }

    }

    static class Node{

        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
}
