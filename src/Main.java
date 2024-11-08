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
            * Multiplies two compatible matrices and displays the result.
            * 
            * Given matrices `matrixA` and `matrixB`, this method calculates        their 
            * product if the number of columns in `matrixA` equals the number       of rows in `matrixB`.
            * The result is stored in `resultMatrix` and displayed.
            * 
            * @param matrixA The first matrix to multiply, with dimensions          [rowsA][colsA].
            * @param matrixB The second matrix to multiply, with dimensions         [colsA][colsB].
            * @throws IllegalArgumentException if matrices are incompatible for         multiplication.
            */

            public static void multiplyMatrix(int[][] matrixA, int[][] matrixB){
        
                int rowsA = matrixA.length;
                int colsA = matrixA[0].length;
                int colsB = matrixB[0].length;
        
                int[][] resultMatrix = new int[rowsA][colsB];

                // Multiply matrices: row of A with column of B
                
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


    /**
     * Prompts the user to enter matrix dimensions as a single string, e.g., "2 3" for 2 rows and 3 columns,
     * and returns the input. Retries on invalid input.
     *
     * @return A string with the matrix dimensions entered by the user.
     */
            private static String getMatrixSize(){

                Scanner input = new Scanner(System.in);     // Scanner for user input
                String  matrixADimensions = "";

                try{
                    //  Take input for the rows and column for matrix A
                    System.out.print("(e.g., '2 3' for 2 rows and 3 columns): ");       // Prompt for input
                    matrixADimensions = input.nextLine();       // Capture user input
                }
                catch (Exception e){
                    System.out.println(e.getMessage());     // Print error message if an exception occurs
                    getMatrixSize(); // Retry by calling the function recursively
                }

                return matrixADimensions;   // Return the entered

            }



    
        public static void mainMenu(){
            

                Scanner input = new Scanner(System.in);
            int colsA,rowsA,colsB,rowsB;

            // Declare the matrices A and B
            int [][] matrixA = null;        // To hold the values for matrix A
            int [][] matrixB = null;        // to hold the elements for matrixB 
            
        try {





        do {



                System.out.print("\nEnter the number of rows and columns for the first matrix ");
                String sizeA = getMatrixSize();
                rowsA = Integer.parseInt(sizeA.split(" ")[0]);
                colsA = Integer.parseInt(sizeA.split(" ")[1]);


                // Take input for the rows and column for matrix B
                System.out.print("Enter the number of rows and columns for the second matrix ");
                String sizeOfMatrixB = getMatrixSize();
                rowsB = Integer.parseInt(sizeOfMatrixB.split(" ")[0]);
                colsB = Integer.parseInt(sizeOfMatrixB.split(" ")[1]);

                // Check if matrices can be multiplied by comparing the number of columns for matrix A with the rows of colums B;
                if (colsA != rowsB) {
                    System.out.println("\nError: The number of columns in the first matrix must equal the number of rows in the second matrix for multiplication.");
                    System.out.println("Please enter the dimensions again.");
                } else {
                    System.out.println("\nThe matrices are compatible for multiplication.");
                }

            // Create matrices A and B with the given dimensions
            matrixA = new int[rowsA][colsA];
            matrixB = new int[rowsB][colsB];

            // Take the Input values for matrix A
            System.out.println("Enter the values for the first matrix (A): ");
            for(int i= 0; i < rowsA; i++){
                for (int j = 0; j < colsA; j++){
                    boolean validInput = false;
                    while (!validInput) {
                        System.out.printf("\nEnter the value for A[%d][%d]: ", i+ 1 , j+1);
                        
                        if (input.hasNextInt()){        // Check if input is an integer.
                            matrixA[i][j] = input.nextInt();        
                            validInput = true;      // Exit loop if input is valid
                        }

                        else {
                            System.out.println("Invalid  input: Please enter a valid integer.");
                            input.next();       // Consume the invalid input.
                        }
                        
                    // matrixA[i][j] = input.nextInt();
                }

            }

        }



            


            // Take the Input values for matrix B
            System.out.println("\nEnter the values for the second matrix (B): ");
            for (int i = 0; i < rowsB; i++){
                for (int j = 0; j < colsB; j++){
                    boolean validInput = false;
                    while (!validInput) {
                        System.out.printf("\nEnter value for B[%d][%d]: ", i+1, j +1);
                        
                        if (input.hasNextInt()) {  // check if input is an integer.
                            matrixB[i][j] = input.nextInt();
                            validInput = true;         // Exit loop if input is valid                   
                        }
                        else{
                            System.out.println("Invalid input. Please enter a valid integer");
                            input.next();       // Consume the invalid input;
                        }
                    }

                }
            }


        } while (colsA != rowsB);  // Repeat until the matrices are compatible

        input.close();      // Close Scanner after all input is gathered

        }
        catch (NumberFormatException numberFormatException){

            System.out.println("You entered a non-numeric value.\nEnter a valid number please.");
            mainMenu();     // Retry mainMenu if invalid number format is entered
        }

        catch (Exception e){
            System.out.println(e.getMessage());
            mainMenu();  // Retry mainMenu for general exceptions
        }
        // Call the function to multiply the matrices
        multiplyMatrix(matrixA, matrixB);


    }

    
        /**
         * Prints a matrix.
         * This helper method displays the matrix in a readable format.
         * @param matrix The matrix to display.
         */
    
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
    
