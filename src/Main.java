public class Main {
    public static void main(String[] args) {

/* Задание 1
Объявите переменные типа int, byte, short, long, float, double.
Выведите в консоль значение каждой переменной в формате "Значение переменной … с типом … равно …"
 */

        int a= 100;
        byte b=1;
        short c=4;
        long d=1000L;
        float i=10f;
        double f=4;

        System.out.println("Значение переменной a с типом int равно "+a);
        System.out.println("Значение переменной b с типом byte равно "+b);
        System.out.println("Значение переменной c с типом short равно " +c);
        System.out.println("Значение переменной d с типом long равно " +d);
        System.out.println("Значение переменной i с типом float равно "+i);
        System.out.println("Значение переменной f с типом double равно "+f);

    /* Задание 2
  Значения:
  27.12 ,  987 678 965 549 , 2,786 , false, 569 , -159 , 27897 , 67.
  Объявите переменные всех типов, присвойте им любые значения (инициализируйте их)
     */

        byte x1 = 67;
        short x2 = -159;
        int x3 = 27897;
        long x4 = 987678965549L;
        float x5 = 27.12f;
        double x6 = 2.786;
        char x7 = 569;
        boolean x8 = false;

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
        System.out.println(x6);
        System.out.println(x7);
        System.out.println(x8);

        /* Задание 3
        Трое школьных учителей, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        У Людмилы Павловны 23 ученика , у Анны Сергеевны 27 учеников и у Екатерины Андреевны – 30 учеников.
        Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
        Результат задачи выведите в консоль в формате "На каждого ученика рассчитано … листов бумаги"
         */

        byte lV = 23;
        byte aS=27;
        byte eA=30;
        int allStudent = lV+aS+eA;
        int allPeper = 480;
        int peperForStudent = allPeper/allStudent;
        System.out.println("На каждого ученика рассчитано " + peperForStudent + " листов бумаги");

        /* Задание 4
        Производительность машины для изготовления бутылок - 16 бутылок за 2 минуты. Какая производительность машины будет:
        за 20 минут
        в сутки
        за 3 дня
        за 1 месяц
        Рассчитывайте продолжительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
        Результаты подсчетов выведите в консоль в формате "За … машины произвела бутылок … штук "
        Для объявления переменных не используйте тип var.
         */

        int capacityCar=16/2;
        int time=20;
        int allCapacityCar = capacityCar*time;
        System.out.println("За " + time + " минут машины произвела бутылок " + allCapacityCar + " штук");
        time = 60*24;
        allCapacityCar=capacityCar*time;
        System.out.println("За " + time + " минут машины произвела бутылок " + allCapacityCar + " штук");
        time = 60*24*3;
        allCapacityCar=capacityCar*time;
        System.out.println("За " + time + " минут машины произвела бутылок " + allCapacityCar + " штук");
        time = 60*24*30;
        allCapacityCar=capacityCar*time;
        System.out.println("За " + time + " минут машины произвела бутылок " + allCapacityCar + " штук");


        /* Задание 5
        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        На один класс уходит 2 банки белой и 4 банки коричневой краски.
        Сколько банок каждой краски было куплено?
        Выведите результат задачи в консоль в формате:
        "В школе, где … классов, нужно … банок белой краски и … банок коричневой краски".
         */

        short allColor = 120;
        int whiteColor=1;
        int brownColor=1;
        int oneClass = 2*whiteColor+4*brownColor;
        int allClass=allColor/oneClass;
        int allWhiteColor=allClass*2;
        int allBrownColor=allClass*4;
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhiteColor + " банок белой краски и " + allBrownColor + " банок коричневой краски");

        /* Задание 6

Бананы – 5 штук (1 банан - 80 грамм);
Молоко – 200 мл (100 мл = 105 грамм);
Мороженое пломбир – 2 брикета по 100 грамм;
Яйца сырые – 4 яйца (1 яйцо - 70 грамм).

Смешать всё в блендере и готово.
Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
Результат напечатайте в консоль.
         */

        int bananas = 5*80;
        int milk = 2*105;
        int iceCreame = 2*100;
        int eggs = 4*70;
        int summProduct = bananas+milk+iceCreame+eggs;
        float summProductKg=summProduct/1000f;
        System.out.println("Вес спорт-завтрака составляет " + summProductKg + " кг!");

        /* Задание 7
        Спортсмену нужно сбросить 7 кг.
        Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько, если каждый день будет худеть на 500 грамм.
        Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        Результаты всех подсчетов выведите в консоль.
         */

        int dropWeight=7;
        double miniDrop=250/1000f;
        double maxDrop=500/1000f;
        double miniDay=dropWeight/maxDrop;
        double maxDay=dropWeight/miniDrop;
        double middleDay=(miniDay+maxDay)/2;
        System.out.println("При похудении на " + miniDrop + " кг в день, понадобится " + maxDay + " дней, чтобы похудеть на " + dropWeight + " кг");
        System.out.println("При похудении на " + maxDrop + " кг в день, понадобится " + miniDay + " дней, чтобы похудеть на " + dropWeight + " кг");
        System.out.println("В среднем понадобится "+ middleDay + " дней");

        /* Задание 8
К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
Маша получает 67 760 рублей в месяц
Денис получает 83 690 рублей в месяц
Кристина получает 76 230 рублей в месяц
Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
Выведите в консоль информацию по каждому сотруднику.
Например, "Маша теперь получает **** рублей. Годовой доход вырос на **** рублей".
         */

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryCristina = 76230;
        double newSalaryMasha = salaryMasha*1.1;
        double newSalaryDenis = salaryDenis*1.1f;
        double newSalaryCristina = salaryCristina*1.1;
        double yearlyDifferenceMasha = (newSalaryMasha-salaryMasha)*12;
        double yearlyDifferenceDenis = (newSalaryDenis-salaryDenis)*12;
        double yearlyDifferenceCristina = (newSalaryCristina-salaryCristina)*12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + yearlyDifferenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + yearlyDifferenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryCristina + " рублей. Годовой доход вырос на " + yearlyDifferenceCristina + " рублей.");


    }
}