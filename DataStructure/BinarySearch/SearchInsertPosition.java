public class SearchInsertPosition{

    public static int print(int a[] , int target , int n){
        int left =0 ;
        int right  = a.length;

        while(left < right){
            int mid = left + (right - left)/2;
            if(a[mid] < target){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left ;

    }

    public static void main(String []args){
        int a[] = { 2,3,5,7,9};
        int target = 6;
        int n = a.length;
       int index =  print(a, target, n);
       System.out.println(index);
    }
}