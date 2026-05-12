package twopointers;

public class BinarySearch {

    public static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end -start)/2; // end- start -- overflow  in cae of big integer
            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] <target){
                start  = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70};
        int target = 50;
        int index = binarySearch(arr,target);
        if(index != -1){
            System.out.println("Element is found --> "+index);
        }
        else{
            System.out.println("Element is not found ");
        }
    }
}
