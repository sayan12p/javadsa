package String;
//https://www.youtube.com/watch?v=MGPHPadxhtQ&t=214s
public class CountBinarySubstrings {

    public static int countBinarySubstrings(String s) {
        int prev=0;int count =0; int i=1; int cur=1;// to count the no of characters at 0th index we are taking the cur as 1
        while(i<s.length()){
            if(s.charAt(i-1)!=s.charAt(i)){
                count+=Math.min(prev,cur);
                prev=cur;
                cur=1;
            }else{
                cur++;
            }
            i++;
        }
        return count+=Math.min(prev,cur);
    }
    public static void main(String[] args) {
        String s="00110011";
        System.out.println(countBinarySubstrings(s));
    }
}
