public class day4_1 {

    public static void main(String[] args) {
        int a[][] = { { 2, 3, 4 }, { 5, 6, 7 } };

        for (int[] row : a)
            System.out.println(row + "  ");

        System.out.println("The Matrix is: ");
        for (int[] row : a) {
            for (int column : row)
                System.out.print(column + "  ");
            System.out.println();
        }
    }
}
