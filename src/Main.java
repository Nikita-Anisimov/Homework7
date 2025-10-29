import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int firstFriday = 7;
        for (firstFriday = 1; firstFriday <= 31; firstFriday++) {
            if (firstFriday % 7 == 0) {
                System.out.println("Сегодня пятница " + firstFriday + " , необходимо подготовить отчет");
                continue;
            }
            System.out.println("Сегодня " + firstFriday + " не пятница");
        }

        System.out.println("Задача 2:");
        int distanceCovered = 500;
        int fullDistance = 42195;
        //Версия do-while
        do {
            System.out.println("Держитесь! Осталось " + fullDistance + " метров");
            fullDistance = fullDistance - distanceCovered;
        } while (fullDistance > 0);

        // Версия for
        for (int distance = 42195; distance > 0; distance = distance - distanceCovered) {
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
                day++;
                continue;
            }
        }
        System.out.println("Задача 3 for:");
        int cash = 500;
        int dayParking = 1;
        for (cash = 500; cash>=0; ) {
            System.out.println("День " + dayParking + " осталось денег " + cash);
            dayParking++;
            cash = cash - 100;
            if (dayParking % 5 == 0) {
                dayParking++;
                continue;
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
                break;
            }
        }

        System.out.println("Задача 5:");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge<100 || overheats <=3) {
            minute++;
            charge += 2;
            if (minute % 10 == 0) {
                overheats += 1;
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
