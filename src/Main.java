public class Main {
    public static void main(String[] args) {
        // Task_1
        byte numberOne = 5;
        short numberTwo = 55;
        int numberThree = 555;
        float numberFour = 5.55555f;
        double numberFive = 5.5555555555;
        System.out.println("Значение переменной № 1 с типом byte равно " + numberOne);
        System.out.println("Значение переменной № 2 с типом short равно " + numberTwo);
        System.out.println("Значение переменной № 3 с типом int равно " + numberThree);
        System.out.println("Значение переменной № 4 с типом float равно " + numberFour);
        System.out.println("Значение переменной № 5 с типом double равно " + numberFive);

        // Task_2
        float task2Var1 = 27.12f;
        long task2Var2 = 987678965549L;
        double task2Var3 = 2.786;
        short task2Var4 = 569;
        int task2Var5 = -159;
        int task2Var6 = 27897;
        byte task2Var7 = 67;

        // Task_3
        byte students_LudmilaPavlovna = 23;
        byte students_AnnaSergeevna = 27;
        byte students_EkaterinaAndreevna = 30;
        int totalStudents = students_LudmilaPavlovna + students_AnnaSergeevna + students_EkaterinaAndreevna;
        int totalPaper = 480;
        int paperPerStudent = 480 / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        // Task_4
        byte time = 2;
        int bottles = 16;
        int oneDay = 1440;
        int threeDays = 4320;
        int oneMonth = 43200;
        int productivity1Min = bottles / time;
        int productivity20Min = productivity1Min * 20;
        int productivityOneDay = productivity1Min * oneDay;
        int productivity3Days = productivity1Min * threeDays;
        int productivityOneMonth = productivity1Min * oneMonth;
        System.out.println("За 20 минут машина произвела " + productivity20Min + " шт. бутылок");
        System.out.println("За сутки машина произвела " + productivityOneDay + " шт. бутылок");
        System.out.println("За 3 дня машина произвела " + productivity3Days + " шт. бутылок");
        System.out.println("За месяц машина произвела " + productivityOneMonth + " шт. бутылок");

        // Task_5
        byte totalJars = 120;
        byte whitePaintPerClassroom = 2;
        byte brownPaintPerClassroom = 4;
        int totalJarsPerClassroom = whitePaintPerClassroom + brownPaintPerClassroom;
        int totalClassrooms = totalJars / totalJarsPerClassroom;
        int whitePaint = totalClassrooms * whitePaintPerClassroom;
        int brownPaint = totalClassrooms * brownPaintPerClassroom;
        System.out.println("В школе, где " + totalClassrooms + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        // Task_6
        int banana = 80;
        int bananasForBreakfast = 5;
        int milk = 105;
        int milkForBreakfast = 2;
        int iceCream = 100;
        int iceCreamForBreakfast = 2;
        int eggs = 70;
        int eggsForBreakfast = 4;
        int totalBananas = banana * bananasForBreakfast;
        int totalMilk = milk * milkForBreakfast;
        int totalIceCream = iceCream * iceCreamForBreakfast;
        int totalEggs = eggs * eggsForBreakfast;
        int weightGr = totalBananas + totalMilk + totalIceCream + totalEggs;
        float weightKg = weightGr / 1000f;
        System.out.println(weightGr);
        System.out.println(weightKg);

        // Task_7
        int totalWeightLoss = 7000;
        int days250 = totalWeightLoss / 250;
        int days500 = totalWeightLoss / 500;
        int average = (days250 + days500) / 2;
        System.out.println(days250);
        System.out.println(days500);
        System.out.println(average);

        // Task_8
        int masha = 67760;
        int kristina = 76230;
        int denis = 83690;
        float percent = 0.1f;
        float mashaSalaryIncrease = masha * percent;
        float kristinaSalaryIncrease = kristina * percent;
        float denisSalaryIncrease = denis * percent;
        float masha10 = masha + mashaSalaryIncrease;
        float kristina10 = kristina + kristinaSalaryIncrease;
        float denis10 = denis + denisSalaryIncrease;
        int mashaPerYear = masha * 12;
        int kristinaPerYear = kristina * 12;
        int denisPerYear = denis * 12;
        float mashaPerYear10 = masha10 * 12;
        float kristinaPerYear10 = kristina10 * 12;
        float denisPerYear10 = denis10 * 12;
        float mashaDifference = mashaPerYear10 - mashaPerYear;
        float kristinaDifference = kristinaPerYear10 - kristinaPerYear;
        float denisDifference = denisPerYear10 - denisPerYear;
        System.out.println("Маша теперь получает " + masha10 + " рублей. Её годовой доход вырос на " + mashaDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristina10 + " рублей. Её годовой доход вырос на " + kristinaDifference + " рублей");
        System.out.println("Денис теперь получает " + denis10 + " рублей. Его годовой доход вырос на " + denisDifference + " рублей");
    }
}