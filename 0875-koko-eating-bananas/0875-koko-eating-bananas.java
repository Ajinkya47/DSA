class Solution {
    private int koko(int[] piles, int hourlySpeed) {
        int totalHrs = 0;
        for (int bananas : piles) {
            // FIXED: Convert to double first, then use Math.ceil
            totalHrs += Math.ceil((double) bananas / hourlySpeed);
        }
        return totalHrs;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        
        // Find max in piles
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalHrs = koko(piles, mid);
            
            // FIXED: Compare with h, not mid
            if (totalHrs <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }
}