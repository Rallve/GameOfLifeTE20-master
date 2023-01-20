package Model;
import View.*;
import java.util.Arrays;

public class Model {
    int width = 50;
    int height = 50;
    int rows = height;
    int columns = width;

    boolean[][] grid = new boolean[rows][columns];


    public Model(int width, int height) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                grid[row][col] = Math.random() < 0.5;
                System.out.println("test success");
            }
        }
        //grid[1][0] = x:1, y:0
        if (grid[1][0]) {
            Arrays.asList(grid).indexOf(1);
        }
    }



    public void update() {

    }

    public Shape[] getShapes() {
        Point[] points = {new Point(3,3)};
        return (Shape[])points;
    }

    public void neightbourCheck() {

    }


}
