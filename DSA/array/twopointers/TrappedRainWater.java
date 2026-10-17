class TrappedRainWater{
    public static int trap(int[] height) {
        int start=0, end=height.length-1, leftMax=height[start], rightMax=height[end];
        int  maxWater=0;
        while(start<end){
            if(height[start]<height[end]){
                if(height[start]<leftMax){
                    maxWater+=(leftMax-height[start]);
                }else{
                    leftMax = height[start];
                }
                start++;
            }
            else{
                if(height[end]<rightMax){
                    maxWater+=(rightMax-height[end]);
                }else{
                    rightMax = height[end];
                }
                end--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args){
        int[] heights={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(heights));   //6
    }
}