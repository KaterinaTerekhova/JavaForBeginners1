package homework;

public class HW6 {

    static int a = 1;

    public static void Task() {

        System.out.println("******************** " + "Task # " + a + " ********************");
        a++;
    }

    public static void numN(int start, int end, int step) {
        for (int i = start; i <= end; i += step) {
            System.out.println(i + " ");
        }
    }
    public static void printTwoDegree(int n){
        for(int i = 1; i <= n; i ++){
            System.out.println((int)Math.pow(2, i) +" ");
        }
    }

    public static String thirteen() {
        String result1 = "";
        String result2 = "";
        String result3 = "";
        String result4 = "";
        for (int i = 0; i < 10; i++) {
            result1 = result1 + i;
            result2 = result2 + i + i;
            result3 = result3 + i + i + i;
            result4 = result4 + i + i + i + i;
        }
        return result1 + result2 + result3 + result4;
    }
    public static void fourteen() {
        int d = 0;
        System.out.println(d + ", ");
        for (int t = 1; t <= 5; t++) {
            System.out.println(t + ", ");
            System.out.println(t * -1 + ", ");
        }
    }
    public static void prontOddNumber(int n, int m, int l){
        for(int i = n; i <= l; i += m){
            if(i % 2 == 1){
                System.out.println(i + ", ");
            }
        }
    }
    //Сгенерируйте и распечатайте последовательность по формуле: n + 1 = n + 2

    public static void printFormula(){
        int n = 8;
        int l = n + 5;
        for (; n < l; n ++){
            System.out.println("[" + (n + 1) + "]"  + " = " + (n + 2));
        }

    }

    /**
     * Написать метод, который принимает параметры l, n, и печатает последовательность чисел,
     * начиная с числа n, по формуле для n + 1 члена последовательности:
     *     n + 1 = 2n
     *     Длина последовательности l  .
     */
    public static void eighteen(){
        int n = 1;
        int l = n + 6;
        for(; n < l; n ++){
            System.out.println("[" + (n + 1) + "]" + " = " + (2 * n));
        }
    }
    public static void nineteen(){
        for(int i = 1; i <= 9; i ++){  //десятки
            for(int j = 0; j <= 9; j ++){  //единицы
                if (Math.abs(i - j) <= 3){
                    System.out.printf("%d ", i * 10 + j);
                }
            }
        }
    }













    public static void main(String[]args) {
        Task();
        /**
         * Распечатать последовательность чисел от 0 до 9 включительно.
         */

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        Task();
        /**
         * Распечатать последовательность чисел от 10 исключительно до 0 включительно.
         */

        for(int i = 9; i > -1; i --){
            System.out.println(i);
        }

        Task();
        /**
         * Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
         */

        for(int i = 50; i < 56; i += 2){
            System.out.println(i);
        }
        Task();
        /**
         * Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
         */
        for(int i = 300; i < 327; i += 7) {
            System.out.println(i);
        }

        Task();
        /**
         * Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
         */
        for(double i = 12; i <= 13; i += 0.1){

            System.out.println(String.format("%.2f", i));
        }

        Task();
        /**
         *Распечатать последовательность четных чисел от 215 до 237 включительно
         */
        for(int i = 216; i < 238; i +=2){
            System.out.println(i);
        }
        Task();
        /**
         * Распечатать последовательность чисел, кратных 7,
         * в промежутке от 7 исключительно до 14 исключительно.
         */
        for(int i = 7; i < 14; i ++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        Task();
        /**
         * Распечатать последовательность которая начинается с минимального значения типа данных short и
         * заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.
         */
        for(int i = -32768; i < 32768;  i += 15001){
            System.out.println(i);
        }

        //Short min = Short.MIN_VALUE;
        //Short max = Short.MAX_VALUE;

        //for(int i = min; i <= max; i ++) {
            //if (i % 15001 == 0) {
           // }
           // System.out.println(i);
        //}
        Task();
        /**
         * Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
         * Числа, кратные 11, должны быть распечатаны синим цветом.
         * Числа, кратные 12, должны быть распечатаны красным цветом. А ноль необходимо распечатать словом ZERO.
         */
        for(int i = -10; i < 35; i ++){
            if(i % 11 == 0){
                System.out.println("\u001B[34m" + i + "\u001B[0m");
            }else if(i % 12 == 0){
                System.out.println("\u001B[31m" + i + "\u001B[0m");
            }else if(i == 0) {
                System.out.println("ZERO");
            }
        }
        Task();
        /**
         * Написать метод, который принимает на вход параметры start,  end, step, и печатает
         * последовательность десятичных  чисел, начиная с числа start, с шагом step.
         * Точка выхода из цикла - число end.
         */
        for(double i = 0.1; i < 1.01; i += 0.1){
            System.out.println(i);
        }

               Task();
        /**
         * Написать метод, который принимает параметр l и
         * печатает  последовательность четных чисел от нуля. Длина последовательности = l.
         */
        System.out.println("done");

        Task();
        /**
         * Напишите метод, который принимает целое число n,
         * и выводит все степени числа 2 от 1 до n включительно
         */
        printTwoDegree(6);

        Task();
        /**
         * Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
         */
        //for(int i = 111; i <= 999; i += 111) {
          //  System.out.println(i);
        //}
        //for (int x = 0000; x <= 9999; x += 1111) {
          //  System.out.println(x);
        //}

        thirteen();

        for(int i = 0; i <= 9; i ++){
            System.out.println(i);
        }
        for (int i = 0; i <= 99; i += 11){
            if (i == 0) {
                System.out.println(i + "0");
            } else {
                System.out.println(i);
            }
        }
        for(int i= 0; i <= 999; i += 111){
            if (i == 0) {
                System.out.println(i + "00");
            } else {
                System.out.println(i);
            }
        }
        for(int i = 0; i <= 9999; i += 1111){
            if (i == 0) {
                System.out.println(i + "0000");
            }else {
                System.out.println(i);
            }
        }


        Task();
        /**
         * Распечатайте последовательность чисел:
         * 0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
         */
        fourteen();



        Task();
        /**
         * Распечатать последовательность чисел:
         * 0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
         */
        for(int i = 0; i <= 25; i ++) {
            if (i == 0) {
                System.out.println(i + ", ");
            } else if (i % 3 == 0) {
                System.out.println(i + ", ");
            } else if (i % 5 == 0) {
                System.out.println(i + ", ");
            }
        }
        Task();
        /**
         *Написать метод, который принимает параметры n, m, l, и печатает
         * последовательность нечетных чисел начиная с числа n, с шагом m, длина последовательности l
         */
        prontOddNumber(4, 1, 12);

        Task();
        /**
         *Сгенерируйте и распечатайте последовательность по формуле:
         * n + 1 = n + 2
         */
        printFormula();

        Task();
        eighteen();

        Task();
        /**
         * Сгенерируйте последовательность целых положительных  двузначных чисел,
         * в которых разница между первой цифрой (десятки) и второй цифрой (единицы) не превышает 3.
         */
        nineteen();












        }
























}





