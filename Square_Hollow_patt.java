package pattern;

public class Square_Hollow_patt {

    public static void main(String[] args) {
        int size = 5; // Size of the square

        for (int i = 1; i <= size; ++i) {
            for (int j = 1; j <= size; ++j) {
                // Print stars on the borders of the square
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces inside the square
                }
            }
            System.out.println();
        }
    }
}
