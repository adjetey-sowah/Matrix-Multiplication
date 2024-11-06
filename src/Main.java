import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] A = {{12, 2, 4}, {10, 1, 1}};
        int[][] B = {{2, 2}, {2, 1}, {1, 1}};
        int width = A.length;
        int height = A[0].length;

        int[][] C = new int[width][height];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {

                for (int k = 0; k < B.length; k++) {
                    C[i][j] = A[i][k] * B[k][j];

                }
            }
        }

        System.out.println(Arrays.deepToString(C));
    }
}
