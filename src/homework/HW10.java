package homework;

import homework.utils.Utils;

import java.util.Arrays;
import java.util.Locale;

public class HW10 {


    /**
     * task#1
     * Написать метод, который принимает на вход строку.
     * Если строка не пустая (проверить методом из видео), то примените метод по удалению пробелов в начале строки и в конце строки.
     * Догадаться, каким методом из видео можно проверить, были ли пробелы.
     * Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
     * Если пробелов не было, вернуть сообщение “Пробелов не было”.
     * Если строка пустая, вернуть сообщение “Строка пустая”.
     */

    public static String words(String sentenceA) {
        String sentenceB = sentenceA.trim();
        if (sentenceA.isEmpty()) {

        } else if (sentenceB.length() != sentenceA.length()) {
            return "Лишние пробелы удалены.";
        } else if (sentenceA.length() == sentenceB.length()) {
            return "Пробелов не было.";
        }
        return "Строка пустая.";
    }

    /**
     * task#2 Написать алгоритм RemoveAlla.
     * написать алгоритм, который принимает на вход строку.
     * Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
     * Test Data:
     * “    QA4Everyone   “ →  “QA4Everyone“
     * “panda   “ → “pnd”
     */

    public static String removeAlla(String sentence) {

        if (sentence.isEmpty()) {
            return "";
        } else {
            sentence = sentence.trim();
            sentence = sentence.replace("a", "");
            return sentence;
        }
    }

    /**
     * task#3. Написать алгоритм RemoveAllZeros.
     * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
     * Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
     * Метод возвращает обработанную строку, в которой нет нулей.
     * Test Data:
     * “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
     * “ 0000000111“ → “111”
     */

    public static String removeAllZeros(String sentence) {
        if (sentence.isEmpty()) {
            return "";
        } else {
            sentence = sentence.trim();
            sentence = sentence.replace("0", "");
            sentence = sentence.replace(" ", "");
            return sentence;
        }
    }

    /**
     * task#4. Написать алгоритм RemoveAllSpaces.
     * написать алгоритм, который принимает на вход строку.
     * Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
     * Test Data:
     * “    QA   4  Everyone   “ →  “QA4Everyone“
     * “p a     n d a   “ → “panda”
     */
    public static String removeAllSpaces(String sentence) {
        if (sentence.isEmpty()) {
            return "";
        } else {
            sentence = sentence.trim();
            sentence = sentence.replace(" ", "");
        }
        return sentence;
    }

    /**
     * task#5. Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
     * Test Data:
     * “Abracadabra” → 5
     * “Homenum Revelio” → 0
     */

