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
         * ?????????????? ???????????? catsNames, ?????????????????? ?????? ???????????? ???????????????????? (???? ???????????????? ?????????? ???? ??????????????????????).
         */
        String[] catsNames;
        catsNames = new String[8];
        catsNames[0] = "????????????";
        catsNames[1] = "????????????";
        catsNames[2] = "????????";
        catsNames[3] = "??????????";
        catsNames[4] = "????????????";
        catsNames[5] = "????????????";
        catsNames[6] = "????????";
        catsNames[7] = "????????";

        System.out.println(catsNames[4]);
        System.out.println("++++++++++++++++++++++++++++++++++");


        Task();
        /**
         * ?? ?????????????? catsNames ???????????????? ???????????????? ???????????????? ?? ???????????????? 4 ???? ????????????????,
         * ?? ???????????????? ???????????????? ?? ???????????????? 1 ???? ??????????????????.
         */
        catsNames[4] = "??????????";
        catsNames[1] = "????????????";
        System.out.println(catsNames[4]);
        System.out.println(catsNames[1]);

        Task();
        /**
         * ?????????????? ???????????? catsColors ?? ?????????????????? ?????? ????????????????????.
         */
        String[] catsColors;
        catsColors = new String[8];
        catsColors[0] = "??????????";
        catsColors[1] = "????????????";
        catsColors[2] = "??????????????????";
        catsColors[3] = "?????????? ??????????";
        catsColors[4] = "??????????";
        catsColors[5] = "??????????";
        catsColors[6] = "??????????";
        catsColors[7] = "??????????";

        System.out.println(catsColors[5]);

        Task();
        /**
         * ?????????????? ???????????? catsAges ?? ?????????????????? ?????? ???????????? ????????????????????.
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
         * ?????????????? ???????????? isCatRed ?? ?????????????????? ?????? ???????????????????????????????? ????????????????????
         */
        String[] isCatRed = new String[2];
        isCatRed[0] = "??????????";
        isCatRed[1] = "??????????";

        System.out.println(isCatRed[0] + "\t" + isCatRed[1]);

        Task();
        /**
         * ?????????????????????? ?????? ???????????????? catsNames ?? catsColors:
         * ?????? ???????? ?? ?????????????? ?? ?????????????? 6
         * ?????????? ?????????? ???? ?????????????? ?? ?????????????? ??????????????????
         * ?????????? ?????????? ???? ??????????????, ?????? ?????????????? ???????????? 4
         * ???????? ?????????? ???? ?????????????? ?? ?????????????????? ??????????????????
         * ???????? ?????????? ???? ??????????????, ?????? ?????????????? ???????????? 3
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
         * ?????????????????????? ????????????????? ????????!??? ?????? ???????? ?????????? ??????????
         */
        for (int i = 0; i <= 7; i++) {
            if (catsColors[i] == "??????????") {
                System.out.println("?????????????? ????????!");
            }
        }
        Task();
        /**
         * ?????????????????????? ??????????????? ???????? ???? ????????????????!???, ???????? ?????????????? ???????? ???????????? 2 ??????
         */
        for (int i = 0; i < 8; i++) {
            if (catsAges[i] <= 2) {
                System.out.println("???????????? ???????? ???? ????????????????!");
            }
        }
        Task();
        /**
         * ?????? ???????? ?? ?????????????????? ?????????????? ?????????????????????? ??????, ????????, ??????????????
         */
        System.out.println(catsNames[7] + " " + catsColors[7] + " color " + catsAges[7] + " years old");

        Task();
        /**
         * ?????????????????????? ?????????? ???????? ??????????, ?????? ?????????????? ???????????? 2 ??????
         */
        for (int i = 0; i < 8; i++) {
            if (catsAges[i] > 2) {
                System.out.println(catsNames[i]);
            }
        }
        Task();
        /**
         * ?????????????????????? ????????????????? ????????!??? ???????? ?????? ???????? ???????????????? ?? ???????????????? isCatRed == true
         */
        for (int i = 0; i < 8; i++) {
            if (catsNames[i] == "??????????") {
                System.out.println("?????????????? ????????!");
            }
        }

        Task();
        /**
         * ?????????????????????? ?????????????? ?????????????? ?????????? ???? ?????????????? catsAges
         */
        int sumAges = catsAges[0] + catsAges[1] + catsAges[2] + catsAges[3] + catsAges[4] + catsAges[5] + catsAges[6]
                + catsAges[7];
        System.out.println("Average age of cats = " + (sumAges / catsAges.length));

        Task();
        /**
         * ?????????????????????? ?????????????? ???????????? ???????????????? ????????
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
         * ?????????????????????? ?????????????? ???????????? ?????????????? ????????
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
         * ?????????????????????? ???????????????????? ?????????? ??????????
         */

        int c = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("??????????")) {
                c++;
            }
        }
        System.out.println("???????????????????? ?????????? ?????????? = " + c);

        Task();
        /**
         *?????????????????????? ?????? ????????, ???????? ?????? ?????????????????? ?? ?????????????? ?? ???????????? ???????????????? ?? ?????? ?????????????? ???? ???????????? 3 ??????
         */

        for (int i = 0; i < 8; i += 2) {
            if (catsAges[i] < 3) {
                System.out.println(catsNames[i]);
            }
        }

        Task();
        /**
         * ?????????????? ???????????? ???????????? ?????????????????????????? ??????????,
         * ???????????????? ?????????????? ???? ???????????? 10. (?????????????????? ???????????????? ?? ?????????????? ?????????? for)
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
         * ???????????????? ??????????, ?????????????? ?????????????????? ???? ???????? ???????????? int, ?? ???????????????????? ?????????????? ????????????????.
         * ?????????????????? ???????????? ???????????? ????????????, ???????? ???????????????? - ???????????? catsAges
         */
        System.out.println(Age(catsAges));

        Task();
        /**
         * ?????????????? ???????????? ???????????????? ?????????????????????????? ?????????? ?? ???????????????????? ???? -1000 ???? -900
         */
        System.out.println(getRandomFromMines(-1000, -900));


        Task();
        /**
         * ?????????????? ???????????? ???? 10 ?????????????????? ?????????????????????????? ?????????? ??????????
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
         *?????????????? ??????????, ?????????????? ?????????????????? ???? ???????? ???????????? int,?? ???????????????????? ?????????????????????? ????????????????,
         *  ???????????????????????? ???????????????? ?? ?????????????? ???????????????? ???????? ?????????? ??????????????.
         *  ?????????????????? ???????????? ???????????? ???? ?????????????? ???? ?????????????? 20.
         */
        threeNums(randomNum);

        Task();
        /**
         * ?????????????? ???????????? ???????????? ?????????? ?? ???????????? ???????????????? ?????????? ???? ?????????????????? ?????????????? ???? ?????????????? 20.
         */
        System.out.println(Arrays.deepToString(Freedom(randomNum)));

        Task();
        /**
         * ?????????????? ?????????????????? ????????????, ?????????????? ?????????????? ???? ????????, ??????????????????, ???????????? ??????????:
         * ?????????????????????? ?????? ???????????? ?????????? ?? ???????????????? ?? ?????????????? ??????????????????, ?????????????????? ?????????????????? ????????????.
         */

        String[][] cats = new String[][]{{"????????????", "????????????", "????????????", "??????????", "????????????", "??????", "??????", "??????"},
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
         * ?????????????? ?????????????????? ???????????? ?????????? ?????????????????? ?????????? ???? 1 ???? 10 ?????????????????????? 4*8.
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
         * ?????????????? ?????????? ???????? ???????????? ?????????? ?????????????? ???? ?????????????? 24.
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
