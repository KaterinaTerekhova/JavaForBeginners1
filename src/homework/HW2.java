package homework;

import java.net.Socket;

public class HW2 {

    public static void main(String[]args) {
        //Создать целочисленные переменные k, l, m и присвоить им значения на ваше усмотрение
        int k = 7;
        int l = 41;
        int m = 220;

        String line = "______________________";
        String add = "                       ";
        String add1 = ",";
        int sumKL = k + l;
        int multKL = k * m;
        int subLM = l - m;
        int sumKLM = k + l + m;
        int sumLMK = l + m + k;

        //Вывести значения переменных в столбик
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(line);

        //Вывести значения переменных в строку
        System.out.print(k + " " + l + " " + m);
        System.out.println(add);
        System.out.println(line);

        //Используя конкатенацию, вывести значения переменных в строку через запятую,чтобы было напечатано, например

        System.out.println(k + add1 + " " + l + add1 + " " + m);
        System.out.println(line);

        /**
         *  Вывести значения этих переменных так, чтобы было понятно, какое значение к какой переменной относится.
         */
        System.out.println("k = " + k + ";");
        System.out.println("l =" + l + ";");
        System.out.println("m =" + m + ";");
        System.out.println(line);

        //Распечатать следующие выражения, где вместо … будет выведен результат арифметической операции:
        System.out.println("Sum of k and l = " + sumKL);
        System.out.println("k * m = " + multKL);
        System.out.println("Разность переменных l и m = " + subLM);
        System.out.println(line);

        System.out.println("Результат деления k на l = " + k / l + ", а остаток от деления  =  " + k % l);
        System.out.println("Результат деления k на m = " + k / m + ", а остаток от деления  =  " + k % m);
        System.out.println("Результат деления l на k = " + l / k + ", а остаток от деления  =  " + l % k);
        System.out.println(line);

        //Создать переменные apple и  student и присвоить им значения 40 и 6 соотетственно. Распечатать выражение:
        //Распечатать это же выражение со значениями 100 и 21.
        int apple = 40;
        int student = 6;
        int devAS = apple / student;

        System.out.print("Если " + apple + " " + "яблок поделить на " + student + " "
                + "учеников, то каждый ученик получит по " + devAS + " " + "яблок(а), и " + (apple % student) + " "
                + "яблок(а) останется учителю.");
        System.out.println(add);

        int apple1 =  100;
        int student1 = 21;
        int devAS1 = apple1 / student1;

        System.out.println("Если " + apple1 + " " + "яблок поделить на " + student1 + " "
                + "учеников, то каждый ученик получит по " + devAS1 + " " + "яблок(а), и " + (apple1 % student1) + " "
                + "яблок(а) останется учителю.");
        System.out.println(line);

        //Сумма чисел k, l, m++ и sumKLM-- = …, а разность m++ и  sumLKM = …

        System.out.println("Сумма чисел k, l, m++ и sumKLM-- = " + (k + l + m++ + sumKLM--) + ", " +
                "а разность m++ и sumLMK = " + (m++ - sumLMK));

        //Показать, что число 48 кратно 8, и что оба этих числа - четные. А числа 47 и 49 - нечетные.
        System.out.println(48 % 8 + " " + "следовательно," + " " + "48 кратно 8");
        System.out.println(48 / 2 + " " + "следовательно," + " " + "48 - четное число");
        System.out.println(8 / 2 + " " + "следовательно," + " " + "8 - четное число");


        //x = 2,   y = 3,  a = k, b = l, c = m, d = y - x
        // a. Вывести на печать математическое выражение из заданий 21, 22 и 23
        //b. Посчитать значения из задания a и вывести результат на печать в виде таблицы.
        //result21, result22 и result23 - результаты вычислений в каждом выражении
        //(считать с помощью программы, а не вручную!)
        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;
        String line1 = "+________________________+";

        System.out.println(line1);
        System.out.println("| task  | result         |");
        System.out.println(line1);
        System.out.println("| 21    |" + Math.pow(x + 3, 2) + "            |");
        System.out.println(line1);
        System.out.println("| 22    |" + (((3 + 4 * x) / 5)
                - (((10 * (y - 5)) * (a + b + c)) / x)
                + (9 * ((4 / x) + ((9 + x) / y)))) + "            |");
        System.out.println(line1);
        System.out.println((((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y) / (x + y)))
                / (a + b + ( c / d) + ((a + b) / (c +d)) + a * b));
        System.out.println(line1);


















    }
}