    public static int Metod(String sentence) {
        int result = 0;
        sentence = sentence.toLowerCase();
        if (sentence != null) {
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == 'a') {
                    result++;
                }
            }
            return result;
        }
        return 0;
    }


    /**
     * task#6. Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java.
     */
    public static boolean text(String sentences) {
        boolean sentencesNew;
        sentencesNew = sentences.contains("Java");
        return sentencesNew;
    }

    /**
     * task#7. Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки,
     * точку и кавычки в конце строки с помощью метода concat()
     * Test Data:
     * “One” → ““One.””
     * “    TWO  “ → ““TWO.””
     */

    public static String quotes(String sentence) {
        String mark1 = "\"";
        String mark2 = ".";
        String mark3 = "\"";

        sentence = mark1.concat(sentence);
        sentence = sentence.concat(mark2);
        sentence = sentence.concat(mark3);
        sentence = sentence.replace(" ", "");
        return sentence;
    }

    /**
     * task#8.Напишите метод, кторый принимает на вход название города и исправляет написание:
     * Test Data:
     * “ташкент” → “Ташкент”
     * “ЧикаГО” → “Чикаго”
     */

    public static String cities(String word) {

        String word4 = word.substring(1).toLowerCase();
        String word5 = word.substring(0, 1).toUpperCase();
        String wordSum = word5.concat(word4);
        return wordSum;
    }

    /**
     * task#9. Напишите метод, который принимает на вход строку, и возвращает все,
     * что находится между первой и последней буквой-параметром:
     * Test Data:
     * “Abracadabra”, “b” → “bracadab”
     * “Whippersnapper”, “p” → “ppersnapp”
     */

    public static String letters(String word, String letter) {
        if (!word.isEmpty()) {

            return word.substring(word.indexOf(letter), word.lastIndexOf(letter) + 1);
        }
        return "String is empty";
    }

    /**
     * task#10. Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается и
     * заканчивается на одинаковую букву, и faulse иначе
     * Test Data:
     * “Abracadabra” → true
     * “Whippersnapper” → false
     */
    public static Boolean boo(String word) {
        if (!word.isEmpty()) {
            String wordNew = word.toLowerCase();
            String wordNew1 = wordNew.substring(0, 1);
            String wordNew2 = wordNew.substring(wordNew.length() - 1);
            if (wordNew.substring(0, 1).equals(wordNew.substring(wordNew.length() - 1))) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    //2-й способ.
    public static Boolean boo1(String word) {
        if (!word.isEmpty()) {
            return word.toLowerCase().charAt(0) == word.toLowerCase().charAt(word.length() - 1);
        }
        return false;
    }

    /**
     * task#11. Напишите метод, который принимает на вход предложение и
     * возвращает слова из этого предложения в виде массива слов
     * Test Data:
     * “QA for Everyone” → {“QA”, “for”, “Everyone”}
     * “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
     */
    public static String[] massive(String sentence) {

        String[] arrayWords = sentence.split(" ");
        for (int i = 0; i < arrayWords.length; i++) {

            arrayWords[i].equals(sentence);
        }
        return arrayWords;
    }

    /**
     * task#12. Написать метод, который принимает на вход предложение, которое состоит из
     * имени, фамилии, отчества и возвращает массив строк:
     * Test Data:
     * “Александр Сергеевич Пушкин” →
     * {“Имя: Александр”, “Отчество: Сергеевич”, “Фамилия: Пушкин”}
     */
    //public static String[] massive1(String sentence) {

//        String name = "Имя:";
//        String name1 = "Отчество:";
//        String name2 = "Фамилия:";
//
//        String[] arrayWords = new String[]{}; //sentence.split(" ");
//        for (int i = 0; i < sentence.length(); i++) {
//            if(sentence.charAt(i) == ' '){
//                sentence = name.concat(sentence.substring(0, i+1)) + name1.concat(sentence.substring(i, i + 1))
//                        + name2.concat(sentence.substring(i, i + 1));
//            }
//
//            arrayWords.equals(sentence);
//        }
//        return arrayWords;
//    }

    /**
     * task#13.Написать метод, который возвращает сумму всех букв слова
     * <p>
     * “abc” → 294
     * “ABC” → 198
     * “123” → 0 (это не буквы)
     */
    public static int sum(String abc) {
        int count = 0;
        char[] charArray = abc.toCharArray();
        for (int i = 0; i < abc.length(); i++) {
            if (Character.valueOf(charArray[i]) >= 65) {
                count += charArray[i];
            } else {
                return 0;
            }
        }
        return count;
    }

    /**
     * task#14.Написать метод,  который принимает на вход 2 буквы и возвращает true, если первая буква
     * встречается раньше второй, иначе метод возвращает false
     * method(“a”, “m”) → true
     * method(“m”, “l”) → false
     */

    public static boolean getTrue(char litA, char litM){

       if((int)litA < (int)litM){
           return true;
        }else{
           return false;
       }
    }

    /**
     * task#15. Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
     * Test Data:
     * “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
     * (Без форматирования)
     */

//    public static int[] stringToNumbers(String sentence){
//        int q = (int)sentence;
//    }




    public static void main(String[] args) {

        //task#1
        Utils.Tasks();

        String sentence = "    QA4Everyone   ";
        String sentence1 = "Пробелов не было";
        String sentence2 = "";
        System.out.println(words(sentence));
        System.out.println(words(sentence1));
        System.out.println(words(sentence2));

        //task#2
        Utils.Tasks();

        String sentence3 = "    QA4Everyone   ";
        String sentence4 = "panda   ";

        System.out.println(removeAlla(sentence3));
        System.out.println(removeAlla(sentence4));

        //task#3
        Utils.Tasks();

        String sentence5 = "   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 ";
        String sentence6 = "0000000111";
        System.out.println(removeAllZeros(sentence5));
        System.out.println(removeAllZeros(sentence6));

        //task#4
        Utils.Tasks();

        String sentence7 = "     QA   4  Everyone  ";
        String sentence8 = "p a     n d a   ";

        System.out.println(removeAllSpaces(sentence7));
        System.out.println(removeAllSpaces(sentence8));

        //task#5
        Utils.Tasks();

        String sentence9 = "Abracadabra";
        System.out.println(Metod(sentence9));

        String sentence91 = "Homenum Revelio";
        System.out.println(Metod(sentence91));


        //task#6
        Utils.Tasks();
        String sentences = "As of March 2022, Java 18 is the latest version, while Java 17, " +
                "11 and 8 are the current long-term support (LTS) versions. " +
                "Oracle released the last zero-cost public update for the legacy version Java 8 LTS " +
                "in January 2019 for commercial use, although it will otherwise still support Java 8 " +
                "with public updates for personal use indefinitely. Other vendors have begun " +
                "to offer zero-cost builds of " +
                "OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        System.out.println(text(sentences));

        String sentences1 = "As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me.";
        System.out.println(text(sentences1));

        //task#7
        Utils.Tasks();

        String sentence10 = "One";
        System.out.println(quotes(sentence10));

        String sentence11 = "    TWO  ";
        System.out.println(quotes(sentence11));

        //task#8
        Utils.Tasks();
        String word = "ташкент";
        String word1 = "ЧикаГО";

        System.out.println(cities(word));
        System.out.println(cities(word1));

        //task#9
        Utils.Tasks();
        String word2 = "Abracadabra";
        String lit = "b";
        String word3 = "Whippersnapper";
        String lit1 = "p";
        System.out.println(letters(word2, lit));
        System.out.println(letters(word3, lit1));

        //task#10
        Utils.Tasks();
        String word4 = "Abracadabra";
        System.out.println(boo(word4));

        String word5 = "Whippersnapper";
        System.out.println(boo(word5));

        //2 way
        System.out.println(boo1(word4));
        System.out.println(boo1(word5));

        //task#11
        Utils.Tasks();
        String sentence12 = "QA for Everyone";
        System.out.println(Arrays.toString(massive(sentence12)));

        String sentence13 = "Александр Сергеевич Пушкин";
        System.out.println(Arrays.toString(massive(sentence13)));

        //task#12
        Utils.Tasks();
        //String sentence14 = "Александр Сергеевич Пушкин";
        //System.out.println(Arrays.toString(massive1(sentence14)));

        String name = "Имя:";
        String name1 = "Отчество:";
        String name2 = "Фамилия:";

        String arrayWords = "Александр Сергеевич Пушкин";

        String[] arr = arrayWords.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(name.concat(arr[0] + ", " + name1.concat(arr[1] + ", "
                    + name2.concat(arr[2]))));
        }

        //task#13
        Utils.Tasks();
        String abc = "abc";
        String ABC = "ABC";
        String num = "123";
        System.out.println(sum(abc));
        System.out.println(sum(ABC));
        System.out.println(sum(num));

        //task#14
        Utils.Tasks();
        char litA = 'a';
        char litM = 'm';
        System.out.println("method(“a”, “m”) is " + getTrue(litA,litM));
        char litA1 = 'm';
        char litM1 = 'l';
        System.out.println("method(“m”, “l”) is " + getTrue(litA1,litM1));

        //task#15
        Utils.Tasks();
        //“1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
        String sen = "1, 2, 3, 4, 5";

        String[] arrS = new String [sen.length()];
        for( int i = 0; i < sen.length(); i++){
            arrS[i] = Character.toString(sen.charAt(i));
            System.out.println(Arrays.toString(arrS));
        }
       // System.out.println(sen.toCharArray());








    }
}



