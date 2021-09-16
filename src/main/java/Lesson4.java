import java.util.Random;
import java.util.Scanner;

public class Lesson4 {

    public static char[][] board;
    public static int size = 3;
    public static char DOT_EMPTY = '.';
    public static char DOT_X = 'X';
    public static char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initBoard();
        printBoard();
        //игровой цикл
        while (true) {
            humanStep();
            printBoard();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isBoardFull()) {
                System.out.println("Ничья");
                break;
            }
            computerStep();
            printBoard();
            if (checkWin(DOT_O)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isBoardFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    // Проверка победы
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
    //проверка заполненности поля (наличие свободных ячеек)
    public static boolean isBoardFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    //ход компьютера
    public static void computerStep() {
        int x, y;
        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        }
        while (!isCellValid(x, y));
        System.out.println("Компьютер сделал ход в точку " + (x + 1) + " " + (y + 1));
        board[y][x] = DOT_O;
    }
    //ход человека
    public static void humanStep() {
        int x, y;
        do {
            System.out.println("Укажите ваш ход. Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        board[y][x] = DOT_X;
    }
    //проверка незаполненности ячейки
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) return false;
        if (board[y][x] == DOT_EMPTY) return true;
        return false;
    }
    //создание поля
    public static void initBoard() {
        board = new char[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                board[i][j] = DOT_EMPTY;
    }
    //отображение поля
    public static void printBoard() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}