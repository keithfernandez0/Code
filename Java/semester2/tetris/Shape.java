import java.util.Random;

// https://github.com/janbodnar/Java-Tetris-Game/blob/master/com/zetcode/Shape.java

public class Shape {

    /*
     * I: Cyan
     * J: Blue
     * L: Orange
     * O: Yellow
     * S: Green
     * T: Purple/Pink
     * Z: Red
     */

    protected enum Tetromino {
        No_shape, Z_shape, S_shape, I_shape,
        T_shape, O_shape, L_shape, J_shape
    }

    private Tetromino pieceShape;
    private int[][] coords;
    private int[][][] coordsTable;

    protected void setShape(Tetromino shape) {

        for (int i = 0; i < 4 ; i++) {

            for (int j = 0; j < 2; ++j) {

                coords[i][j] = coordsTable[shape.ordinal()][i][j];
            }
        }

        pieceShape = shape;
    }

    private void initShape() {

        coords = new int[4][2];

        // Stores piece coordinate to buffer

        coordsTable = new int[][][] {
                { { 0, 0 },   { 0, 0 },   { 0, 0 },   { 0, 0 } },
                { { 0, -1 },  { 0, 0 },   { -1, 0 },  { -1, 1 } },
                { { 0, -1 },  { 0, 0 },   { 1, 0 },   { 1, 1 } },
                { { 0, -1 },  { 0, 0 },   { 0, 1 },   { 0, 2 } },
                { { -1, 0 },  { 0, 0 },   { 1, 0 },   { 0, 1 } },
                { { 0, 0 },   { 1, 0 },   { 0, 1 },   { 1, 1 } },
                { { -1, -1 }, { 0, -1 },  { 0, 0 },   { 0, 1 } },
                { { 1, -1 },  { 0, -1 },  { 0, 0 },   { 0, 1 } }
        };

        setShape(Tetromino.No_shape);
    }

    public Shape() {

        initShape();
    }

    private void setX(int index, int x) { 
        coords[index][0] = x; 
    }

    private void setY(int index, int y) { 
        coords[index][1] = y; 
    }

    public int x(int index) { 
        return coords[index][0]; 
    }

    public int y(int index) { 
        return coords[index][1]; 
    }

    public Tetromino getShape()  { 
        return pieceShape; 
    }
    
    public void setRandomShape() {
        
        var r = new Random();
        int x = Math.abs(r.nextInt()) % 7 + 1;

        Tetromino[] values = Tetromino.values();
        setShape(values[x]);
    }

    public int minX() {

        int m = coords[0][0];

        for (int i=0; i<4; i++) {
            
            m = Math.min(m, coords[i][0]);
        }

        return m;
    }

    public Shape rotateCounterClockwise() {

        if (pieceShape == Tetromino.O_shape) {
            return this;
        }

        var result = new Shape();
        result.pieceShape = pieceShape;

        for (int i=0; i<4; ++i) {

            result.setX(i, -x(i));
            result.setY(i, -x(i));
        }

        return result;
    }

    
}
