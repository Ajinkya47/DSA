class Solution {
    public int findContentChildren(int[] g, int[] s) {

        int greedIndex=0;
        int cookieIndex=0;
        Arrays.sort(g);
        Arrays.sort(s);

        while(greedIndex< g.length && cookieIndex< s.length){
            if(s[cookieIndex]>=g[greedIndex]){
                greedIndex++;
                cookieIndex++;
            }
            else{
                cookieIndex++;
            }
        }

        return greedIndex;
        
    }
}