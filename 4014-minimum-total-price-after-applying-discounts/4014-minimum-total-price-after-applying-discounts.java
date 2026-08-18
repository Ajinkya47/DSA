class Solution {
    public double minPrice(int[] prices, int[] discounts) {

        Arrays.sort(prices);
        Arrays.sort(discounts);

        int n= discounts.length;
        int m=prices.length;

        double totalMin=0;
        int priceIndex=m-1;
        int discountIndex=n-1;

        while(priceIndex>=0 && discountIndex>=0){
            totalMin+=prices[priceIndex]*(100-discounts[discountIndex])/100.0;
            priceIndex--;
            discountIndex--;
        }

        while(priceIndex>=0){
            totalMin+=prices[priceIndex];
            priceIndex--;
        }

        return totalMin;

        
    }
}