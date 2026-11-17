/* 
4. Median of Two Sorted Arrays

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:
    Input: nums1 = [1,3], nums2 = [2]
    Output: 2.00000
    Explanation: merged array = [1,2,3] and median is 2.

Example 2:
    Input: nums1 = [1,2], nums2 = [3,4]
    Output: 2.50000
    Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

    nums1.length == m
    nums2.length == n
    0 <= m <= 1000
    0 <= n <= 1000
    1 <= m + n <= 2000
    -106 <= nums1[i], nums2[i] <= 106
*/

public class MedianOfTwoSortedArrays {
    //Linear Version in O(m+n) complexity
    public static double findMedianSortedArrays1(int[] arr1, int[] arr2){
        int[] merged = new int[arr1.length + arr2.length]; 
        int idx1=0, idx2=0, idx3=0;
        while(idx1<arr1.length && idx2 <arr2.length){
            if(arr1[idx1]<arr2[idx2]){
                merged[idx3++] = arr1[idx1++];
            }
            else{
                merged[idx3++] = arr2[idx2++];
            }
        }
        while(idx1<arr1.length){
            merged[idx3++] = arr1[idx1++];
        }
        while(idx2<arr2.length){ 
            merged[idx3++] = arr2[idx2++];
        }
        int n = merged.length;
        if(n % 2 == 1){
            return merged[n/2];
        }
        else{
            return (merged[n/2] + merged[(n/2)-1])/2.0;
        }
    }
    public static void main(String[] args) {
        int[] a1 = {1,3,5,6,9};
        int[] a2 = {2,4,8,16};

        double median = findMedianSortedArrays1(a1, a2);

        System.out.println("Median is : "+median);
    }
}