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



    }
}