package Polymorphism;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        char[][] board = new char[8][8];
        initBoard(board);

        int row = 0;
        int col = 1;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoardWithPossibleMoves(board, row, col);

            List<Move> possMoves = getPossibleMoves(row, col);
            System.out.println("Possible next moves:");
            for (int i = 0; i < possMoves.size(); i++) {
                System.out.println(i + ": (" + possMoves.get(i).r + ", " + possMoves.get(i).c + ")");
            }

            System.out.print("Enter the index of the next move: ");
            int moveIndex = scanner.nextInt();

            if (moveIndex >= 0 && moveIndex < possMoves.size()) {
                Move selectedMove = possMoves.get(moveIndex);
                board[row][col] = '■';
                row = selectedMove.r;
                col = selectedMove.c;
                board[row][col] = '♞';
            } else {
                System.out.println("Invalid move index! Please try again.");
            }
        }
    }

    public static void initBoard(char[][] board) {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                board[r][c] = '■';
            }
        }
        board[0][1] = '♞';
    }

    public static void printBoardWithPossibleMoves(char[][] board, int currentRow, int currentCol) {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                if (r == currentRow && c == currentCol) {
                    System.out.print("♞ ");
                } else {
                    List<Move> possMoves = getPossibleMoves(currentRow, currentCol);
                    boolean isPossible = false;
                    for (Move move : possMoves) {
                        if (move.r == r && move.c == c) {
                            isPossible = true;
                            break;
                        }
                    }
                    System.out.print(isPossible ? "* " : board[r][c] + " ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isValidMove(int row, int col, int newRow, int newCol) {
        int rDiff = Math.abs(newRow - row);
        int cDiff = Math.abs(newCol - col);
        return (rDiff == 2 && cDiff == 1) || (rDiff == 1 && cDiff == 2);
    }

    public static List<Move> getPossibleMoves(int r, int c) {
        List<Move> possMoves = new ArrayList<>();
        int[][] moves = {{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}};

        for (int[] move : moves) {
            int newRow = r + move[0];
            int newCol = c + move[1];
            if (newRow >= 0 && newRow < 8 && newCol >= 0 && newCol < 8) {
                possMoves.add(new Move(newRow, newCol));
            }
        }

        return possMoves;
    }

    static class Move {
        int r;
        int c;

        public Move(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
