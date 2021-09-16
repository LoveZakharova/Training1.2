import java.util.Random;
import java.util.Scanner;

public class Less42 {

    static char[][] board;
    static char HUMAN_DOT = 'x';
    static char AI_DOT = '0';
    static char EMPTY = '_';
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

    public static void main(String[] args) {
        initBoard();
        printBoard();
        while (true) {
            humanStep();
            printBoard();
            if (checkWin(HUMAN_DOT)){
                System.out.println("Победил человек");
            }
            if (isBoardFull()) {
                break;
            }
            computerStep();
            printBoard();
            if (checkWin(AI_DOT)) {
                System.out.println("Победил компьютер");
            }
            if (isBoardFull()) {
                break;
            }
        }
        System.out.println("Игра окончена");
    }

    // Проверка победы:
    public static boolean checkWin(char dot) {
        for (int i = 0; i < 3; i++)
            if ((board[i][0] == dot && board[i][1] == dot &&
                    board[i][2] == dot) ||
                    (board[0][i] == dot && board[1][i] == dot &&
                            board[2][i] == dot))
                return true;
        if ((board[0][0] == dot && board[1][1] == dot &&
                board[2][2] == dot) ||
                (board[2][0] == dot && board[1][1] == dot &&
                        board[0][2] == dot))
            return true;
        return false;
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void computerStep() {
        int x, y;
        do {
            x = rnd.nextInt(3);
            y = rnd.nextInt(3);
        } while (!isCellValid(x, y));
        board[y][x] = AI_DOT;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        if (board[y][x] == EMPTY) {
            return true;
        }
        return false;
    }

    public static void humanStep() {
        int x, y;
        do {
            System.out.println("Сделайте ход. Укажите точку в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (!isCellValid(x, y));
        board[y][x] = HUMAN_DOT;

    }

    public static void initBoard() {
        board = new char[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = EMPTY;
    }

    public static void printBoard() {
        System.out.println();
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
