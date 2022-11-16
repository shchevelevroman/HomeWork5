public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1");
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию прилоложения для Android по ссылке");
        }

        //Задача №2  не уверен в правильности решения
        System.out.println("Задача №2");
        byte clientOs = 1;
        int clientDeviceYear = 2014;
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию прилоложения для Android по ссылке");
        }

        //Задача №3
        System.out.println("Задача №3");
        int year = 2024;
        if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " Год не является вясокосным");
        }

        //Задача №4
        System.out.println("Задача №4");
        int deliveryDistance = 20;
        System.out.println("Для доставки потребуется дней " + deliveryDistance / 20);

        //Задача №5
        System.out.println("Задача №5");
        int monthNumber = 11;
        if (monthNumber <= 2 || monthNumber == 12) {
            System.out.println("Месяц под номером " + monthNumber + " принадлежит к зимнему сезону");
        }
        else if (monthNumber >= 3 && monthNumber <= 5) {
            System.out.println("Месяц под номером " + monthNumber + " принадлежит к весеннему сезону");
        }
        else if (monthNumber >= 6 && monthNumber <= 8) {
            System.out.println("Месяц по номерм " + monthNumber + " принадлежит к летнему сезону");
        }
        else if (monthNumber >=9 && monthNumber <= 11) {
            System.out.println("Месяц по номерм " + monthNumber + " принадлежит к осеннему сезону");
        } else {
            System.out.println("Данного месяца не существует");
        }






    }
}