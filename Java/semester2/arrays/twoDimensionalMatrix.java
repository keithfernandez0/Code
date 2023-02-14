package semester2.arrays;

public class twoDimensionalMatrix {
    public static void main(String[] args) {

        int[][] matrix = new int[3][4];
    
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[i].length; j++) 
            {
                matrix[i][j] = (int)(Math.random() * 100);
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println(matrix[row][col] + "|");
            }
            System.out.println();
        }

        int sumByRow = 0;
        int mat[][] = {
                        {3,1,2},
                        {6,1,5},
                        {7,9,3},
                        {8,3,2}
        };

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                sumByRow += mat[row][col];
            }
            System.out.println("Sum of elements in row: "+row+" "+sumByRow);
            sumByRow = 0;
        }
    }
}
