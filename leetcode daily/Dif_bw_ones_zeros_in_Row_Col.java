import java.util.Scanner;

public class Dif_bw_ones_zeros_in_Row_Col {
    public static void onesMinusZeros(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int[] row_1_array=new int[row];
        int[] row_0_array=new int[row];
        int[] col_1_array=new int[col];
        int[] col_0_array=new int[col];
        //making row array to contain number of 1's and 0's
        for (int i=0; i<row;i++)
        {
            int count=0;
            for (int j=0; j<col;j++)
            {
                if(grid[i][j]==1)
                    count++;
            }
            row_1_array[i]=count;
            row_0_array[i]=row-count;
        }
        //making a column array to contain number of 1's and 0's
        for (int j=0; j<col;j++)
        {
            int count=0;
            for (int i=0; i<row;i++)
            {
                if(grid[i][j]==1)
                    count++;
            }
            col_1_array[j]=count;
            col_0_array[j]=col-count;
        }
        int[][] ones=new int[row][col];
        int[][] zeros=new int[row][col];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                ones[i][j]=row_1_array[i]+col_1_array[j];
                zeros[i][j]=row_0_array[i]+col_0_array[j];
            }
        }
        int[][] diff=new int[row][col];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                diff[i][j]=ones[i][j]-zeros[i][j];
            }
        }
        System.out.println("The difference array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(diff[i][j]<0)
                    System.out.print(" "+diff[i][j]+ "  ");
                else    
                    System.out.print("  "+diff[i][j]+"  ");
            }
            System.out.println(); // Move to the next line for the next row
        }
        // for (int i=0;i<row_0_array.length;i++)
        //     System.out.println(row_0_array[i]);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows and columns from the user
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int numCols = scanner.nextInt();

        // Create a 2D array
        int[][] array2D = new int[numRows][numCols];

        // Get user input for each element in the array
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                array2D[i][j] = scanner.nextInt();
            }
        }

        // Display the 2D array
        System.out.println("The 2D array you entered:");

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
        int[][] darray = new int[numRows][numCols];
        // darray=
        onesMinusZeros(array2D);
        //displaying the Difference array
        // for (int i = 0; i < numRows; i++) {
        //     for (int j = 0; j < numCols; j++) {
        //         System.out.print(array2D[i][j] + " ");
        //     }
        //     System.out.println(); // Move to the next line for the next row
        // }
    }
}
