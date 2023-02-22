package Lesson2;

public class TestMethods {
    public static void main(String[] args) {
        boolean isPremium = rewardEmployee("Артем", 200);
        System.out.println(isPremium);
        System.out.println(rewardEmployee("Андрей", 500));
        System.out.println(rewardEmployee("Виталий", 1200));
        System.out.println(rewardEmployee("Тимофей", -1200));
    }

    private static boolean rewardEmployee(String name, int premium) {
        if (premium < 0) {
            System.out.println("Неверное значение премии у " + name);
            return false;
        }
        System.out.println("Готовим бумаги для премирования " + name);
        System.out.println("Выделяем бюджет для " + name + " на сумму " + premium);
        System.out.println("Зачисляем на карточку средства для " + name + " на сумму " + premium);
        System.out.println("Процесс завершен");
        System.out.println();
        return true;
    }
}
