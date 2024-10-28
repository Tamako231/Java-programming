public class Task6 {
    public static void main(String[] args) {
        float[] mylist=new float[5];

        for (int i=0;i<mylist.length;i++){
            mylist[i]=(float)Math.random()*10;
        }

        for (float v : mylist) {
            System.out.println(v + "  ");
        }

        float max=mylist[0];
        for (float v : mylist) {
            if (v>max){
                max=v;
            }
        }
        System.out.println();
        System.out.println("Max: "+max);
    }
}
