package prefixsum;

import java.util.Arrays;

public class MinimumPenaltyforaShop {

    public static int bestClosingTime(String customers) {
        int n = customers.length();
        int cntN = 0, cntY = 0;

        int[] prefixN = new int[n + 1];
        int[] suffixY = new int[n + 1];

        // Compute prefixN array
        for (int i = 0; i < n; i++) {
            cntN += (customers.charAt(i) == 'N' ? 1 : 0);
            prefixN[i + 1] = cntN;
        }

        // Compute suffixY array
        for (int i = n - 1; i >= 0; i--) {
            cntY += (customers.charAt(i) == 'Y' ? 1 : 0);
            suffixY[i] = cntY;
        }

        // Find the best hour
        int bestHour = 0;
        int minPenalty = Integer.MAX_VALUE;

        for (int i = 0; i <= n; i++) {
            int penalty = prefixN[i] + suffixY[i];
            if (penalty < minPenalty) {
                minPenalty = penalty;
                bestHour = i;
            }
        }

        return bestHour;
    }
    public static void main(String[] args) {
        String customers="YYYY";
        System.out.println(bestClosingTime(customers));
    }
}
