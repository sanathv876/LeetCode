public class MatrixSearch {
    public boolean searchMatrix(int[][] matrix, int target) {

        boolean flag = false;

        for(int i = 0; i < matrix.length; i ++){
            for(int y = 0; y <matrix[i].length; y ++){
                if(matrix[i][y] == target){
                    flag = true;

                }

            }
        }

        return flag;


    }


    public static void main(String[] args) {
        MatrixSearch m = new MatrixSearch();
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        System.out.println(m.searchMatrix(matrix, 13));
    }
}
