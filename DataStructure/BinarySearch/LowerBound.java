public class LowerBound {
    public static int print(int a[], int target , int n){
        int left = 0 ;
        int right = n ;

        while (left < right) {
            int mid  = left + (right - left) / 2;
            
            if(a[mid] < target) {
                left = mid + 1; // move right 
            }else {
                right = mid ; // move left
            }
        }
        return left; // The correct insertion index (lower bound)
    }
    public static void main(String [] args){
        int a[] = { 2, 3, 5,5, 6, 8, 10};
        int target = 5;
        int  n = a.length;
        int index =  print(a, target, n);
        System.out.println(index);
    }
}