public class MatrixMultiplication {

    public static void main(String[] args) {
        int[][] matrix1=
                {{1,2,3},
                {4,5,6}};
        int[][] matrix2=
                {{1,2,3},
                {4,5,6},
                {7,8,9}};
        int[][] matrix3=matrixMultiplication(matrix1,matrix2);
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] matrixMultiplication(int[][] matrix1,int[][] matrix2){
        int[][] matrix3=new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                int sum=0;
                for (int k = 0; k < matrix1[i].length; k++) {
                    int value = matrix1[i][k] * matrix2[k][j];
                    sum += value;
                }
                matrix3[i][j]=sum;
            }
        }
        return matrix3;
    }
}
