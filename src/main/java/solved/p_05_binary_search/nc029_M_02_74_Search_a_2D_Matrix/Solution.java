package solved.p_05_binary_search.nc029_M_02_74_Search_a_2D_Matrix;

public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        int row = findRow(0, matrix.length - 1, matrix, target);
        if (row == -1) return false;
        return findColumn(row, 0, matrix[row].length - 1, matrix, target) != -1;
    }

    private int findRow(int l, int r, int[][] matrix, int target) {
        if (r < l) return -1;

        int mid = l + (r - l) / 2;

        if (target < matrix[mid][0]) return findRow(l, mid - 1, matrix, target);

        if (target > matrix[mid][matrix[0].length - 1]) return findRow(mid + 1, r, matrix, target);

        return mid;
    }

    private int findColumn(int row, int l, int r, int[][] matrix, int target) {

        if (r < l) return -1;

        int mid = l + (r - l) / 2;

        if (matrix[row][mid] == target) return mid;
        if (target < matrix[row][mid]) {
            return findColumn(row, l, mid - 1, matrix, target);
        } else {
            return findColumn(row, mid + 1, r, matrix, target);
        }
    }
}
