/*
852. Peak Index in a Mountain Array

You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.

 

Example 1:
    Input: arr = [0,1,0]
    Output: 1

Example 2:
    Input: arr = [0,2,1,0]
    Output: 1

Example 3:
    Input: arr = [0,10,5,2]
    Output: 1

Constraints:
    3 <= arr.length <= 105
    0 <= arr[i] <= 106
    arr is guaranteed to be a mountain array. 
*/
public class PeakIndexInMountainArray{
    public static int peakIndex(int[] arr){
        int st = 0, end = arr.length-1;
        while(st < end){
            int mid = st + (end - st)/2;
            if(arr[mid] > arr[mid+1])   
                end = mid;
            else    
                st = mid + 1;
        }
        return end;
    }
    public static void main(String[] args) {
        int[] example = {12,14,26,29,32,45,65,43,32,21};
        int idx = peakIndex(example);
        System.out.println("Peak element is at indext "+idx + " and peak element is : "+example[idx]);
    
    }
} 
