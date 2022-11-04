public class Main {
    public static void main(String[] args) {
        //Task 1
        int myAge = 20;
        System.out.println(myAge);
        byte num = 125;
        System.out.println(num);
        short earthRadius = 6371;
        System.out.println(earthRadius);
        long myFinance = -2147483648;
        System.out.println(myFinance);
        float myWeight = 65.5F;
        System.out.println(myWeight);
        double doubleExample = 1.123124124122312312;
        System.out.println(doubleExample);

        //Task 2
        System.out.println("Task 2");
        float a = 27.12F;
        long b = 987678965549L;
        double c = 2.786;
        boolean d = false;
        int e = 569;
        short f = -159;
        byte g = 67;
        int h = 27897;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        //Task 3
        System.out.println("Task 3");
        int studentsOfLyudmilaPavlovna = 23;
        int studentsOfAnnaSergeevna = 27;
        int studentsOfEkaterinaAndreevna = 30;
        int sheetsOfPaper = 480;
        int totalStudents = studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna + studentsOfLyudmilaPavlovna;
        System.out.println("На каждого ученика рассчитано " + sheetsOfPaper / totalStudents + " листов бумаги");

        //Task 4
        System.out.println("Task 4");
        int capacity = 16/2;
        int capacityTwentyMinutes = 20 * capacity;
        int capacityOneDay = 24 * 60 * capacity;
        int capacityThreeDay = 24 * 60 * 3 * capacity;
        int capacityOneMonth = 24 * 60 * 30 * capacity;
        System.out.println("За 20 минут машина произвела бутылок " + capacityTwentyMinutes + " шт");
        System.out.println("За 1 сутки машина произвела бутылок " + capacityOneDay + " шт");
        System.out.println("За 3 дня машина произвела бутылок " + capacityThreeDay + " шт");
        System.out.println("За 1 месяц машина произвела бутылок " + capacityOneMonth + " шт");

        //Task 5
        System.out.println("Task 5");
        int totalCans = 120;
        int whitePaintCans = 2;
        int brownPaintCans = 4;
        int cansForOneClass = whitePaintCans + brownPaintCans;
        int classes = totalCans / cansForOneClass;
        int whitePaintCansForAllClasses = classes * whitePaintCans;
        int brownPaintCansForAllClasses = classes * brownPaintCans;
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePaintCansForAllClasses + " банок белой краски и " + brownPaintCansForAllClasses + " банок коричневой краски.");

        //Task 6
        System.out.println("Task 6");
        int bananasWeight = 80;
        int bananasNumbers = 5;
        int milkWeight = 105;
        int milkNumbers = 2;
        int iceWeight = 100;
        int iceNumbers = 2;
        int eggWeight = 70;
        int eggNumbers = 4;
        int allBananasWeight = bananasNumbers * bananasWeight;
        int allMilkWeight = milkNumbers * milkWeight;
        int allIceWeight = iceNumbers * iceWeight;
        int allEggWeight = eggNumbers * eggWeight;
        int totalWeight = allBananasWeight + allMilkWeight + allIceWeight + allEggWeight;
        System.out.println("Вес спортивного завтрака " + totalWeight + " грамм" );

        //Task 7
        System.out.println("Task 7");
        int loseWeight = 7000;
        int firstLimit = 250;
        int secondLimit = 500;
        System.out.println("На похудение уйдет " + loseWeight/firstLimit + " дней, если спортсмен будет худеть на " + firstLimit + " грамм в день");
        System.out.println("На похудение уйдет " + loseWeight/secondLimit + " дней, если спортсмен будет худеть на " + secondLimit + " грамм в день");
        System.out.println("В среднем на похудение потребуется " + (loseWeight/firstLimit  + loseWeight/secondLimit)/2 + " дней" );
    }
}