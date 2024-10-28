public class Task21 {
    public static void main(String[] args) {
        int[]list={2,4,7,10,11,45,50,59,60,66,69,70,79};
        int j=binarySearch(list,2);
        int k=binarySearch(list,1);
        System.out.println("Key index"+j);
        System.out.println("Key index"+k);

    }
    public static int binarySearch(int[] list,int target){
        int low=0;
        int high=list.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(list[mid]==target){
                return mid;
            }
            else if(list[mid]>target){
                high=mid-1;
            }
            else if(list[mid]<target){
                low=mid+1;
            }

        }
        return -1;
    }

}
