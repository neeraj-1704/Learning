public class UpperBound {

    public static int print(int a[], int target , int n){
        int left = 0 ;
        int right = n ; 

        while(left < right) {

            int mid = left + (right - left)/2;

            if(a[mid] <= target){
                left = mid + 1; // right move
            }else {
                right = mid ; // left move
            }

        }
        return left ;
    }

    public static void main(String []args){
        int a[] = { 2, 3, 5,5, 6, 8, 10};
        int target = 7;
        int  n = a.length;
        int index =  print(a, target, n);
        System.out.println(index);
    }
}