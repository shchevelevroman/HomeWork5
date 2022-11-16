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
        int deliveryDistance = 90;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays ++;
        }
        if (deliveryDistance > 60) {
            deliveryDays ++;
        }
        System.out.println("Для доставки потребуется дней: " + deliveryDays);


        //Задача №5
        System.out.println("Задача №5");
        int monthNumberS = 7;
        switch (monthNumberS){
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц под номером " + monthNumberS + " принадлежит к зимнему сезону");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц под номером " + monthNumberS + " принадлежит к весеннему сезону");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц под номером " + monthNumberS + " принадлежит к летнему сезону");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц под номером " + monthNumberS + " принадлежит к осеннему сезону");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }







    }
}