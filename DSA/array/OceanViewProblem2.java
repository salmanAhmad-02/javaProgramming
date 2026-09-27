/*
*    In right side we have Ocean and array contains height of buildings. Get all the index of buildings which will get Ocean view?
*    i/p:[4, 2, 6, 18, 5, 7, 12, 6]
*    o/p: [3,6,7]
*/
class OceanViewProblem2{
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
    public static int[] getBuildingIndexesWithOceanView(int[] heights){
        if(heights==null || heights.length==0)
            return new int[0];
        int countSize=countBuildingsWithOceanView(heights);
        int[] indices=new int[countSize];

        int maxHeight=0;
        int count=0;

        for(int i=heights.length-1; i>=0; i--){
            if(heights[i]>maxHeight){
                maxHeight=heights[i];
                indices[count]=i;
                count++;
            }
        }
        return indices;
    }
    public static void main(String[] args){
        int[] sampleHeights={4, 2, 6, 18, 5, 7, 12, 6};
        int[] result=getBuildingIndexesWithOceanView(sampleHeights);

        if(result.length == 0){
            System.out.println("\nInvalid Input!");
            return;
        }
        System.out.print("Indexes Are : [");
        for(int i=result.length-1; i>=0; i--){
            if(i !=0 )
                System.out.print(result[i]+", ");
            else
                System.out.print(result[i]+"]");
        }
        System.out.println("\n");
    }
}