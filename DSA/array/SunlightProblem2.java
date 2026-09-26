/*
In left side we have sun and array contains height of buildings. Get index of all buildings which will get sun light?
i/p:[4, 2, 6, 8, 5, 7, 12, 6]
o/p: [0, 2, 3, 6]
*/
class SunlightProblem2{
    public static int[] getIndexOfVisibleBuildings(int[] heights){
        if(heights==null || heights.length==0){
            return new int[0];
        }
        int size=countVisibleBuildings(heights);
        int[] indexes=new int[size];
        int maxHeight=0;
        int count=0;

        for(int i=0; i<heights.length; i++){
            if(heights[i]>maxHeight){
                maxHeight=heights[i];
                indexes[count]=i;
                count++;
            }
        }
        return indexes;
    }
    public static int countVisibleBuildings(int[] heights){
        if(heights==null || heights.length==0)
            return 0;
        int maxHeight=0;
        int buildingsCount=0;

        for(int n:heights){
            if(n>maxHeight){
                maxHeight=n;
                buildingsCount++;
            }
        }
        return buildingsCount;
    }
    public static void main(String[] args){
        int[] input={4, 2, 6, 8, 5, 7, 12, 6};
        int[] result=getIndexOfVisibleBuildings(input);

        System.out.print("Indexes Are : ");
        for(int a:result){
            System.out.print(a+", ");
        }
        System.out.println("\n");
    }
}
