package array;

public class ReverseNumber {

    public static long reverseNumber(long n) {
        // Write your code here
        String s=String.valueOf(n);
        int len=s.length();int count=0;
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)=='0') count++;
        }
        if(count>0)
            s=s.substring(0,len-count+1);
        n=Long.parseLong(s);
        long reversednum=0;
        while(n!=0){
            reversednum=reversednum*10 +n%10;
            n=n/10;
        }
        return reversednum;
    }
    public static void main(String[] args) {
        long n=12345;
        System.out.println(reverseNumber(n));

    }
}
