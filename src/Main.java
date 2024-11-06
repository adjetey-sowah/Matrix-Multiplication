import java.util.Scanner;;

public class Main {


    /**
     * @author Julius Adjetey Sowah
     *  
     * This program calculates to two matrixes giving the size and the 
     */
    
        public static void main(String[] args) {
            mainMenu();
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
            printMatrix(resultMatrix);
            
        }


    
        public static void mainMenu(){
            
            Scanner input = new Scanner(System.in);

            int colsA,rowsA,colsB,rowsB;

            // Declare the matrices A and B
            int [][] matrixA = null;
            int [][] matrixB = null;
            

            
        do {
            // Input for matrix A
            System.out.print("\nEnter the number of rows and columns for the first matrix (e.g., '2 3' for 2 rows and 3 columns): ");
            String[] matrixADimensions = input.nextLine().split(" ");
            rowsA = Integer.parseInt(matrixADimensions[0]);
            colsA = Integer.parseInt(matrixADimensions[1]);

            // Input for matrix B
            System.out.print("Enter the number of rows and columns for the second matrix (e.g., '3 2' for 3 rows and 2 columns): ");
            String[] matrixBDimensions = input.nextLine().split(" ");
            rowsB = Integer.parseInt(matrixBDimensions[0]);
            colsB = Integer.parseInt(matrixBDimensions[1]);

            // Check if matrices can be multiplied
            if (colsA != rowsB) {
                System.out.println("\nError: The number of columns in the first matrix must equal the number of rows in the second matrix for multiplication.");
                System.out.println("Please enter the dimensions again.");
            } else {
                System.out.println("\nThe matrices are compatible for multiplication.");
            }

            // Create matrices A and B with the given dimensions
            matrixA = new int[rowsA][colsA];
            matrixB = new int[rowsB][colsB];

            // Input values for matrix A
            System.out.println("Enter the values for the first matrix (A): ");
            for(int i= 0; i < rowsA; i++){
                for (int j = 0; j < colsA; j++){
                    System.out.printf("Enter the value for A[%d][%d]: ", i+ 1 , j+1);
                    matrixA[i][j] = input.nextInt();
                }
            }

            


            // Input values for matrix B
            System.out.println("\nEnter the values for the second matrix (B): ");
            for (int i = 0; i < rowsB; i++){
                for (int j = 0; j < colsB; j++){
                    System.out.printf("\nEnter value for B[%d][%d]: ", i+1, j +1);
                    matrixB[i][j] = input.nextInt();
                }
            }


        } while (colsA != rowsB);  // Repeat until the matrices are compatible

        input.close();


        // Call the function to multiply the matrices
        multiplyMatrix(matrixA, matrixB);


    }

    
    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        System.out.println();
        System.out.println("Solution");
        System.out.println("----------");
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

    }

    
    
    }
    
