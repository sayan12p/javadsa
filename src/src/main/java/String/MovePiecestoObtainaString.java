package String;

public class MovePiecestoObtainaString {

    public static boolean canChange(String start, String target) {
        int indexS=0;
        int indexT=0;
        if(start.length()!=target.length()) return false;
        while(indexS< start.length() || indexT<target.length()) {
            while (indexS < start.length() && start.charAt(indexS) == '_') {
                indexS++;
            }
            while (indexT < target.length() && target.charAt(indexT) == '_') {
                indexT++;
            }
            //if reached end
            if(indexS==start.length() && indexT==target.length()){
                return true;
            }

            if(indexS==start.length() || indexT==target.length() || start.charAt(indexS)!=target.charAt(indexT)){
                return false;
            }
            if(indexS<start.length() && indexT<target.length()){
                if(target.charAt(indexT)=='L' && indexS<indexT){
                    return false;
                }
                if(start.charAt(indexT)=='R' && indexS>indexT){
                    return false;
                }
            }
            indexT++;
            indexS++;
        }
        return true;

    }
    public static void main(String[] args) {
        String s="_R";String t="R_";
        System.out.println(canChange(s,t));
    }
}
