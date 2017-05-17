package task1;

/**
 * Created by JD on 16.05.2017.
 */
public class MatrixPrint {
    public static void main(String[] args) {
        int[] matrix = new int[10];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = i;
        }
        System.out.println(matrix);
    }
}
