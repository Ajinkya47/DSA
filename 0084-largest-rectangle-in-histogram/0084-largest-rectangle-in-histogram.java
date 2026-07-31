class Solution {


    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> st1= new Stack<>();

        
        int[] nse = new int[n];
        for(int i =n-1;i>=0;i--){
            while(!st1.isEmpty() && heights[st1.peek()]>=heights[i]){

                st1.pop();

            }
            if(st1.isEmpty()){
                nse[i]=n;
            }
            else nse[i]=st1.peek();

            st1.push(i);
        }




        
        Stack<Integer> st= new Stack<>();

        
        int[] pse = new int[n];

        

        for(int i =0;i<n;i++){

            while(!st.isEmpty() &&  heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }
            else pse[i]=st.peek();
            st.push(i);

        }


        int Maxarea=0;

        for(int i =0;i<n;i++){

            int width = nse[i] - pse[i] - 1;
            int area = heights[i] * width;;

            Maxarea=Math.max(area,Maxarea);



        }


        return Maxarea;
 

        
    }
}