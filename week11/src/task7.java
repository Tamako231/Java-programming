public class task7 {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int j1=(int)(Math.random()*matrix.length);
                int i1=(int)(Math.random()*matrix[i].length);

                int temp=matrix[i][j];
                matrix[i][j]=matrix[j1][i1];
                matrix[j1][i1]=temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
