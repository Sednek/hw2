package homeworks;

public class Homework_14_02_2023 {
    public static void Task1(){
        int     a = 1234567890;
        byte    b = 125;
        short   c = 32500;
        long    d = 911223344534530L;
        float   e = 3.14159f;
        double  f = 31.006276677;

        System.out.println("Task 1:");
        System.out.println("Значение переменной 'a' с типом int    равно " + a);
        System.out.println("Значение переменной 'b' с типом byte   равно " + b);
        System.out.println("Значение переменной 'c' с типом short  равно " + c);
        System.out.println("Значение переменной 'd' с типом long   равно " + d);
        System.out.println("Значение переменной 'e' с типом float  равно " + e);
        System.out.println("Значение переменной 'f' с типом double равно " + f);
        System.out.println(" ");

    }
    public static void Task2(){
        float  a = 27.12f;
        long   b = 987678965549L;
        double c = 2.786;
        short  d = 569;
        short  e = -159;
        int    f = 27897;
        byte   g = 67;

        System.out.println("Task 2:");
        System.out.println("Done");
        System.out.println(" ");
    }
    public static void Task3(){
        //у Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников
        float totalPaper = 480f;
        byte numOfStudentsInLpClass = 23;
        byte numOfStudentsInAsClass = 27;
        byte numOfStudentsInEaClass = 30;
        float sumOfStudents, paperPerStudent;

        sumOfStudents = numOfStudentsInAsClass + numOfStudentsInEaClass + numOfStudentsInLpClass;
        paperPerStudent = totalPaper / sumOfStudents;

        System.out.println("Task 3:");
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги.");
        System.out.println(" ");
    }
    public static void Task4(){
        byte bottlesPer2Min = 16;
        int bottlesPer20Min, bottlesPerHour, bottlesPerDay, bottlesPer3Days, bottlesPerMonth;

        bottlesPer20Min = bottlesPer2Min * 10;
        bottlesPerHour = bottlesPer20Min * 3;
        bottlesPerDay = bottlesPerHour * 24;
        bottlesPer3Days = bottlesPerDay * 3;
        bottlesPerMonth = bottlesPer3Days * 10;


        System.out.println("Task 4:");
        System.out.println("За 20 минут машина произвела " + bottlesPer20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок");
        System.out.println(" ");
    }
    public static void Task5(){
        byte totalDye = 120;
        byte whitePerClass = 2;
        byte brownPerClass = 4;
        int totalWhite, totalBrown, totalClasses;

        totalClasses = totalDye / (whitePerClass + brownPerClass);
        totalWhite = totalClasses * whitePerClass;
        totalBrown = totalClasses * brownPerClass;

        System.out.println("Task 5:");
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
        System.out.println(" ");
    }
    public static void Task6(){
        /*
        Бананы — 5 штук (1 банан — 80 грамм).
        Молоко — 200 мл (100 мл = 105 грамм).
        Мороженое-пломбир — 2 брикета по 100 грамм.
        Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        */
        byte banana = 80;
        byte milk  = 105;
        byte iceCream = 100;
        byte egg = 70;
        float totalWeight;

        totalWeight = (banana * 5) + (milk * 2) + (iceCream * 2) + (egg * 4);

        System.out.println("Task 6:");
        System.out.println("Итоговый вес коктейля в граммах получился - " + totalWeight + " гр.");

        totalWeight = totalWeight / 1000;
        System.out.println("Итоговый вес коктейля в киллограммах получился - " + totalWeight + " кг.");

        System.out.println(" ");
    }
    public static void Task7(){
        float needToLose = 7000f;
        float losePerDay1 = 250f;
        float losePerDay2 = 500f;
        float weightLossDays1, weightLossDays2, medianWeightLossDays;

        weightLossDays1 = needToLose / losePerDay1;
        weightLossDays2 = needToLose / losePerDay2;
        medianWeightLossDays = needToLose / ((losePerDay1 + losePerDay2) / 2);

        System.out.println("Task 7:");
        System.out.println("1 вариант с ежедневным похудением на 250 грам. Количество дней: " + weightLossDays1 + " дней");
        System.out.println("2 вариант с ежедневным похудением на 500 грам. Количество дней: " + weightLossDays2 + " дней");
        System.out.println("В среднем потребуется дней для похудения: " + medianWeightLossDays + " дней");
        System.out.println(" ");
    }
    public static void Task8(){
        /*
        Маша получает 67 760 рублей в месяц.
        Денис получает 83 690 рублей в месяц.
        Кристина получает 76 230 рублей в месяц.
        */
        float mashaMonth = 67760f;
        float denisMonth = 83690f;
        float kristinaMonth = 76230f;
        float percent = 10f;
        float mashaDiff, denisDiff, kristinaDiff, mashaMonthAfter, denisMonthAfter, kristinaMonthAfter;

        mashaMonthAfter = mashaMonth + (mashaMonth * (percent/100));
        denisMonthAfter = denisMonth + (denisMonth * (percent / 100));
        kristinaMonthAfter = kristinaMonth + (kristinaMonth * (percent / 100));

        mashaDiff = (mashaMonthAfter * 12) - (mashaMonth * 12);
        denisDiff = (denisMonthAfter * 12) - (denisMonth * 12);
        kristinaDiff = (kristinaMonthAfter * 12) - (kristinaMonth * 12);

        System.out.println("Task 8:");
        System.out.println("Маша теперь получает " + mashaMonthAfter +" рублей. Годовой доход вырос на " + mashaDiff + " рублей");
        System.out.println("Денис теперь получает " + denisMonthAfter +" рублей. Годовой доход вырос на " + denisDiff + " рублей");
        System.out.println("Кристина теперь получает " + kristinaMonthAfter +" рублей. Годовой доход вырос на " + kristinaDiff + " рублей");
        System.out.println(" ");
    }
}