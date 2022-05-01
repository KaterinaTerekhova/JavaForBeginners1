package homework;

import com.sun.jdi.IntegerValue;
import com.sun.jdi.ShortValue;

public class HW3 {

    public static void main (String[]args) {

        /**
         *  Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.
         */
        String task = "Task #";
        byte a = 10;
        byte b = 11;
        String line = "+_________________________________+";
        String line1 = "+_____________________________________________+";

        System.out.println(task  + "2");
        System.out.println(a + "\t" + b);

        /**
         * Создать переменные s и t типа short, присвоить им негативное и позитивное значения с разницей 60000.
         */
        short s = -30000;
        short t =  30000;

        System.out.println(task + "3");
        System.out.println(s + "\t" + t);
        System.out.println(s - t);

        /**
         * Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
         * Затем присвоить максимально возможное значение этого типа. Распечатать оба значения в виде таблицы:
         */

        int i = Integer.MIN_VALUE;

        System.out.println(task + "4");
        System.out.println(line);
        System.out.println("| int min      |" + " " + i + "      |");
        System.out.println(line);
        i = Integer.MAX_VALUE;
        System.out.println("| int max      |" + "  " + i + "      |");
        System.out.println(line);

        /**
         * Создать переменную phoneNumber и присвоить ей значение номера телефона с кодом страны и города
         */

        long phoneNumber = 18183331657L;

        System.out.println(task + "5");
        System.out.println(phoneNumber);

        /**
         * Создать переменную f типа float и присвоить ей значение 100.101101. Создать переменную d типа double и присвоить ей значение 100.101101.
         * Распечатать результат в виде таблицы:
         */

        float f = 100.101101F;
        double d = 100.101101;

        System.out.println(task + "6");
        System.out.println(line1);
        System.out.println("| float f = 100.101101    |" + " " + f + "        |");
        System.out.println(line1);
        System.out.println("| double d = 100.101101   |" + " " + d + "        |");
        System.out.println(line1);

        /**
         * a) Создать переменную типа Double с именем dd  и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
        * b) Создать переменную типа Float с именем ff  и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
        * Распечатать результаты задания №7, как продолжение таблицы из задания № 6.
        */
        Double DD = (10.09999 + 20.09999);
        Float FF = (10.09999F + 20.099999F);

        System.out.println(task + "7");

        System.out.println(line1);
        System.out.println("| float f = 100.101101  |" + " " + f + "          |");
        System.out.println("| double d = 100.101101 |" + " " + d + "          |");
        System.out.println("| Double DD             |" + " " + DD + "  |");
        System.out.println("| Float FF              |" + " " + FF + "            |");
        System.out.println(line1);

        /**
        * Создать переменную result и присвоить ей значение выражения 10 / 3 (с максимальной точностью)
        */
        float result = 10 / 3F;
        double result1 = 10 / 3D;

        System.out.println(task + "8");
        System.out.println(result);
        System.out.println(result1);

        /**
         * Создать переменные sum, product, quotient и remainder, и  присвоить им значения вычислений переменных f и d
         */
        double sum, product, quotient, remainder;
        sum = f + d;
        product = f * d;
        quotient = f / d;
        remainder = f - d;

        System.out.println(task + "9");
        System.out.println(sum + "\n" + product + "\n" + quotient + "\n" + remainder);

        /**
         * Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений):
         * t1 = 0;
         * t2 = 150;
         * t3 = -120;
         * t4 = - 505.505;
         * t5 = 100100;
         * t6 = 100010001000;
         * t7 = 2.66666666666666;
         * t8 = - 1000000.001;
         * t9 = 1010;
         * Распечатать значения всех переменных.
         */

        byte t1 = 0;
        short t2 = 150;
        byte t3 = -120;
        float t4 = - 5050.505F;
        int t5 = 100100;
        long t6 = 100010001000L;
        double t7 = 2.66666666666666;
        double t8 = - 1000000.001;
        short t9 = 1010;

        System.out.println(task + "11");
        System.out.println(t1 + "\n" + t2 + "\n" + t3 + "\n" + t4 + "\n" + t5 + "\n" + t6 + "\n"
                + t7 + "\n" + t8 +"\n" + t9);

        String line2 = "+--------------------------------------------------------+";


        System.out.println(task + "12");
        System.out.println(line2);
        System.out.println("|   Type   |" + "   Size in bits   |" + "     max     |" + "     min    |");
        System.out.println(line2);
        System.out.println("| " + Byte.TYPE + "     | " + Byte.SIZE + "                | " + Byte.MAX_VALUE + "        | "
                + Byte.MIN_VALUE + "        |");
        System.out.println(line2);
        System.out.println("| " + Short.TYPE + "    | " + Short.SIZE + "               | " + Short.MAX_VALUE + "      | "
                + Short.MIN_VALUE + "      |");
        System.out.println(line2);
        System.out.println("| " + Integer.TYPE + "      | " + Integer.SIZE + "               | "
                + Integer.MAX_VALUE + " | " + Integer.MIN_VALUE + " |");
        System.out.println(line2);

        /**
         * Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения,
         * сравнить 2 переменные друг с другом с помощью метода .equal.
         * Вывести результат сравнения на печать в виде выражения:
         * “Если num1 = num2, то результат сравнения методом .equal = …”
         * Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
         * “Если num1 не равно num2, то результат сравнения методом .equal = …”
         */

        Integer num1 = 2;
        Integer num2 = 2;

        System.out.println(task + "13");
        System.out.println(num1.equals(num2));
        System.out.println("Если num1 = num2, То результат сравнения сетодом .equal = " + num1.equals(num2));

        num1 = 2;
        num2 = 4;

        System.out.println(num1.equals(num2));
        System.out.println("Если num1 = num2, То результат сравнения сетодом .equal = " + num1.equals(num2));

        /**
         * Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
         * а) одинаковыми значениями
         * b) number1 < number2
         * c) number1 > number2
         * сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет),
         * и вывести результаты сравнения на печать в виде выражений:
         * “Если number1 = number2, то результат сравнения методом … = …”
         * “Если number1 < number2, то результат сравнения методом … = …”
         * “Если number1 > number2, то результат сравнения методом … = …”
         */

        int number1 = 50;
        int number2 = 50;

        System.out.println(task + "14");
        System.out.println("Если number1 = number2, то результат сравнения методом compare = "
                        + (Integer.compare(number1, number1)));

        number1 = 25;
        number2 = 40;

        System.out.println("Если number1 < number2, то результат сравнения методом compare = "
                + (Integer.compare(number1, number1)));

        number1 = 45;
        number2 = 30;

        System.out.println("Если number1 > number2, то результат сравнения методом compare = "
                + (Integer.compare(number1, number1)));

        /**
         * Создать переменную типа Float, присвоить ей значение 234.9999 и распечатать значение в int
         */

        Float temp = 234.9999F;

        System.out.println(task + "15");
        System.out.println(temp.intValue());

        /**
         * С помощью метода sum() класса Double посчитать сумму двух переменных типа double
         */
        double temp1 = 24;
        double temp2 = 42;

        System.out.println(task + "16");
        System.out.println(Double.sum(temp1, temp2));

        /**
         * С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float
         */

        Float temp3 = 5.099887766F;
        Float temp4 = 5.678940099F;


        System.out.println(task + "17");
        System.out.println(Integer.sum(temp3.intValue(), temp4.intValue()));

        /**
         * Создать 2 переменные типа Short:
         * short1 = 12000
         * short2 = 12300
         * Распечатать фразу:
         * “12000 - 12300 = -300”
         * где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
         * Присвоить переменной short1 значение 12500, вывести фразу:
         * “12500 - 12300 = 200”
         * где значение 200 выведено с помощью метода класса Short, а не операцией вычисления
         */

        Short short1 = 12000;
        Short short2 = 12300;

        System.out.println(task + "18");
        System.out.println("12000 - 12300 = " + Short.compare(short1,short2));

        short1 = 12500;
        System.out.println("12500 - 12300 = " + Short.compare(short1,short2));

        /**
         * Создать переменные:
         * String str1 = "123.56";
         * String str2 = "123.55";
         * Double doub1 = 123.56;
         * Double doub2 = 123.55;
         *
         * Распечатать результат doub1 - doub2
         *
         * Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2
         */

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

        System.out.println(task + "19");
        System.out.println("doub1 - doub2 = " + (doub1 - doub2));
        System.out.println(Double.valueOf(str1) - Double.valueOf(str2));

        /**
         * Создать переменную подходящего типа данных для хранения результатов измерения
         * температуры тела кота (значения температуры в Цельсиях).
         * Присвоить этой переменной сначала максимальное значение, затем минимальное значение.
         * Посчитать и распечатать среднее значение, округленное с помощью метода класса Math.
         * Распечатать результат среднего значения температуры тела кота.
         */

        Double temperature;
        temperature = 37.0;
        Double average;
        average = temperature / 2;
        temperature = 41.0;
        average = average + temperature / 2;

        System.out.println(task + "20");
        System.out.println("Средняя тмпература тела кота = " + Math.round(average));

        /**
         * Создать переменную n типа Number, присвоить ей максимально возможное значение.
         * Присвоить n значение 10,
         * затем присвоить n значение 10.999999999.
         *
         * Распечатать результаты в виде выражения:
         * “Переменная n может принимать значения:
         *  n =  …
         *  n =  …
         *  n =  …
         *  Это возможно, потому что …”
         */

        Number n = Double.MAX_VALUE;
        n = 10;
        n = 10.999999999;

        System.out.println(task + "21");
        System.out.println("Переменная n может принимать значения: " + "\n" + "n =" + Double.MAX_VALUE + "\n"
                + "n = " + n.intValue() + "\n" + "n = " + n + "\n" + "Это возможно, потому что " );

        /**
         * Создать переменную Integer numberInteger = 100.
         * Доказать, что numberInteger имеет тип Integer,
         * а numberInteger.toString() имеет тип String.
         */

        Integer numberInteger = 100;

        System.out.println(task + "22");
        System.out.println("numberInteger имеет значение Integer" + " " + (numberInteger + 1));
        System.out.println("numberInteger.toString() + 1 имеет тип String" + " " + numberInteger.toString() + 1 );

        /**
         * Вывести на экран следующие выражения, используя для печати только переменные:
         * “36.6 градусов по Цельсию  = … градусов по Фаренгейту”, где значение по Фаренгейту
         * должно быть вычислено по формуле //        20 ° C × 9/5 + 32 = 68 ° F
         * “50 kilogram = … lbs,  50 lb = … kg”, где значения должны быть вычислены по формулам
         */
        double temperatC = 36.6;
        double temperatF = temperatC * 9 /5 + 32;
        double kilo = 50;
        double lb = kilo * 2.20462;
        double lb1 = 50;
        double kilo1 = lb1 / 2.20462;

        System.out.println(task + "23");
        System.out.println("36.6 градусов по Цельсию  = " + temperatF + " " + "градусов по Фаренгейту");
        System.out.println("50 kilogram = " + lb + " " + "lbs, 50 lb = " + kilo1 + " " + "kg");







    }
}
