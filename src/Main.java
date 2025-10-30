import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int firstFriday = 7;
        int currentDay = 3;
        for (; currentDay <= 31; currentDay++) {
            if ((currentDay - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница " + currentDay + " , необходимо подготовить отчет");
            }

        System.out.println("Сегодня " + currentDay + " не пятница");}

        System.out.println("Задача 2:");
        int distanceCovered = 0;
        int fullDistance = 42195;
        //Версия do-while
        do {
            fullDistance = fullDistance - (distanceCovered + 500);
            System.out.println("Держитесь! Осталось " + fullDistance + " метров");
        } while (distanceCovered < fullDistance && fullDistance > 500);

        // Версия for
        for (int distance = 42195; distance > 0; distance = distance - 500) {
            System.out.println("Держитесь! Осталось " + distance + " метров");
        }

        System.out.println("Задача 3 while:");
        int money = 500;
        int day = 1;
        while (money >= 0) {
            System.out.println("День " +day+ " осталось денег " + money);
            day++;
            money = money - 100;
            if (day % 5 == 0) {
                System.out.println("День " +day+ " бесплатная парковка");
                day++;
                continue;
            }
            if (money < 100) {
                System.out.println("Внесите деньги");
                break;
            }
        }
        System.out.println("Задача 3 for:");
        int cash = 500;
        int dayParking = 1;
        for (; cash>=0; ) {
            System.out.println("День " + dayParking + " осталось денег " + cash);
            dayParking++;
            cash = cash - 100;
            if (dayParking % 5 == 0) {
                dayParking++;
                continue;
            }
            if (cash < 100) {
                System.out.println("Внесите деньги");
                break;
            }
        }

        System.out.println("Задача 4:");
        int month = 0;
        float total = 0;
        while (true) {
            System.out.println(String.format("Месяц %d, сумма накоплений равна %.0f рублей.", month++, total));
            total = total + 15000;
            if (month % 6 == 0) {
                total = total * 1.07f;
            }
            if (total >= 12000000) {
                    System.out.println(String.format("Месяц %d, сумма накоплений равна %.0f рублей.",month++, total));
                    break;
            }
        }

        System.out.println("Задача 5:");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge<=100 || overheats <=3) {
            minute++;
            charge += 2;
            if (minute % 10 == 0) {
                overheats++;
                minute += 2;
                System.out.println("Перегрев, пауза 2 минуты");
                continue;
            }
            if (overheats == 3) {
                System.out.println("Количество перегревов = 3. Зарядка завершена");
                break;
            }
            System.out.println("Заряд телефона равен "+charge+". Время зарядки составило" +minute+ " минут");
        }
        }
}

