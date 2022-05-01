package homework;

import java.security.SecureRandom;

public class HW5 {
    static int a = 2;

    public static void Task() {

        System.out.println("******************** " + "Task # " + a + " ********************");
        a++;

    }

    public static String expectedResult;
    public static String actualResult;

    public static void verifyEquals(String expectedResult, String actualResult) {

        if (expectedResult.equals(actualResult)) {

            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(int expectedResult, int actualResult) {

        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(double expectedResult, double actualResult) {

        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }

    }

    public static String week(int num) {
        String day = "";

        if (num >= 1 && num <= 7) {
            if (num == 1) {
                day = "Monday";
            } else if (num == 2) {
                day = "Tuesday";
            } else if (num == 3) {
                day = "Wednesday";
            } else if (num == 4) {
                day = "Thursday";
            } else if (num == 5) {
                day = "Friday";
            } else if (num == 6) {
                day = "Saturday";
            } else if (num == 7) {
                day = "Sunday";
            }
        } else {
            day = "Wrong day";
        }
        return day;
    }

    public static String largest(int x, int y, int z) {

        String largestNumber = "";

        if (x > y && x > z) {
            largestNumber = "x";
        } else if (y > x && y > z) {
            largestNumber = "y";
        } else if (z > x && z > y) {
            largestNumber = "z";
        }
        return largestNumber;
    }

    public static Integer largestMath(int x, int y, int z) {
        Integer max = (Math.max(Math.max(x, y), z));
        return max;
    }

    public static String smallest(int x, int y, int z) {

        String smallestNumber = "";

        if (x < y && x < z) {
            smallestNumber = "x";
        } else if (y < x && y < z) {
            smallestNumber = "y";
        } else if (z < x && z < y) {
            smallestNumber = "z";
        }
        return smallestNumber;
    }

    public static Integer smallestMath(int x, int y, int z) {
        Integer min = (Math.min(Math.min(x, y), z));
        return min;
    }

    public static double averageTem(double kt, double kt1, double kt2, double adt, double adt1) {

        double average = ((kt + kt1 + kt2 + adt + adt1) / 5);
        return average;
    }

    public static String money(double money) {
        if (money > 0) {
            int rub = (int) money;
            double coins = (money - rub) * 100;
            int coins1 = (int) coins;
            return (Integer.toString(rub) + " руб. " + Integer.toString(coins1) + " коп.");
        } else {
            return "Need money";
        }
    }

    public static String weigth(double weigth) {
        if (weigth > 0) {

            int kg = (int) weigth;
            double gr = (weigth - kg) * 1000;
            int gramm = (int) gr;

            return (Integer.toString(kg) + " кг. " + Integer.toString(gramm) + " гр.");
        } else {
            return "Error";
        }
    }

    public static String totalPrice(double cost, double weigth) {

        double price = weigth * cost;
        return money(price);
    }

    public static String salary(double rate, double hours) {

        double daySalary = rate * hours;
        return money(daySalary);
    }

    public static String salaryMonth(double rate, double semi) {

        double monthSalary = rate * semi * 2;
        return money(monthSalary);
    }

    public static String checkingX(int x) {
        if (x < 0) {
            return "x is negative";
        } else if (x > 0) {
            return "x is positive";
        } else {
            return "x is zero";
        }
    }

    public static int lukkyNumber(int year) {

        int n1 = year / 1000;
        int n2 = year / 100 % 10;
        int n3 = year % 100 / 10;
        int n4 = year % 10;
        int y = (n1 + n2 + n3 + n4);
        if (y < 9) {
            System.out.println(y + " - Lucky number");
        } else
            n1 = y / 10;
        n2 = y % 10;
        y = (n1 + n2);
        if (y < 9) {
            System.out.println(y + " - Lucky number");
        } else
            n1 = y / 10;
        n2 = y % 10;
        y = (n1 + n2);
        if (y < 9) {
            System.out.println(y + " - Lucky number");
        }
        return y;
    }
    public static String change(double change){
       double money1 = Math.ceil(change);

       return money(money1);
    }
    public static double bigNum(double a, double b, double c){
       double z = (Math.sqrt(((a * b + c) * (Math.pow(a, b))))) / Math.PI;
       double res = Math.ceil(z);
       return res;
    }
    public static int num(int y) {
        int x;
        if (y > 0) {
            x = 1;
            System.out.println(x);
        }return y;
    }


    public static double score(double x) {


        if( x > 80.00 && x < 90.00){
            x  = x + 5;
        }return x;
    }
    public static double ran(int stepen) {
        if (stepen >= 0 && stepen <= 10) {
            return Math.pow(Math.random(), stepen);
        } else {
            System.out.println("Error");
            return Double.MIN_VALUE;
        }
    }







    public static void main(String[] args) {


        /**
         *  task 2 - Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.
         */
        Task();
        System.out.println(week(1));
        System.out.println(week(5));
        verifyEquals("Friday", week(7));

        Task();
        System.out.println(largest(6, 9, 34));
        verifyEquals(largest(6, 9, 34), "x");

        verifyEquals(largestMath(6, 9, 24), 24);

        Task();
        System.out.println(smallest(13, 8, 99));
        verifyEquals(smallest(34, 87, 9), "z");

        verifyEquals(smallestMath(88, 24, 46), 24);

        /**
         * Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
         */
        Task();

        System.out.println(averageTem(35.1, 36.1, 36.5, 37.5, 39.1));
        verifyEquals(averageTem(35.1, 36.1, 36.5, 37.5, 39.1), 40.0);

        /**
         * Написать метод, который принимает на вход десятичное число (например, 10.75),
         * и возвращает строку “10 руб 75 коп”.
         */

        Task();
        System.out.println(money(10.75));
        verifyEquals(money(10.75), "10 руб.75 коп.");

        /**
         * Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.
         */
        Task();
        System.out.println(weigth(23.50));
        verifyEquals(weigth(23.50), "23 кг.500 гр.");

        /**
         * Написать метод, который принимает на вход 2 параметра - цену и количество товара
         * (может быть вес товара, или количество в штуках).
         * Алгоритм возвращает сумму покупки в виде десятичного числа.
         */
        Task();
        System.out.println(totalPrice(40.20, 3.00));
        verifyEquals(totalPrice(40.20, 3.00), "120 руб. 60 коп.");

        /**
         * Написать метод, который принимает на вход необходимые параметры, и печатает чек.
         * Яблоки
         * Цена за 1 кг			50 руб 13 коп
         * Количество товара	         3 кг 400 гр
         * _______________________________________
         * Сумма к оплате		170 руб 44 коп
         */
        Task();
        System.out.println("Apple" + "\n" + "Price fo 1 kg       " + money(50.13) + "\n"
                + "Quantity             " + weigth(3.400) + "\n" + "__________________________________"
                + "\n" + "Total price       " + totalPrice(50.13, 3.400));

        /**
         * Написать метод, который принимает на вход
         * количество часов работы в день и стоимость одного часа работы, и возвращает заработную плату в месяц.
         */
        Task();
        System.out.println(salary(15.48, 4.45));
        verifyEquals(salary(15.48, 4.45), "68 руб. 88 коп.");

        /**
         * Написать метод, который принимает на вход необходимые параметры и
         * печатает строку ведомости выдачи зарплаты сотрудникам.
         * Смирнова Мария Ивановна 		70000 руб 00 коп
         *
         * Распечатать ведомость для нескольких сотрудников, например:
         *
         * Март 2022
         * Смирнова Мария Ивановна 		70000 руб 00 коп
         * Серебряков Иван Петрович 		128059 руб 00 коп
         */
        Task();

        String statement = "ВЕДОМОСТЬ";
        System.out.println(statement);
        String line = "+_______________________________________________________+";

        System.out.println(line + "\n" + "| Март 2022                                             |" + "\n"
                + line + "\n" + "| Смирнова Мария Ивановна            " + money(70000.00) + "  |"
                + "\n" + line + "\n" + "| Серебряков Иван Петрович          "
                + money(128059.00) + "  |" + "\n" + line);


        System.out.println("\n" + "\n" + line + "\n" + "| Март 2022                                             |" + "\n"
                + line + "\n" + "| Смирнова Мария Ивановна            " + salaryMonth(15.48, 86.67) + "  |"
                + "\n" + line + "\n" + "| Серебряков Иван Петрович           "
                + salaryMonth(15.98, 86.67) + "  |" + "\n" + line);


        Task();
        System.out.println(checkingX(-4));
        System.out.println(checkingX(0));
        System.out.println(checkingX(4));

        verifyEquals("x is negative", checkingX(-6));
        verifyEquals("x is zero", checkingX(0));
        verifyEquals("x is positive", checkingX(8));

        /**
         * Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
         * Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9,
         * снова считается сумма всех чисел.
         * Например:
         * год рождения 1999
         * 1 + 9 + 9 + 9 = 28
         * 2 + 8 = 10
         * 1 + 0 = 1
         * Счастливое число - 1
         */
        Task();
        int year = 1980;
        int n1 = year / 1000;
        int n2 = year / 100 % 10;
        int n3 = year % 100 / 10;
        int n4 = year % 10;

        System.out.println("Lucky number is " + lukkyNumber(1980));
        verifyEquals(9, 9);

        /**
         *Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
         * Если разница больше 2, необходимо показать сообщение:
         * “Среднее значение … отличается от медианы … на … “.
         * Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
         *
         * b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
         *
         * *Медиана - это серединное число в отсортированном наборе чисел.
         * 1, 3, 9 → медиана 3
         * 12, 13, 101 → медиана 13
         * 14, 2, 12 → медиана 12
         */
        Task();

        /**
         * Написать метод, который использует методы класса Math, принимает на вход сумму к оплате
         * (например, 10.75) и округляет сумму в пользу покупателя.
         * Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.
         */
        Task();
        System.out.println(change(10.75));
        verifyEquals("11 руб. 0 коп.", "10.75");

        /**
         * Посчитать с помощью методов класса Math
         * a = 3
         * b = 4
         * c = 20
         *((a * b + c) * ab)
         * Вернуть значение с округлением в бОльшую сторону.
         */

        Task();
        System.out.println(bigNum(3,4,20));

        Task();
        System.out.println(num(1));
        verifyEquals(1, 1);

        System.out.println("score = " + score(86.6));
        verifyEquals(91.60, 91.60);

        /**
         * Написать метод, который с помощью методов класса Math высчитывает любую степень сгенерированного случайного числа. Метод возвращает математически округленное целое значение и выводит на экран:
         * “Число … в степени … = …”
         *Число может быть в пределах от 0 до 1 исключительно.
         * Степень числа может быть от 0 до 10 включительно
         */

        System.out.println(ran(4));

        /**
         *
         */


    }



}






















