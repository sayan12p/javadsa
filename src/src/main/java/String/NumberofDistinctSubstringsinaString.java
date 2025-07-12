package String;

class Node{

    Node[] links=new Node[26];
    boolean flag;

    public boolean containkey(char ch){
        return links[ch-'a']!=null;
    }

    public Node getkey(char ch){
        return links[ch-'a'];
    }

    public void insertNode(Node a,char ch){
        links[ch-'a']=a;
    }

    public void setflag(){
        this.flag=true;
    }
}

public class NumberofDistinctSubstringsinaString {

    public static void main(String[] args) {
        String s = "striver";
        Node root = new Node();
        int cnt = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            Node node = root;
            for (int j = i; j < n; j++) {
                if (!node.containkey(s.charAt(j))) {
                    node.insertNode(new Node(), s.charAt(j));
                    cnt++;
                }
                node = node.getkey(s.charAt(j));
            }
        }
        System.out.println("no of substring: "+(cnt+1));
    }
}
