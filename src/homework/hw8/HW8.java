package homework.hw8;

import java.util.Arrays;

import static homework.utils.Utils.*;

public class HW8 {

    static Integer intObject = 100;
    static Double doubObject = 50.5;
    static String strObject = "Good job";

    public static int[] getMassive(int num0, int num1, int num2, int num3, int num4) {
        int[] massive = new int[5];

        massive[0] = num0;
        massive[1] = num1;
        massive[2] = num2;
        massive[3] = num3;
        massive[4] = num4;

        return massive;
    }

    public static int[] getMassive1(int num0, int num1, int num2, int num3, int num4) { //2-nd way
        return new int[]{num0, num1, num2, num3, num4};
    }

    public static int printArray(int[] arr) {  //метод Артема
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
        return 0;
    }

    public static String printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
        return null;
    }

    public static double printArray(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
        return 0;
    }

    public static double[] getMassive2(double a, double s, double d, double f, double g) {

        return new double[]{a, s, d, f, g};
    }

    public static int printArray1(int[] arr1) {  //метод Артема
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr1[i]);
        }
        System.out.print("]");
        return 0;
    }

    public static double[] getMassiveDouble(int[] getMassive1) {
        if (getMassive1.length > 0) {
            double[] result = new double[getMassive1.length];
            for (int i = 0; i < getMassive1.length; i++) {
                result[i] = (getMassive1[i] * 2.5);
            }
            return result;
        }
        return new double[0];
    }


    public static int[] getArrayEven(int[] getMassive1) {

        int count = 0;
        for (int i = 0; i < getMassive1.length; i++) {
            if (getMassive1[i] % 2 == 0) {
                count++;
            }
        }
        return new int[]{count};

    }

    public static int[] getArrayOdd(int[] getMassive1) {

        int count = 0;
        for (int i = 0; i < getMassive1.length; i++) {
            if (getMassive1[i] % 2 == 0) {
                getMassive1[i] = count;
            }
        }
        return getMassive1;

    }

//    public static int[] getArrayOdd1(int[] getMassive1) {
//
//        int odd = 0;
//
//        for (int i = 0; i < getMassive1.length; i++) {
//            if (getMassive1[i] % 2 == 0) {
//                odd++;
//            }
//        }
//        int[] oddMassive = new int[odd];
//
//        for (int i = 0; i < getMassive1.length; i++) {
//            if (getMassive1.length != 0 && getMassive1[i] >= 0) {
//                if (getMassive1[i] % 2 != 0) {
//                    oddMassive[i] = getMassive1[i];
//                    i++;
//                }
//            } else {
//                System.out.println("Error");
//            }
//        }
//        System.out.println(Arrays.toString(oddMassive));
//        return oddMassive;
//    }

    public static boolean[] getBooleanMassive(int[] arrayNew) {
        boolean[] arrayBoolean = new boolean[arrayNew.length];
        if (arrayNew == null || arrayNew.length == 0) {
            return null;
        }
        for (int i = 0; i < arrayNew.length; i++) {
            if (arrayNew[i] > 10) {
                arrayBoolean[i] = true;
            } else
                arrayBoolean[i] = false;
        }
        return arrayBoolean;
    }


    public static void setIntObject(Integer intObject) {

        HW8.intObject = intObject;
    }

    public static String createSentence(String[] words) {
        String sentence = "";
        for (int i = 0; i < words.length; i++) {
            sentence += words[i] + " ";
        }
        return sentence;
    }

    public static int getSumMassive(int[] sum) {
        int sumNums = 0;

        for (int i = sum.length / 2; i < sum.length; i++) {
            sumNums += sum[i];
        }

        return sumNums;
    }

    public static int[] getMassiveMulti(int multi) {
        if (multi < 0 || multi >= 10) {
            return new int[]{};
        } else {
            int[] arrayMassiveMulti = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int i = 0; i < arrayMassiveMulti.length; i++) {
                arrayMassiveMulti[i] = arrayMassiveMulti[i] * multi;
            }
            return arrayMassiveMulti;
        }
    }

    //    public static int random(int upper, int lower){    //метод Ирины
