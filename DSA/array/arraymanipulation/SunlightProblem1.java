/*
In left side we have sun and array contains height of buildings. How many buildings will get sun light?
i/p:[4, 2, 6, 8, 5, 7, 12, 6]
o/p: 4
*/
class SunlightProblem1{
    public static int countVisibleBuildings(int[] heights){
        if(heights==null || heights.length==0)
            return -1;
        int maxHeight=heights[0];
        int buildingsCount=1;

        for(int i = 1; i < heights.length; i++){
            if(heights[i]>maxHeight){
                maxHeight=heights[i];
                buildingsCount++;
            }
        }
        return buildingsCount;
    }
    public static void main(String[] args){
        int[] heights={4, 2, 6, 8, 5, 7, 12, 6};
        int count=countVisibleBuildings(heights);

        if(count==-1)
            System.out.println("No buildings are there !");
        else
            System.out.println("Total "+count+" buildings will get sunlight.");
    }
}
