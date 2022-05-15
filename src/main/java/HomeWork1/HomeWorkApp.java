package HomeWork1;
// Первая домашняя работа
public class HomeWorkApp {

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    private static void checkSumSign() {
       int a = -512;
       int b = -256;
       if (a + b >= 0) {
           System.out.println("Сумма положительная");
       } else System.out.println("Сумма отрицательная");
    }
    private static void printColor() {
        int value = 121;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <=100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    private static void compareNumbers() {
        int a = 1024;
        int b = 1080;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

}
