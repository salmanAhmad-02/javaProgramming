/*
In right side we have Ocean and array contains height of buildings. How many buildings will get Ocean view?
i/p:[4, 2, 6, 18, 5, 7, 12, 6]
o/p: 3
*/
class OceanViewProblem1{
    public static int countBuildingsWithOceanView(int[] heights){
        if(heights==null || heights.length==0)
            return 0;
        int count=0;
        int maxHeight=0;

        for(int i=heights.length-1; i>=0; i--){
            if(heights[i]>maxHeight){
                maxHeight=heights[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] heightOfBuildings={4, 2, 6, 18, 5, 7, 12, 6};
        int buildingsGetsView=countBuildingsWithOceanView(heightOfBuildings);    //3

        System.out.println("Total Building That Gets Ocean View Are : "+buildingsGetsView);
    }
}