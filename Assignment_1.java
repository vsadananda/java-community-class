public class Assignment_1 {

    public static void main(String[] args) {
        char[] pattern = { 'T', 'E', 'L', 'U', 'S', 'K', 'O' };
        for (int row = 1; row <= 5; row++) {
            int currentCharInPattern = 0;
            for (int col = 1; col < 8 * pattern.length; col++) {
                if (col % 8 == 0) {
                    System.out.print(" ");
                    currentCharInPattern++;
                } else {
                    switch (pattern[currentCharInPattern]) {
                        case 'T':
                            printT(row, col);
                            break;
                        case 'E':
                            printE(row, col);
                            break;
                        case 'L':
                            printL(row, col);
                            break;
                        case 'U':
                            printU(row, col);
                            break;
                        case 'S':
                            printS(row, col);
                            break;
                        case 'K':
                            printK(row, col);
                            break;
                        case 'O':
                            printO(row, col);
                            break;
                    }
                }
            }
            System.out.println(" ");

        }
        char[] pattern1 = { 'I', 'N', 'E', 'U', 'R', 'O', 'N' };
        for (int row = 1; row <= 5; row++) {
            int currentCharInPattern = 0;
            for (int col = 1; col < 8 * pattern1.length; col++) {
                if (col % 8 == 0) {
                    System.out.print(" ");
                    currentCharInPattern++;
                } else {
                    switch (pattern1[currentCharInPattern]) {
                        case 'I':
                            printI(row, col);
                            break;
                        case 'N':
                            printN(row, col);
                            break;
                        case 'E':
                            printE(row, col);
                            break;
                        case 'U':
                            printU(row, col);
                            break;
                        case 'R':
                            printR(row, col);
                            break;
                        case 'O':
                            printO(row, col);
                            break;
                    }
                }
            }
            System.out.println(" ");

        }

    }

    private static void printR(int row, int col) {
        if ((row == 1 && (col % 8 == 1 || col % 8 == 2 || col % 8 == 3 || col % 8 == 4 || col % 8 == 5
                || col % 8 == 6))
                || col % 8 == 1
                || (row == 3 && (col % 8 == 1 || col % 8 == 2 || col % 8 == 3 || col % 8 == 4 || col % 8 == 5
                        || col % 8 == 6))
                ||
                (row == 2 && col % 8 == 7) ||
                (row == 4 && col % 8 == 5) || (row == 5 && col % 8 == 7))
            System.out.print("*");
        else
            System.out.print(" ");
    }

    private static void printN(int row, int col) {
        if ((row == 1 && col % 8 == 2) || (row == 2 && col % 8 == 3) || (row == 3 && col % 8 == 4) || (row == 4
                && col % 8 == 5) || col % 8 == 1 || col % 8 == 7)
            System.out.print("*");
        else
            System.out.print(" ");
    }

    private static void printI(int row, int col) {
        if (row == 1 || col % 8 == 4 || row == 5)
            System.out.print("*");
        else
            System.out.print(" ");
    }

    private static void printO(int row, int col) {
        if (row == 5 || col % 8 == 1 || col % 8 == 7 || row == 1)
            System.out.print("*");
        else
            System.out.print(" ");
    }

    private static void printK(int row, int col) {
        if (col % 8 == 1 || ((row == 1 || row == 5) && col % 8 == 5) || ((row == 2 || row == 4) && col % 8 == 3))
            System.out.print("*");
        else
            System.out.print(" ");
    }

    private static void printL(int row, int col) {
        if (row == 5 || col % 8 == 1)
            System.out.print("*");
        else
            System.out.print(" ");
    }

    private static void printT(int row, int col) {
        if (row == 1 || col % 8 == 4)
            System.out.print("*");
        else
            System.out.print(" ");
    }

    private static void printE(int row, int col) {
        if (row == 1 || col % 8 == 1 || row == 3 || row == 5)
            System.out.print("*");
        else
            System.out.print(" ");
    }

    private static void printU(int row, int col) {
        if (row == 5 || col % 8 == 1 || col % 8 == 7)
            System.out.print("*");
        else
            System.out.print(" ");
    }

    private static void printS(int row, int col) {
        if (row == 1 || (row == 2 && col % 8 == 1) || (row == 4 && col % 8 == 7) || row == 3 || row == 5)
            System.out.print("*");
        else
            System.out.print(" ");
    }

}
