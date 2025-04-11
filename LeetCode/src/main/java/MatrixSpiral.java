import java.util.ArrayList;
import java.util.List;

public class MatrixSpiral {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length - 1;
        int endColumn = matrix[0].length - 1;
        List<Integer> finalList = new ArrayList<>();
        while (startRow <= endRow || startColumn<=endColumn) {
            finalList.addAll(processMatrix(startColumn, startRow, endColumn, endRow, matrix));
            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
        }
        return finalList;
    }


    public List<Integer> processMatrix(int startColumn, int startRow, int endColumn, int endRow, int[][] matrix) {
        List<Integer> finalList = new ArrayList<>();
        int currentColumn = startColumn;
        int currentRow = startRow;
        while (currentColumn <= endColumn) {
            finalList.add(matrix[currentRow][currentColumn]);
            currentColumn++;
        }
        currentRow++;
        currentColumn --;
        while (currentRow <= endRow) {
            finalList.add(matrix[currentRow][currentColumn]);
            currentRow++;
        }
        currentRow--;
        currentColumn--;
        while (currentColumn >= startColumn) {
            finalList.add(matrix[currentRow][currentColumn]);
            currentColumn--;
        }
        currentRow--;
        currentColumn++;
        while (currentRow > startRow) {
            finalList.add(matrix[currentRow][currentColumn]);
            currentRow--;
        }
        return finalList;

    }


    public static void main(String[] args) {
        //int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //int[][] matrix = {{1, 2, 3,40}, {4, 5, 6,41}, {7, 8, 9,42},{10,11,12,43}};
        //int[][] matrix = {{2,3}};
        int[][] matrix = {{1, 2, 3,4}, {5,6,7,8}, {9,10,11,12}};
        MatrixSpiral m = new MatrixSpiral();
        System.out.println(m.spiralOrder(matrix));
    }
}
