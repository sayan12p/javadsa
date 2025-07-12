package interviewquestions;

public class AmzonPrimeGames {

    public static int minval(int[] power,int armor){
        int maxval=power[0];
        int totalhealth=0;
        int n=power.length;
        for(int i=0;i<power.length;i++){
            totalhealth+=power[i];
            maxval=Math.max(totalhealth,maxval);
        }

        return totalhealth-Math.min(maxval,armor)+1;
    }
    public static void main(String[] args) {
        int[] power =new int[]{3,4,12};
        System.out.println(minval(power,4));
    }
}
