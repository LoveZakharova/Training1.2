public class Lesson2 {

    public static void main(String[] args) {
        chekSum(6, 11);
        posOrNegNumber(7);
        trueOrFalse(15);
        printString("Отпечатать строку", 6);
    }

    //принять два целых числа, их сумму проверить на вхождение в пределы 10-20, вывести рез
    public static boolean chekSum (int a, int b){
            if (a + b >= 10 && a + b <= 20)
                System.out.println("true");

            else
                System.out.println("false");
        return false;
    }

    //передать целое число, проверить на положительное-отрицательное
    public static void posOrNegNumber(int num) {
        if (num >= 0) {
            System.out.println("Положительное число");
        }
        else {
            System.out.println("Отрицательное число");
        }
    }

    //передать целое число, проверить на отрицательное-положительное, вернуть true/false
    public static boolean trueOrFalse(int x) {
        if (x < 0) {
            return true;
        }
        else {
            return false;
        }
    }

    //передать строку и число, вывести строку указанное количество раз
    public static void printString(String s, int quant) {
        for (int i = 1; i <= quant; i++) {
            System.out.println("[" + i + "]" + " " + s);
        }
    }

}
