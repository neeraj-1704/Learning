public class BinarySearch1 {
    public static int print(int a[] , int target , int n){
        int left = 0 ;
        int right = n - 1 ;

        while (left <= right) {
            int mid = (right + left) / 2 ; 
            if(a[mid] == target) return mid ;

            if(a[mid] < target) {
                left = mid + 1;  // will visite the rigth
            }else {
                right = mid - 1; // will visite the left
            }
        }
        return -1;
    }
    public static void main(String []args){
        int a[] = { 1,4,6,7,8,9,10};
        int target = 9;
        int n = a.length;
      int index =   print(a, target , n);
      System.out.println(index);

    }
}


// leetcode solutions 
// class Solution {
//     public int search(int[] nums, int target) {
//         int left = 0;
//         int right = nums.length - 1; // Ensure `right` is correctly set

//         while (left <= right) { // Correct condition to prevent overflow
//             int mid = left + (right - left) / 2; // Prevent overflow

//             if (nums[mid] == target) {
//                 return mid; // Found the target
//             }
//             if (nums[mid] < target) {
//                 left = mid + 1; // Move right
//             } else {
//                 right = mid - 1; // Move left
//             }
//         }
//         return -1; // Target not found
//     }}q