public class BinarySearch1 {
    public static int print ( int arr[], int n, int target){
        int left = 0 ;
        int right = n ;

        while(left <= right){

            int mid = (left + right)/2;
            // if mid found return
            if(arr[mid] == target)  return mid;
            // if target greater than mid 
            if(arr[mid] < target)  return left = mid + 1;
            // if target less than the mid 
            else {
                right  = mid - 1 ;
            }

        }

        return -1;
    }

    public static void main(String [] args) {
        int a[] = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};
        int target = 45; 
        int n = a.length;
        int index = print(a, n, target);
        System.out.println("the Index is number is "+index);
    }
}