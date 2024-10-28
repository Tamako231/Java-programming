public class Task20 {
    public static void main(String[] args) {
        int[]list={1,4,8,5,9,7};
        int i=linearsearch(list,8);
        System.out.println(i);
    }
    public static int linearsearch(int[] list,int x) {
        for (int i=0;i<list.length;i++){
            if (list[i]==x){
                return i;
            }
        }
        return -1;
    }
}
