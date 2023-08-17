package TestProgram.TicTacToe;
import java.util.Scanner;

public class TicTacToe {
    static Scanner sc = new Scanner(System.in);
    static char[][] array = new char[3][3];
    static boolean gameWon = false;

    public static void main(String args[]) {
        int c = 0;
        while (!gameWon) {
            char sign = (c % 2 != 0) ? 'O' : 'X';
            System.out.println("Player " + (c % 2 + 1));
            allocate(sign);
            display();
            checkWin(sign);
            c++;
        }
    }

    public static void allocate(char sign) {
        int a;
        do {
            System.out.println("Enter box no for move:");
            a = sc.nextInt();
        } while (a < 1 || a > 9 || isOccupied(a));

        int r = (a - 1) / 3;
        int c = (a - 1) % 3;
        array[r][c] = sign;
    }

    public static boolean isOccupied(int a) {
        int r = (a - 1) / 3;
        int c = (a - 1) % 3;
        return array[r][c] == 'X' || array[r][c] == 'O';
    }

    public static void display() {
        for (char[] row : array) {
            for (char cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }

    public static void checkWin(char sign) {
        for (int i = 0; i < 3; i++) {
            if ((array[i][0] == sign && array[i][1] == sign && array[i][2] == sign)
                    || (array[0][i] == sign && array[1][i] == sign && array[2][i] == sign)) {
                System.out.println("Player " + (sign == 'X' ? 1 : 2) + " Wins");
                gameWon = true;
                return;
            }
        }

        if ((array[0][0] == sign && array[1][1] == sign && array[2][2] == sign)
                || (array[0][2] == sign && array[1][1] == sign && array[2][0] == sign)) {
            System.out.println("Player " + (sign == 'X' ? 1 : 2) + " Wins");
            gameWon = true;
            return;
        }

        if (!gameWon && isBoardFull()) {
            System.out.println("It's a Draw");
            gameWon = true;
        }
    }

    public static boolean isBoardFull() {
        for (char[] row : array) {
            for (char cell : row) {
                if (cell != 'X' && cell != 'O') {
                    return false;
                }
            }
        }
        return true;
    }
}
