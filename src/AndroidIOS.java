import java.util.Scanner;

public class AndroidIOS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Какая у вас мобильная операционная система? \nIOS - 0, Android - 1");
        int clientOS = input.nextInt();
        System.out.println("В каком году была выпущена ваша модель телефона?");
        int clientDeviceYear = input.nextInt();

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке:");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке:");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке:");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке:");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
