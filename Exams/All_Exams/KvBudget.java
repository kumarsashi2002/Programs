public class KvBudget {
    public static int budgetShopping(int n, List<Integer> bundleQuantities, List <Integer> bundleCosts) {
        return exploreCombinations(n, 0, 0, bundleQuantities, bundleCosts);
    }

    public static int exploreCombinations(int budget, int currentQuantity, int currentCost, List<Integer> bundleQuantities, List<Integer> bundleCosts) {
        int maxQuantity = currentQuantity;
        for (int i = 0; i < bundleQuantities.size(); i++) {
            if (currentCost + bundleCosts.get(i) <= budget) {
                int amount = exploreCombinations(budget, currentQuantity + bundleQuantities.get(i), currentCost + bundleCosts.get(i), bundleQuantities, bundleCosts);
                if (maxQuantity < amount) {
                    maxQuantity = amount;
                }
            }
        }
        return maxQuantity;
    }



        // Shortest palindrome
        char[] str = s.toCharArray();
        int n=s.length();
        int table[][] = new int[n][n];
        int l, h, gap;
 
        for (gap = 1; gap < n; ++gap)
        for (l = 0, h = gap; h < n; ++l, ++h){
            table[l][h] = (str[l] == str[h])? table[l+1][h-1] : (Integer.min(table[l][h-1], table[l+1][h]) + 1);
        }
        return table[0][n-1];
}
