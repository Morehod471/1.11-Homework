public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        printCheckYearLeap(1612);
    }

    public static boolean checkYearLeap (int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printCheckYearLeap(int checkYear) {
        if (checkYearLeap(checkYear)) {
            System.out.println(checkYear + " год — високосный год»");
        } else {
            System.out.println(checkYear + " год - невисокосный год");
        }
    }


    private static void task2() {
        System.out.println("Задача 2");
        getClientOSAndYear("iOS", 2020);
    }

    public static void getClientOSAndYear (String name, int clientPhoneYear) {
        System.out.println("Установите версию приложения для " + name);
        if (clientPhoneYear > 2015) {
            System.out.println("Установите обычную версию приложения");
        } else {
            System.out.println("Установите облегчённую версию приложения");
        }
    }

    private static void task3() {
        System.out.println("Задача 3");
        getClientDistance(95);
    }

    public static void getClientDistance (int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }


    }
}