package task1;

/**
 * Created by JD on 16.05.2017.
 */
public class MatrixPrint {
    public static void main(String[] args) {
        String matrix[] = {"*", "2", "3", "4", "*", "6", "*", "8", "*", "10", "11", "12", "*", "14", "15", "16", "*", "18", "*", "20", "*", "22", "23", "24", "*"};

        for (int i = 0; i < matrix.length; i++) {
            if (i != 0 && i % 5 == 0) {
                System.out.println();
            }
            System.out.print(matrix[i]);


        }
    }
}
