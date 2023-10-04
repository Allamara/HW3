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
    }
}