package semester2.arrays;

public class twoDimensionalMatrix {
    public static void main(String[] args) {

        int[][] matrix = new int[3][4];
    
        for (int i = 0; i < matrix.length; i++) 
        {
            System.out.println("*OUTER* loop count [i]: " + i);
            for (int j = 0; j < matrix[i].length; j++) 
            {
                matrix[i][j] = (int)(Math.random() * 100);
                System.out.println("*INNER* loop count [j]: " + j);
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            System.out.println("Outer loop count [row]: " + row);
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println(matrix[row][col] + "|");
                System.out.println("Inner loop count [col]: " + col);
            }
            System.out.println();
        }
    }
}