//        return (int)(Math.random() * (upper - lower) + lower);
//    }
    public static int[] generationArray(int length, int from, int to) {

        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = from + (int) (Math.random() * (to + 1));
        }
        return array;
    }

    public static int[] getArrayLD(int l, int d) {
        double[] ld = new double[l];
        for (int i = 0; i < l; i++) {
            ld[i] = Math.random() * 0.9 + 0.1; // 0.1 - это самый малый шаг
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < d; j++) {  //цикл прокручиваем пока длина и пока d
                ld[i] *= 10;    //случайное число умножаем на 10. пока не встретим l и d
            }
        }
        int[] vozvrat = new int[l];
        for (int i = 0; i < l; i++) {
            vozvrat[i] = (int) ld[i]; //округляем случайное число
        }
        return vozvrat;
    }




    //Checking
    public static int[] oddIndicesAlgorithm(int[] arr) {

        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd++;
            } else {
                even++;
            }
        }
        int[] oddMassive = new int[odd];

        odd = 0;
        for (int i = 0; i < arr.length; i++) {
            // if (arr.length != 0) {
            if (arr[i] % 2 != 0) {
                oddMassive[odd] = arr[i];
                odd++;
            }
        }
        return oddMassive;

    }

    public static int[] task19(int l, int d){
            int[] task19 = new int[l];
            if(d <= 0 || d > 10 || l <= 0){
                System.out.println("error");
            }
            if(d > 0 && d < 2)
                for(int i = 0; i < l; i++){
                    task19[i] = (int)(Math.random() * 10);
                }
            if(d > 1 && d < 3)
                for(int i = 0; i < l; i++){
                    task19[i] = (int)(Math.random() * 90 + 10);
                }
            if(d > 2 && d < 4)
            for(int i = 0; i < l; i++){
                task19[i] = (int)(Math.random() * 900 + 100);
                }
            if(d > 3 && d < 5)
                for(int i = 0; i < l; i++){
                    task19[i] = (int)(Math.random() * 9000 + 1000);
                }
            if(d > 4 && d < 6)
            for(int i = 0; i < l; i++){
                task19[i] = (int)(Math.random() * 90000 + 10000);
            }
            if(d > 5 && d < 7)
            for(int i = 0; i < l; i++){
                task19[i] = (int)(Math.random() * 900000 + 100000);
            }
            return task19;
    }
    /**
     * Написать метод, который принимает на вход массив целых положительных чисел,
     * и возвращает массив только двузначных чисел. ПРоверить работу метода на массиве из задания 18.
     */

    public static int[] task20(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] / 10 >= 1) {
                count++;          // в count помещаем двузначные числа
            }
        }
        int[] vozvrat = new int[count];
        count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] / 10 >= 1) {
                vozvrat[count] = a[i];  // присваиваем новому массиву двузначные значения
                count++;
            }
        }
        return vozvrat;
    }

    /**
     * Написать метод, который принимает на вход
     * массив целых положительных двузначных чисел, и возвращает массив разниц между десятками и единицами
     */

    public static int[]tensOnesArray(int[]array){
        int[] tensOnes = new int[array.length];
        for(int i = 0; i < array.length; i++){
            tensOnes[i] = array[i]  - array[i] % 10;
            //tensOnes[i] = Math.abs(array[i] / 10 - array[i] % 10); //смотря что возвращаем как разницуЖ десятки или единицы
        }
        return tensOnes;
    }

    /**
     * Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9,
     * и возвращает массив, который содержит номер телефона, состоящий из этих чисел,  и название страны, которой номер принадлежит.
     * Например:
     * method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}
     */

    public static String[] getPhoneNumber(int[] array){
        if(array == null || array.length == 0){
            return null;
        }
        String[] phoneNumber = new String[2];
        for(int i = 0; i < array.length; i++){
            if(array[i] >= 0){
                phoneNumber[0] = " " + "\"" + array[0] + "(" + array[1] + array[2] + array[3] + ")" + array[4] + array[5]
                    + array[6] + "-" + array[7] + array[8] + "-" + array[9] + array[10] + "\"" ; //на
            }
            if(array[i] == 1){
                phoneNumber[1] = "\"USA\"";
            }

        }
        return phoneNumber;
    }

    /**
     * Написать метод, который принимает массив целых положительных чисел больше 0, и возвращает массив уникальных чисел.
     */
    public static int[] getUnikalMassive(int[]a){   //{10,5,2,4,5,10,1,5,10}
        int[] unikal = {};
        int count = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] == a[j]){
                    a[j] = 0; //получаем массив с 0 {10,5,2,4,0,0,1,0,0}
                }
            }
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] == 0){
                count++;
            }
        }
        unikal = new int[a.length - count];
        count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] != 0){
                unikal[count] = a[i];
                count++;
            }
        }
        return unikal;
    }

    /**
     * Написать метод, который принимает на вход массив целых положительных чисел,
     * и возвращает количество уникальных и неуникальных элементов в этом массиве
     */

    public static int[] getUnicAndUnunicNumbers(int[] array){
        int n = 0;
        if(array.length > 0) {          // массив положительных чисел
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0) {
                    for(int j = i + 1; j < array.length; j ++){  //новый цикл начинаем прогонять с того индекса i, + 1,со следующего индекса
                        if(array[i] == array[j]){    //если они равны, то я беру повторяющееся число и заменяю
                            // его на -1, чтобы оно не проходило дальнейшую проверку, в начале цикла array[i]>=0
                            array[j] = -1;
                            n++; //считаю неуникальные элементы
                        }
                    }
                }
            }
            return new int[]{array.length - n; n};
        }
        return new int[]{};
    }

    //Checking

    public static int[] getRandomFromMines(int[] get) {
        int len = 0;
        for (int i = 0; i <= get.length; i++) {
            if (i % 2 != 0) {
                len++;
            }
        }
        int[] count = new int[len];
        int hhh = 0;
        for (int i = 0; i <= get.length; i++) {
            if (i % 2 != 0) {
                count[hhh] = get[i];
                hhh++;
            }
        }
        return count;
    }

    public static int sumArray(int[] get) {
        int sum = 0;
        for (int i = 0; i < get.length; i++) {
            sum += get[i];
        }
        return sum;
    }

    public static int biggerValue(int numA, int numB) {
        if (numA > numB) {
            return numA;
        } else {
            return numB;
        }
    }

    public static boolean getBool(int argument) {
        if (argument >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int areNumbersEqual(int ff, int gg) {
        if (ff == gg) {
            return 0;
        } else if (ff < gg) {
            return -1;
        } else {
            return 1;
        }
    }

    public static String integM(Integer M) {
        if ((M % 3 == 0) && (M % 5 == 0)) {
            return "Good Number";
        } else if ((M % 3 == 0) && (M % 5 != 0)) {
            return "Bad Number";
        } else if ((M % 5 == 0) && (M % 3 != 0)) {
            return "Poor Number";
        } else {
            return "-1";
        }
    }

//    public static int[] minMaxAve(int[] get, int min, int max) {
//
//        int[] massive = new int[max];
//
//        int minNumber = get[0];
//        int maxNumber = get[0];
//
//        for (int i = get[min]; i < get[max]; i++) {
//
//            if (massive[i] < minNumber) {
//                minNumber = massive[i];
//            } else if (massive[i] > maxNumber) {
//                maxNumber = massive[i];
//            }
//        }
//        return massive;
//    }

//    public static int[] intersection(int[]get1, int[] get2){
//        int[] newArray = new int[];

    public static double[] minMaxAveAlgorithm(int[] numbers, int min, int max) {
        if (numbers.length > 0 && min <= max && min >= 0) {

            int minimumNumber = numbers[min];
            int maximumNumber = numbers[min];
            int sum = 0;
            int count = 0;

            for (int i = min; i <= max; i++) {
                if (minimumNumber > numbers[i]) {
                    minimumNumber = numbers[i];
                }
            }

            for (int i = min; i <= max; i++) {
                if (maximumNumber < numbers[i]) {
                    maximumNumber = numbers[i];
                }
            }

            for (int i = min; i <= max; i++) {
                sum += numbers[i];
                count++;
            }

            double average = (double) sum / count;
            //System.out.format("%.1f", average);
            double[] result = {minimumNumber, maximumNumber, average};

            return result;
        }

        return new double[]{};
    }

        public static int peakElementAlgorithm(int[]get, int n){

        if(n == 1){
            return get[0];  //return the element if there's only one element in the array
       }
        if(get[0] >= get[1]){
           return get[0];
       }
        if (get[n - 1] >= get[n - 2]){
            return get[n - 1];
        }
        // find the peak in the remaining array elements
        for(int i = 1; i < n - 1; i++){
            if (get[i] >= get[i - 1] && get[i] >= get[i + 1]){  //comparing current element with neighbours
               return get[i];

           }
        }
       return 0;

        }

        public static int[] reverseArray(int[]arr, int n){

        int [] arr2 = new int[n];
        int j = n;
        for(int i = 0; i < n; i++){
            arr2[j - 1] = arr[i];
            j = j - 1;

        }
         return arr2;
        }

        public static int[] sortArray(int[]arr) {
            int[] arr3 = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {

                Arrays.sort(arr);
                arr3[i] = arr[i];
            }
            return arr3;
        }
        public static int[] sortArrayAlgorithm(int[] arrNow) {
        int[] arr3 = new int[arrNow.length];
        for (int i = 0; i < arrNow.length; i++) {
            Arrays.sort(arrNow);
            arr3[i] = arrNow[i];
        }
        return arr3;
    }

    public static void main(String[] args) {

        Task();

        System.out.println(intObject.equals(HW8_1.intObject1));
        System.out.println(doubObject.equals(HW8_1.doubObject1));
        System.out.println(strObject.equals(HW8_1.strObject1));


        line();
        System.out.println("HW8            |" + " HW8_1          |" + " Are equals?    |");
        line();
        System.out.println("Double d = " + doubObject + "|" + " Double d1 = "
                + HW8_1.doubObject1 + "|" + doubObject.equals(HW8_1.doubObject1) + "           |");
        line();

        Task();
        /**
         * Написать метод, который принимает на вход 5 целых чисел, и возвращает массив из этих же чисел
         */

        int num0 = 22;
        int num1 = 33;
        int num2 = 86;
        int num3 = 55;
        int num4 = 99;
        //System.out.println(Arrays.toString(getMassive(22,33,44,55,66)));
        System.out.println(Arrays.toString(getMassive1(22, 33, 34, 55, 89)));

        printArray(getMassive(num0, num1, num2, num3, num4)); //2-nd way

        System.out.println("\t");
        line();

        int[] array = new int[]{15, 28, -5, 49, 55, 63, 74, 48};
        printArray(array);
        System.out.println("\t");

        Task();
        /**
         * Написать метод, который принимает на вход 5 чисел типа double,
         * и возвращает массив из этих же чисел
         */
        double a = 1.2;
        double s = 1.3;
        double d = 1.4;
        double f = 1.5;
        double g = 1.6;
        double q = 2.5;

        System.out.println(Arrays.toString(getMassive2(2.3, 4.5, 6.7, 7.8, 9.9)));
        printArray(getMassive2(1.2, 3.4, 5.6, 7.8, 9.9)); //2-nd way
        System.out.println("\t");

        Task();
        /**
         * Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
         */
        String[] cat = new String[]{"Bob", "Jac", "Tom", "Lis", "Nick"};
        printArray(cat);

        System.out.println("\t");

        Task();
        /**
         * Написать метод, который принимает на вход массив целых чисел,
         * и возвращает массив тех же чисел, умноженных на 2.5
         */
        printArray(getMassiveDouble(getMassive1(5, 6, 7, 8, 9)));

        System.out.println("\t");
        Task();

        /**
         * Написать метод, который принимает на вход массив целых положительных чисел,
         * и возвращает количество четных чисел в этом массиве
         */


        printArray(getArrayEven(getMassive1(35, 64, 12, 34, 67)));

        System.out.println("\t");
        Task();
        /**
         * Написать метод, который принимает на вход массив целых положительных чисел,
         * и возвращает массив нечетных чисел
         */
        printArray(getArrayOdd(getMassive1(35, 64, 12, 34, 67)));
        //printArray(getArrayOdd1(getMassive1(35, 64, 12, 34, 67)));

        System.out.println("\t");
        Task();
        /**
         * Написать метод, который принимает на вход массив целых чисел,
         * и возвращает массив значений true или false, если числа больше 10
         */

        int[] arrayNew = getMassive1(3, 56, 7, 90, 12);
        System.out.println(Arrays.toString(getBooleanMassive(arrayNew)));

        System.out.println("\t");
        Task();
        /**
         * Написать метод, который принимает на вход массив слов,  и возвращает строку, состоящую из этих слов
         */

        System.out.println(createSentence(cat));

        System.out.println("\t");
        Task();
        /**
         * Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива
         */
        int[] arraySum = {40, 50, 50, 70, 80};
        System.out.println(getSumMassive(arraySum));

        Task();
        /**
         * Написать метод, который принимает на вход целое положительные число в пределах от 1 до 10 исключительно,
         * и возвращает таблицу умножения на это число в виде массива
         * Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
         */

        int multi = 2;
        printArray(getMassiveMulti(multi));

        System.out.println("\t");
        Task();
        /**
         * Написать метод, который принимает массив целых чисел и возвращает массив четных чисел,
         * если четных чисел больше, или массив нечетных чисел, если нечетных чисел больше.
         */

        Task();
        /**
         * Написать метод, который принимает на вход длину массива и
         * генерирует массив случайных положительных чисел от 0 до 100 исключительно.
         */

        System.out.println(Arrays.toString(generationArray(10, 1, 99)));

        Task();
        /**
         * Написать метод, который принимает на вход длину массива l и количество знаков d
         * (однозначные, двузначные, трехзначные и тд числа), и генерирует массив случайных
         * целых положительных чисел длины l, в котором все числа имеют количество знаков d
         */
        System.out.println(Arrays.toString(getArrayLD(4, 2)));
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(Arrays.toString(task19(6,4)));



        Task();
        /**
         * Написать метод, который принимает на вход массив целых положительных чисел,
         * и возвращает массив только двузначных чисел. ПРоверить работу метода на массиве из задания 18.
         */

        System.out.println(Arrays.toString(task20(array)));

        Task();
        System.out.println(Arrays.toString(tensOnesArray(array)));

        Task();
        int[] array6 = {1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(getPhoneNumber(array6)));

        Task();
        int[] uni = {10,5,2,4,5,10,1,5,10};
        System.out.println(Arrays.toString(getUnikalMassive(uni)));

        //Checking

        System.out.println("+++++++++++++++++++++++++++");
        int[] arr1 = {-45, 654, 38, 76, 77, 98};
        System.out.println(Arrays.toString(oddIndicesAlgorithm(arr1)));

        System.out.println("+++++++++++++++++++++++++++");
        int[] get = new int[]{-45, 590, 234, 985, 12, 68};
        System.out.println(Arrays.toString(getRandomFromMines(get)));

        System.out.println("+++++++++++++++++++++++++++");
        int[] get4 = new int[]{1, 2, 3, 4, 5};
        System.out.println(sumArray(get4));

        System.out.println("+++++++++++++++++++++++++++");
        int numA = 3333;
        int numB = 9999;
        System.out.println(biggerValue(numA, numB));

        System.out.println("+++++++++++++++++++++++++++");
        int argument = 555;
        int argument1 = 0;
        int argument2 = -555;

        System.out.println(getBool(argument));
        System.out.println(getBool(argument1));
        System.out.println(getBool(argument2));

        System.out.println("+++++++++++++++++++++++++++");
        int ff = 89;
        int gg = 89;

        System.out.println(areNumbersEqual(ff, gg));
        ff = -89;
        gg = 89;

        System.out.println(areNumbersEqual(ff, gg));
        ff = 89;
        gg = -89;

        System.out.println(areNumbersEqual(ff, gg));

        System.out.println("+++++++++++++++++++++++++++");
        Integer M = 30;
        System.out.println(integM(M));

        System.out.println("+++++++++++++++++++++++++++");
       int[] get5 = {1,2,3,4,5,6,7,8};
       int min = 2;
       int max = 6;

        System.out.println(Arrays.toString(minMaxAveAlgorithm(get5,min,max)));

        System.out.println("+++++++++++++++++++++++++++");
        int[] get6 = {3,2,7,5,1,9,23,1};
        int n = 7;
        System.out.println(peakElementAlgorithm(get6, n));

        System.out.println("+++++++++++++++++++++++++++");
        int[] arr22 = {2, 7, 3, 10};
        n = 4;
        System.out.println(Arrays.toString(reverseArray(arr22,n)));


        System.out.println("+++++++++++++++++++++++++++");
        int[] intArray = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        //int m = 9;

        Arrays.sort(intArray);

        System.out.printf(Arrays.toString(intArray));
        //System.out.printf("\n\nSorted Array : %s", Arrays.toString(intArray));

        System.out.println("\t");

        System.out.println(Arrays.toString(sortArray(intArray)));
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(Arrays.toString(sortArrayAlgorithm(intArray)));

    }
}



