import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1(2004);

        //clientOS: 1 - Android, 0 - IOS
        task2(2022, (byte)1);

        task3(100);
    }

    public static void task1(int year){

        System.out.println("Демонстрация задачи 1");

        if ((( year % 4 == 0 ) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task2(int clientDeviceYear, byte clientOS){

        System.out.println("Демонстрация задачи 2");
        int clientCurrentDeviceYear = LocalDate.now().getYear();

        if (clientOS == 1) {
            System.out.println("Установите " + (clientCurrentDeviceYear <= clientDeviceYear ? "": "облегченную") + " версию приложения для Android по ссылке");
        }
        else if (clientOS == 0) {
            System.out.println("Установите " + (clientCurrentDeviceYear <= clientDeviceYear ? "": "облегченную") + " версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Ваша операционная система не опознана");
        }
    }

    public static void task3(int deliveryDistance){

        System.out.println("Демонстрация задачи 3");
        int days = 1;

        if (deliveryDistance > 20)
            days ++;

        if (deliveryDistance > 60)
            days ++;

        if (deliveryDistance > 100){
            days = 0;
            System.out.println("Свыше 100 км доставки нет");
        }
        if (days > 0) System.out.println("Потребуется дней: " + days);
    }
}