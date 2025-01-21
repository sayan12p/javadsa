package String;

public class MinimumSwapstoMakeStringsEqual {

    public static int minimumSwap(String s1, String s2) {
    int x1=0;
    int x2=0;
    int y1=0;
    int y2=0;
    for(int i=0;i<s1.length();i++){
        char c1=s1.charAt(i);
        char c2=s2.charAt(i);
        if(c1==c2) continue;
        else if(c1=='x') {
            x1++;
        }else if(c1=='y'){
            y1++;
        }
        if (c2=='x') {
            x2++;
        }else y2++;

    }
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(y1);
        System.out.println(y2);
    if((x1+x2)%2!=0 || (y1+y2)%2!=0) return -1;
    int swaps=x1/2+y1/2+(x1%2)*2;
    return swaps;

    }
    public static void main(String[] args) {
        String s1 = "xx"; String s2 = "yy";
        System.out.println(minimumSwap(s1,s2));
    }
}
