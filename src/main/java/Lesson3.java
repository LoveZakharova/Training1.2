public class Lesson3 {

    //задать массив, циклом заменить значения на противоложные
    public static void main(String[] args) {
        point1();
        point2();
        point3();
        point4();
        point5(6, 3);
    }

    public static void point1() {
        int[] numbers = {0, 0, 0, 1, 1, 1, 0, 0, 1, 1};
        int gapNumb = numbers.length;

        for (int i = 0; i < gapNumb; i++) {
            System.out.print("[" + i + "]" + " " + numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < gapNumb; i++)
            if (numbers[i] == 1) {
                numbers[i] = 0;
            } else numbers[i] = 1;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("[" + i + "]" + " " + numbers[i] + " ");
        }
        System.out.println();
    }

    //задать пустой массив длиной 100, заполнить его значениями 1-100
    public static void point2() {

        int[] hundred = new int[100];
        for (int i = 0; i < 100; i++) {
            System.out.print(hundred[i] + " ");
        }
        System.out.println();
        int gapHund = hundred.length;
        for (int i = 1; i < gapHund; i++) {
            hundred[i] = i;
            System.out.print(hundred[i] + " ");
        }
        System.out.println();
    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2
    public static void point3() {
        int[] random = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < random.length; i++) {
            if (random[i] < 6) {
                random[i] = random[i] * 2;
            }
        }
        for (int i = 0; i < random.length; i++) {
            System.out.print(random[i] + " ");
        }
        System.out.println();
    }

    //создать двумерный квадратный массив, по диагонали заполнить единицами
    public static void point4() {
        int n = 5;
        int[][] box = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    box[i][j] = 1;
                }
                System.out.print(box[i][j] + " ");
            }
            System.out.println();
        }
    }

    //принять на вход два аргумента: len и initialValue,
    //вернуть одномерный массив, длина len, ячейка = initialValue
    public static void point5(int len, int initialValue) {
    int[] twoArg = new int[len];
    for(int i = 0; i < len; i++) {
        twoArg[i] = initialValue;
        }
    for (int i = 0; i < len; i++) {
        System.out.print(twoArg[i] + " ");
    }
    }

}

