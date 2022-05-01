package homework;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class HW7 {
    static int a = 1;

    public static void Task() {

        System.out.println("******************** " + "Task # " + a + " ********************");
        a++;
    }

    public static int Age(int[] count) {
        int ages = 0;
        for (int i = 0; i < count.length; i++) {
            ages += count[i];
        }
        return ages / count.length;
    }

    public static void threeNums(int[] random) {
        int minZ = random[0];
        int maxZ = random[0];
        int averZ = 0;

        for (int i = 0; i < random.length; i++) {
            averZ += random[i];

            if (random[i] < minZ) {
                minZ = random[i];
            }
            if (random[i] > maxZ) {
                maxZ = random[i];
            }
        }
        System.out.println("min value = " + minZ + "\t" + "max value = " + maxZ + "\t"
                + "average value of numbers = " + averZ / random.length);
    }

    public static int[][] Freedom(int[] free) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < free.length; i++) {
            if (free[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int[] evenMassive = new int[even];
        int[] oddMassive = new int[odd];

        even = 0;
        odd = 0;
        for (int i = 0; i < free.length; i++) {
            if (free[i] % 2 == 0) {
                evenMassive[even] = free[i];
                even++;
            } else {
                oddMassive[odd] = free[i];
                odd++;
            }
        }
        return new int[][]{evenMassive, oddMassive};
    }

    public static int [] getRandomFromMines(int begin, int end){
        int len = 0;
        for(int i = begin; i <= end; i++){
            if(i % 2 != 0){
                len ++;
            }
        }
        int [] count = new int[len];
        int hhh = 0;
        for (int i = begin; i <= end; i++){
            if(i % 2 != 0){
                count[hhh] = i;
                hhh++;
            }
        }
        return count;

    }


    public static void main(String[] args) {
        Task();
        /**
         * Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).
         */
        String[] catsNames;
        catsNames = new String[8];
        catsNames[0] = "Мурзик";
        catsNames[1] = "Черный";
        catsNames[2] = "Бони";
        catsNames[3] = "Мурка";
        catsNames[4] = "Рыжуля";
        catsNames[5] = "Васька";
        catsNames[6] = "Буся";
        catsNames[7] = "Муся";

        System.out.println(catsNames[4]);
        System.out.println("++++++++++++++++++++++++++++++++++");


        Task();
        /**
         * В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
         * а значение элемента с индексом 1 на “Черныш”.
         */
        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";
        System.out.println(catsNames[4]);
        System.out.println(catsNames[1]);

        Task();
        /**
         * Создать массив catsColors и заполнить его значениями.
         */
        String[] catsColors;
        catsColors = new String[8];
        catsColors[0] = "серый";
        catsColors[1] = "черный";
        catsColors[2] = "полосатый";
        catsColors[3] = "темно серый";
        catsColors[4] = "рыжий";
        catsColors[5] = "серый";
        catsColors[6] = "рыжий";
        catsColors[7] = "серый";

        System.out.println(catsColors[5]);

        Task();
        /**
         * Создать массив catsAges и заполнить его любыми значениями.
         */
        int[] catsAges = new int[8];
        catsAges[0] = 1;
        catsAges[1] = 2;
        catsAges[2] = 3;
        catsAges[3] = 4;
        catsAges[4] = 5;
        catsAges[5] = 6;
        catsAges[6] = 1;
        catsAges[7] = 2;

        System.out.println(catsAges[5]);

        Task();
        /**
         * Создать массив isCatRed и заполнить его соответствующими значениями
         */
        String[] isCatRed = new String[2];
        isCatRed[0] = "Рыжик";
        isCatRed[1] = "Рыжий";

        System.out.println(isCatRed[0] + "\t" + isCatRed[1]);

        Task();
        /**
         * Распечатать для массивов catsNames и catsColors:
         * имя кота в коробке с номером 6
         * имена котов из коробок с четными индексами
         * имена котов из коробок, чьи индексы кратны 4
         * цвет котов из коробок с нечетными индексами
         * цвет котов из коробок, чьи индексы кратны 3
         */
        System.out.println(catsNames[6]);

        System.out.println("++++++++++++++++++++++++++++++++++");

        for (int i = 0; i <= 7; i += 2) {
            System.out.println(catsNames[i]);
        }
        System.out.println("++++++++++++++++++++++++++++++++++");
        for (int i = 0; i <= 7; i++) {
            if (i % 4 == 0) {
                System.out.println(catsNames[i]);
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++++");
        for (int i = 1; i <= 7; i += 2) {
            System.out.println(catsColors[i]);
        }
        System.out.println("++++++++++++++++++++++++++++++++++");
        for (int i = 0; i <= 7; i++) {
            if (i % 3 == 0) {
                System.out.println(catsColors[i]);
            }
        }

        Task();
        /**
         * Распечатать “Накорми кота!” для всех серых котов
         */
        for (int i = 0; i <= 7; i++) {
            if (catsColors[i] == "серый") {
                System.out.println("Накорми кота!");
            }
        }
        Task();
        /**
         * Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
         */
        for (int i = 0; i < 8; i++) {
            if (catsAges[i] <= 2) {
                System.out.println("Отнеси кота на прививку!");
            }
        }
        Task();
        /**
         * Для кота в последней коробке распечатать имя, цвет, возраст
         */
        System.out.println(catsNames[7] + " " + catsColors[7] + " color " + catsAges[7] + " years old");

        Task();
        /**
         * Распечатать имена всех котов, чей возраст больше 2 лет
         */
        for (int i = 0; i < 8; i++) {
            if (catsAges[i] > 2) {
                System.out.println(catsNames[i]);
            }
        }
        Task();
        /**
         * Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
         */
        for (int i = 0; i < 8; i++) {
            if (catsNames[i] == "Рыжик") {
                System.out.println("Накорми кота!");
            }
        }

        Task();
        /**
         * Распечатать средний возраст котов из массива catsAges
         */
        int sumAges = catsAges[0] + catsAges[1] + catsAges[2] + catsAges[3] + catsAges[4] + catsAges[5] + catsAges[6]
                + catsAges[7];
        System.out.println("Average age of cats = " + (sumAges / catsAges.length));

        Task();
        /**
         * Распечатать возраст самого молодого кота
         */
//        int[] minAge = new int[]{2,3,4,1,5,6,9,10};
//        int[] minAge1 = {2,3,4,1,5,6,9,10};
//        int[] minAge2 = new int[8];
//        System.out.println(Arrays.toString(minAge2));
//        minAge2[0] = 10;
//        minAge2[1] = 3;
//        minAge2[2] = 4;
//        minAge2[3] = 7;
//        minAge2[4] = 5;
//        minAge2[5] = 2;
//        minAge2[6] = 2;
//        minAge2[7] = 10;
//        System.out.println(Arrays.toString(minAge2));
        int[] minAge = new int[]{2, 3, 4, 1, 5, 6, 9, 10};
        int a = minAge[0];
        for (int i = 0; i < minAge.length; i++) {
            if (minAge[i] < a) {
                a = minAge[i];
            }
        }
        System.out.println(a);


        Task();
        /**
         * Распечатать возраст самого старого кота
         */
        int[] maxAge = new int[]{2, 3, 4, 1, 5, 6, 9, 10};
        int d = maxAge[0];
        for (int i = 0; i < maxAge.length; i++) {
            if (maxAge[i] > d) {
                d = maxAge[i];
            }
        }
        System.out.println(d);

        Task();
        /**
         * Распечатать количество серых котов
         */

        int c = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("серый")) {
                c++;
            }
        }
        System.out.println("Количество серых котов = " + c);

        Task();
        /**
         *Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет
         */

        for (int i = 0; i < 8; i += 2) {
            if (catsAges[i] < 3) {
                System.out.println(catsNames[i]);
            }
        }

        Task();
        /**
         * Создать массив четных положительных чисел,
         * значения которых не больше 10. (заполняем значения с помощью цикла for)
         */
        int b = 0;
        for (int i = 0; i <= 10; i += 2) {
            // System.out.println(i);
            b++;
            //System.out.println(b);
        }
        System.out.print(b);
        int[] evenNum = new int[b];
        b = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                evenNum[b] = i;
                b++;
            }
        }
        System.out.println(Arrays.toString(evenNum));

        Task();
        /**
         * Написать метод, который принимает на вход массив int, и возвращает среднее значение.
         * Проверить работу метода тестом, если параметр - массив catsAges
         */
        System.out.println(Age(catsAges));

        Task();
        /**
         * Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900
         */
        System.out.println(getRandomFromMines(-1000, -900));


        Task();
        /**
         * Создать массив из 10 случайных положительных целых чисел
         */
        int[] randomNum = new int[10];
        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = (int) (Math.random() * 10);
            //System.out.print(randomNum[i] + " ");
            // System.out.println("\t");
        }
        System.out.println(Arrays.toString(randomNum));

        Task();
        /**
         *Создать метод, который принимает на вход массив int,и возвращает минимальное значение,
         *  максимальное значение и среднее значение всех чисел массива.
         *  Проверить работу метода на массиве из задания 20.
         */
        threeNums(randomNum);

        Task();
        /**
         * Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.
         */
        System.out.println(Arrays.deepToString(Freedom(randomNum)));

        Task();
        /**
         * Создать двумерный массив, который состоит из имен, возрастов, цветов котов:
         * Распечатать все данные котов в коробках с четными индексами, используя двумерный массив.
         */

        String[][] cats = new String[][]{{"Мурзик", "Черныш", "Васька", "Малыш", "Муська", "Шок", "Бес", "Кот"},
                {"5", "2", "3", "1", "5", "2", "3", "4"},
                {"Grey", "Dlack", "White", "Grey", "Red", "Red", "Grey", "White"}};
        for (int i = 0; i < cats[0].length; i++) {
            if (i % 2 == 0) {
                System.out.println("Name of cat is " + cats[0][i] + " Ages of cat = " + cats[1][i]
                        + " Color of cat is " + cats[2][i]);
            }
        }

        Task();
        /**
         * Создать двумерный массив целых случайных чисел от 1 до 10 размерности 4*8.
         */

        int[][] randomMassive = new int [4][8];
        for (int i = 0; i < randomMassive.length; i++) {
            for (int j = 0; j < randomMassive[i].length; j++) {
                randomMassive[i][j] = (int)(Math.random() * 10);
            }
        }
        System.out.println(Arrays.deepToString(randomMassive));

        Task();
        /**
         * Вывести сумму всех четных чисел массива из задания 24.
         */

        int sumMassive = 0;
        for(int i = 0; i < randomMassive.length; i++){
            for(int j = 0; j < randomMassive[i].length; j++){
                if(randomMassive[i][j] % 2 == 0){
                    sumMassive += randomMassive[i][j];
                }
            }
        }
        System.out.println(sumMassive);
    }

}
