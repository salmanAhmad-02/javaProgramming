class ContainerWithMostWater{
    public static int maxArea(int[] height) {
        int start=0, end=height.length-1,   maxArea=0;
        while(start<end){
            int l=end-start;
            int area;
            if(height[start] < height[end]){
                area = l * height[start];
                start +=1;
            }
            else{
                area = l * height[end];
                end -=1;
            }
            if(area>maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
    public static void main(String[] args){
        int[] heights={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(heights));   //49
    }
}