public class twoDarray {
    public static void main(String[] args) {

        // remember that we count from 0 instead of 1.

        int[][] numArray = new int[2][2];       // 3x3
        String[][] names = new String[3][4];    // 4x5
        char[][] info = new char[8][6];         // 9x7
        double[][] matrix = new double[3][3];   // 4x4

        int[][] array = { // you may specify by element as well
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println("Number of rows: " + numArray.length);
        System.out.println("Number of columns: " + numArray[0].length);

        // raggedy ass array

        int[][] raggedMatrix = {
            {1,2,3,4,5},
            {2,3,4,5},
            {3,4,5},
            {4,5},
            {5}
        };
    }
}
