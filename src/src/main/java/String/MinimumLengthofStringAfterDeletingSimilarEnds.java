package String;

//https://www.youtube.com/watch?v=BwniVdjZGvc

public class MinimumLengthofStringAfterDeletingSimilarEnds {

    public static int minimumLength(String s) {
        int n=s.length();
        int leftmostindex=0;
        int rightmostindex=n-1;
        while(s.charAt(leftmostindex)==s.charAt(rightmostindex) && leftmostindex<rightmostindex){
            char ch=s.charAt(leftmostindex);
            while(leftmostindex<rightmostindex && s.charAt(leftmostindex)==ch){
                leftmostindex++;
            }
            while(leftmostindex<=rightmostindex && s.charAt(rightmostindex)==ch){
                rightmostindex--;
            }
        }
    return rightmostindex-leftmostindex+1;
    }
    public static void main(String[] args) {
        String s="cabaabac";
        System.out.println(minimumLength(s));
    }
}
