class Sort2{
    public static int partition(int[] a, int lb, int ub){
        int pivot=a[lb];
        int st=lb, end=ub;

        while(st<end){
            while(st < ub && a[st]<=pivot){
                st++;
            }
            while(end > lb && a[end]>pivot){
                end--;
            }
            if(st<end)
                swap(a, st, end);
        }
        swap(a, lb, end);
        return end;
    }
    public static void quickSort(int[] a, int lb, int ub){
        if(lb<ub){
            int p=partition(a, lb, ub);
            quickSort(a,lb, p-1);
            quickSort(a,p+1,ub);
        }
    }
    public static void swap(int[] a, int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args){
        int[] nums={4,5,8,3,12,6,9,4};
        quickSort(nums,0, nums.length-1);

        for(int n:nums){
            System.out.print(n+" ");
        }

    }
}