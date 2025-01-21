package matrix;

public class DetermineColorofaChessboardSquare {

    public static boolean squareIsWhite(String coordinates) {
    char ch=coordinates.charAt(0);
    int n=coordinates.charAt(1)-'0';
    if(ch=='a' || ch=='c' || ch=='e' || ch=='g') {
        if (n % 2 == 0) return true;
    }else{ if(n%2!=0) return true;}
    return false;
    }
    public static void main(String[] args) {
        String coordinates="a1";
        System.out.println(squareIsWhite(coordinates));
    }

}
