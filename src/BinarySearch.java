public class BinarySearch {


    public static void main(String args[]){

     int nums[] = new int[] {1,2,3,4,5,6,7,8,9};


        binarySearch(3,nums);


        System.out.println(binarySearch(3,nums));
        System.out.println(binarySearch(4,nums));
        System.out.println(binarySearch(10,nums));
        System.out.println(binarySearch(11,nums));


        System.out.println(binarySearchRecursive(3,nums,0,nums.length-1));
        System.out.println(binarySearchRecursive(4,nums,0,nums.length-1));
        System.out.println(binarySearchRecursive(10,nums,0,nums.length-1));
        System.out.println(binarySearchRecursive(11,nums,0,nums.length-1));


    }


    public static int binarySearch(int findNum, int nums[]){

        int low=0;
        int high = nums.length-1;

        while(low<=high){

            int mid = low + (high-low)/2;

            if(nums[mid] == findNum ){
                return mid;
             } else if (findNum > nums[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }


        }

        return -1;
    }


    public static int binarySearchRecursive(int findNum, int nums[],int low,int high){


        if(low>high){
            return -1;
        }

        int mid = low + (high-low)/2;

        if(nums[mid] == findNum){

            return mid;
        } else if (findNum > nums[mid]){
            return binarySearchRecursive(findNum,nums,mid+1,high);
        } else{
            return binarySearchRecursive(findNum, nums, low,mid-1);
        }


    }


}
