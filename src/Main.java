import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строчек и столбцов массива: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        double[][] array = new double[rows][columns];

        System.out.println("Введите массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        Location location = Location.locateLargest(array);

        System.out.println("Наибольший элемент находится в позиции (" + location.row + ", " + location.column + ")");
        System.out.println("Значение наибольшего элемента: " + location.maxValue);
    }
}