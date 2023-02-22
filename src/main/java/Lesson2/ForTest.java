package Lesson2;

public class ForTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        final int LIMIT_OF_CYCLE = 10;
        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
            System.out.println("Внешний цикл i: " + i);
            for (int j = 0; j < LIMIT_OF_CYCLE; j++) {
                System.out.println("--- внутренний цикл j: " + j);
            }
        }
        String smileStr = "";
        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
            if (i % 2 == 0) {
                smileStr += "♥  ";
            } else {
                smileStr += "♦  ";
            }
            System.out.print(smileStr);
            for (int j = 0; j < LIMIT_OF_CYCLE - 1 - i; j++) {
                System.out.print("♣  ");
            }
            System.out.println();
        }
        for (int i = 0; i < 211; i++) {
            if (i == 60) {
                break;
            }
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(" i:" + i);
        }
        System.out.println("\nEND");
    }
}