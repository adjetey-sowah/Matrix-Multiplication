import java.util.Arrays;

public class Main {


    /**
     * @author Julius Adjetey Sowah
     *  
     * This program calculates to two matrixes giving the size and the 
     */
    
        public static void main(String[] args) {
            int[][] A = {{12,2,4},{10,1,1}};
            int[][] B = {{2,1,}, {1,2}, {1,1}};
    
            int rowsA = A.length;
            int coslA = A[0].length;
            int colsB = B[0].length; 
            
            int[][] C = new int[rowsA][colsB];
    
    
            for (int i = 0; i < rowsA; i++){
                
                for (int j = 0; j < colsB; j++){
    
                    for (int k = 0; k < coslA;k++){
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
    
            System.out.println(Arrays.deepToString(C));
        }
    
    
        /**
         * The multiplyMatrix function performs the actual calculations and 
         * displays the result.
         * 
         * @param matrixA
         * @param matrixB
         */
    
        public static void multiplyMatrix(int[][] matrixA, int[][] matrixB){
    
            int rowsA = matrixA.length;
            int colsA = matrixA[0].length;
            int colsB = matrixB[0].length;
    
            int[][] resultMatrix = new int[rowsA][colsB];
            
            for (int i = 0; i < rowsA; i++){
                
                for (int j = 0; j < colsB; j++){
    
                    for (int k = 0; k < colsA; k++){
                        resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }
    
    
            // Print the result
            // printResult(resultMatrix);
            
        }
    
        public static void mainMenu(){
            System.out.println("MATRIX CALCULATOR");
            System.out.println("---------------------");
            System.out.println();
            System.out.println("Enter number of rows for the first matrix : ");
            System.out.println("Enter number of columns for the first matrix : ");
    
            System.out.println("Enter number of rows for the second matrix : ");
            System.out.println("Enter number of columns for the  matrix : ");
    
            
        }
    
    
    }
    
