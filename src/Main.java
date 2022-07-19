public class Main {
    public static void main(String[] args)
    //Задание1
    {
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS  по ссылке");
        }


        //Задание2
        // IOS = 1, Android = 0
        int client = 0;
        int clientDeviceYear = 2016;
        if (clientDeviceYear >= 2015 && client == 0) {
            System.out.println("Установите приложение для Андройд");
        } else if (clientDeviceYear < 2015 && client == 0) {
            System.out.println("Установите облегченную версию приложение для Андройд");
        } else if (clientDeviceYear >= 2015 && client == 1) {
            System.out.println("Установите приложение для IOs");
        } else if (clientDeviceYear < 2015 && client == 1) {
        System.out.println("Установите облегченную версию приложение для IOs");
    }
        //Задание3
        int year = 2019;
        if (year % 4 == 0 ) {
            System.out.println("год является високосным" + year);
        } else if (year % 400 == 0) {
            System.out.println("год является високосным" + year);
        } else if (year % 100 != 0) {
            System.out.println("год не является високосным" + year);
        }
        //Задание4
        //Правила доставки такие:Доставка в пределах 20 км занимает сутки.
        //            Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        //        Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        //             То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        //            Напишите программу, которая выдает сообщение в консоль:
        //        "Потребуется дней: " + срок доставки
        //        Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
        int deliveryDistance = 65;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } if (deliveryDistance >= 20 && deliveryDistance < 60) {
        System.out.println("Потребуется дней: 2");
    }if (deliveryDistance >= 60 && deliveryDistance < 100) {
        System.out.println("Потребуется дней: 3");
    }if (deliveryDistance > 100) {
        System.out.println("Доставка не выполняется");
    }
        // Напишите программу, которая определяет по номеру месяца в году, к какому сезону
        // этот месяц принадлежит. Например, 1 месяц (он же январь) принадлежит к сезону зима.
        //
        //Для написания программы используйте оператор switch. Для обозначения номера месяца
        // используйте переменную monthNumber = 12. Пропишите условие, при котором программа
        // не будет выполняться (номер месяца больше 13).

        //Задание5
        int monthNumber = 7;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }


    }
}




