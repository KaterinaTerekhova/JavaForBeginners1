package homework;

public class HW4 {


    public static int number = 3;
    public static int divisionOfNumber;
    public static int remainderOfNumber;
    public static int numOfApples;
    public static int numOfStudents;


    public static String Task() {

        String task = "Task #";
        System.out.println("************ " + task + number + " *******************");
        number++;
        return task;
    }

    public static void resultNumbers(int a, int b) {

        int divisionOfNumber = a / b;
        int remainderOfNumber = a % b;

        System.out.println("Результат деления " + a + " на " + b + " = " + divisionOfNumber
                + " , а остаток от деления  =  " + remainderOfNumber + "\"");
    }

    public static void appleForStudent(int apple, int student) {
        int part = apple / student;
        int saldo = apple % student;
        //Если … яблок(а) поделить на … учеников,
        //то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.

        System.out.println("Если " + apple + " яблок(а) поделить на " + student
                + " учеников, то каждый ученик получит по " + part
                + " яблок(a), и " + saldo + " яблок(а) останется учителю.");

    }

    public static String partialApp(int appleCount) {
        int appleLastNum = appleCount % 10; // Находим на какое число заканчивается наше число
        String apples = ""; //Пуста строка
        boolean appleExc = (appleCount % 100 >= 11) && (appleCount % 100 <= 14); //Переменна для исключений между 11 и 14

        if (appleLastNum == 1) {
            apples = "яблоко";
        } else if (appleLastNum == 0 || appleLastNum >= 5) {
            apples = "яблок";
        } else if (appleLastNum >= 2) {
            apples = "яблока";
        }
        if (appleExc) {
            apples = "яблок";
        }
        return apples;
    }

    public static String studentWithApple(int studentCount) {
        int studentLastNum = studentCount % 10;
        boolean studentExc = (studentCount % 100 >= 11) && (studentCount % 100 <= 14);
        String students = "";
        if (studentLastNum == 1) {
            students = "ученика";
        } else if (studentLastNum == 0 || studentLastNum >= 5) {
            students = "учеников";
        } else if (studentLastNum >= 2) {
            students = "ученика";
        }
        if (studentExc) {
            students = "учеников";
        }
        return students;
    }

    public static void countApples(int numOfApples, int numOfStudents) {
        System.out.println("Если " + numOfApples + " " + partialApp(numOfApples) + " поделить на "
                + numOfStudents + " " + studentWithApple(numOfStudents)
                + ", то каждый ученик получит " + (numOfApples / numOfStudents) + " "
                + partialApp(numOfApples / numOfStudents) + ", и " + (numOfApples % numOfStudents)
                + " " + partialApp(numOfApples % numOfStudents) + " останется учителю.");
    }

    public static void temperature(double t) {

        System.out.println("Temperature in Celcius = " + t + " so in Fahrenheit = " + ((t * 9 / 5) + 32));

    }

    public static void even(int num) {
        if ((num % 2) == 0) {
            System.out.println("number = " + num * 2);
        } else {
            System.out.println("number = " + num * num);
        }
    }

    public static String correctOfTask(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("Pass");
            return "Pass";
        } else {
            System.out.println("Fall");
        }
        return "Fall";
    }

    // Голосовать можно с 18 лет
    // Машину можно водить с 16 лет
    // В школу можно идти с 5 лет

    public static String allowance(int ageA) {
        boolean agePreschool = ageA >= 5;
        boolean ageDrive = ageA >= 16;
        boolean ageVote = ageA >= 18;

        String youCan = "";

        if (agePreschool) {
            youCan = youCan + "В школу можно идти с 5 лет ";
        }
        if (ageDrive) {
            youCan = youCan + "Машину можно водить с 16 лет";
        }
        if (ageVote) {
            youCan = youCan + "Голосовать можно с 18 лет";
        }
        if (ageA < 5) {
            youCan = "Ты слишком мал";
        }
        return "Вам:" + ageA + " " + youCan;
    }


    public static void main(String[] args) {

        Task();

        /**
         *  Записать в виде кода следующие логические выражения:

         */
        // * 1) (2 = 2) И (7 = 7);

        if (2 == 2) {
            if (7 == 7) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            // System.out.println(2 == 2 & 7 == 7);

            //* 2) Не(15 < 3);

            if (!(15 < 3)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            //("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
            String tree = "Сосна";
            String tree1 = "Дуб";
            String tree2 = "Вишня";
            String tree3 = "Клен";
            if (tree == tree1) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            if (tree2 == tree3) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            //* 4) Не("Сосна" = "Дуб");
            if (!(tree == tree1)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            // * 5) (Не(15 < 3)) И (10 > 20);
            if (!(15 < 3)) {
                if (10 > 20) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            }
            // * 6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");

            String eyes = "видеть";
            int floor3 = 3;
            int floor2 = 2;

            if ((eyes.equals("видеть")) && (floor2 == (floor3 - 1))) {
                System.out.println("Глаза даны, чтобы видеть" + " " + "и" + "\n"
                        + "Под третьим этажом находится второй этаж");
            }

            //* 7) (6/2 = 3) ИЛИ (7*5 = 20).
            if (((6 / 2) == 3) || ((7 * 5) == 20)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
        /**
         * Записать в виде кода:
         */
        Task();
        //("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время");
        String watch = "Показывают время";
        int secInMinute = 60;

        if (secInMinute == 70) {
            System.out.println(true);
        }
        if (watch.equals("Показывают время")) {

            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //!(28 > 7) И !(300/5 = 60);
        int a = 28;
        int b = 7;
        int c = 300;
        int d = 5;
        System.out.println((!(28 > 7)) && (!(300 / 5 == 60)));

        //("Телевизор - электрический прибор") И ("Стекло - дерево");
        String TV = "электрический прибор";
        String material1 = "Стекло";
        String material2 = "Дерево";

        if (TV.equals("электрический прибор")) {
            if (material1 != material2) {
                System.out.println(true);
            }
        } else {
            System.out.println(false);
        }
        //Не((300 < 100))  → ("Жажду можно утолить водой");
        if (!(300 < 100)) {
            System.out.println("Жажду можно утолить водой");

        } else {
            System.out.println(" ");
        }
        //(75 < 81) → (88 = 88)

        if (75 < 81) {
            System.out.println("88 = 88");
        } else {
            System.out.println(" ");
        }

        /**
         * Записать в виде кода следующие выражения:
         */
        Task();
        //Андрей старше Светы. Наташа старше Светы.
        int andrey = 24;
        int sveta = 18;
        int natasha = 19;

        if ((andrey > sveta) && (natasha > sveta)) {
            System.out.println("Андрей старше Светы. Наташа старше Светы");
        } else {
            System.out.println(" ");
        }
        //На полке стоят учебники, а на столе лежат справочники.

        String schoolBooks = "on the shelve";
        String directories = "on the table";

        if (schoolBooks.equals("on the shelve")) {
            System.out.println("На полке стоят учебники,");
        }
        if (directories.equals("on the table")) {
            System.out.println(", а на столе лежат справочники");
        } else {
            System.out.println(" ");
        }
        // БОльшая часть детей — девочки. Остальные - мальчики.
        int totalKids = 26;
        int girls = 16;

        if (girls > (totalKids - girls)) {
            System.out.println("БОльшая часть детей — девочки. Остальные - мальчики.");
        }

        /**
         * “Водительские права можно получить, только когда исполнится 16 лет.”
         */
        Task();
        int age;
        age = 120;

        if (0 < age && age < 100) {
            if (16 <= age && age <= 100) {
                System.out.println("Водительские права можно получить, только когда исполнится 16 лет");
            } else {
                System.out.println("Вы не достигли возраста 16 лет");
            }
        } else {
            System.out.println("Бери такси");
        }
        /**
         * ”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”
         */
        Task();
        boolean isNotGoing = true;
        boolean isReading = true;
        boolean isNotWatching = true;

        System.out.println(isNotGoing && (isReading || isNotWatching));
        /**
         * “Если с другом ты, это хорошо, а когда наоборот - плохо”
         */
        Task();
        int withFriend = 5;

        if (withFriend == 5) {
            System.out.println("\"Если с другом ты, это хорошо,");
        } else {
            System.out.println("а когда наоборот - плохо\"");
        }
        /**
         * Записать выражения в виде условий if-else:
         *
         * Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.
         * Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь. Иначе идет снег.
         * Если на небе тучи, идет дождь, иначе идет “слепой” дождь.
         * Если сегодня суббота, значит, завтра воскресенье. Если сегодня пятница, значит, вчера был четверг. Иначе вчера был не четверг, а завтра - не воскресенье
         * Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.
         * Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.
         */
        //Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.
        Task();
        int age3 = 8;
        if (age3 >= 18) {
            System.out.println("\u0018[34mЕсли тебе больше 18 лет," + "то" + "\u0018[32mты взрослый.");
        } else {
            System.out.println("Иначе, ты - \u0018[34mребенок.");
        }

        /**
         * Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
         * Выведите результат работы алгоритма на печать.
         * Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
         */
        Task();
        int number = 7;
        if (number % 2 == 0) {
            System.out.println("number = " + number * 2);
        } else {
            System.out.println("number = " + number * number);
        }
        /**
         * Напишите алгоритм проверки возраста на соответствие условиям (if-else):
         * Голосовать можно с 18 лет
         * Машину можно водить с 16 лет
         * В школу можно идти с 5 лет
         * Выведите результат работы алгоритма на печать.
         *
         * Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
         */
        Task();
        int age5 = 7;

        if (age5 >= 5) {
            System.out.println("Возрастной ценз >= 5 лет - В школу можно идти с 5 лет");
        } else {
            System.out.println("Возрастной ценз >= 5 лет - Ваш возраст не соответствует критерию");
        }
        if (age5 >= 16) {
            System.out.println("Возрастной ценз >= 16 лет - Машину можно водить с 16 лет");
        } else {
            System.out.println("Возрастной ценз >= 16 лет - Ваш возраст не соответствует критерию");
        }
        if (age5 >= 18) {
            System.out.println("Голосовать можно с 18 лет");
        } else {
            System.out.println("Возрастной ценз >= 18 лет - Ваш возраст не соответствует заданному критерию");
        }
        /**
         * Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
         * 5 - выдать похвальную грамоту и перевести в следующий класс
         * 4 - перевести в следующий класс
         * 3 - дать задание на лето и перевести в следующий класс
         * 2 - вызвать родителей и оставить в текущем классе на второй год
         * Выведите результат работы алгоритма на печать.
         */

        /**
         * Напишите алгоритм программы, которая проверяет 2 числа.
         * Программа складывает числа, которые делятся на 3 без остатка, и вычитает числа,
         * которые делятся на 5 без остатка. Программа умножает числа, которые делятся на 2 без остатка,
         * но если хотя бы одно число отрицательное, программа умножает результат предыдущего действия на (-1).
         * Если числа не прошли ни одну проверку, программа выводит на печать ошибку о невозможности произвести действия.
         */
        Task();
        int num1 = 30;
        int num2 = -30;

        if ((num1 % 3 == 0) && (num2 % 3 == 0)) {
            System.out.println("Result = " + (num1 + num2));
        } else if ((num1 % 5 == 0) && (num2 % 5 == 0)) {
            System.out.println("Result = " + (num1 - num2));
        } else if ((num1 % 2 == 0) && (num2 % 2 == 0)) {
            if ((num1 >= 0) && (num2 >= 0)) {
            }
            System.out.println("Result = " + (0 * (-1)));
        } else {
            System.out.println("Не возможно провести действия");
        }
        /**
         * Распечатать следующие выражения, используя метод и параметры:
         * Результат деления k на l = …, а остаток от деления  = …
         * Результат деления k на m = …, а остаток от деления  = …
         * Результат деления l на m = …, а остаток от деления  = …
         * Результат деления m на k = …, а остаток от деления  = …
         * И так далее все возможные варианты.
         * Сравнить код из HW2 с кодом из HW4. Что для вас легче?
         */
        int k = 12;
        int l = 4;
        int m = 2;

        Task();
        resultNumbers(k, l);
        resultNumbers(l, m);


        /**
         * Выполнить задание 18 из HW2 с помощью метода и параметров:
         * а) Создать переменные apple и  student и присвоить им значения 40 и 6 соответственно. Распечатать выражение:
         * Если … яблок(а) поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
         * Распечатать это же выражение со значениями 100 и 21.
         */

        a = 40;
        b = 6;
        c = 100;
        d = 21;

        Task();
        appleForStudent(a, b);
        appleForStudent(c, d);

        /**
         * Выполнить задание 18 из HW2 с помощью метода и параметров:
         Написать метод так, чтобы правильные склонения слов (н-р, яблок или яблока)
         печатались автоматически в зависимости от значений параметров.
         * Распечатать выражение с параметрами:
         * apple = 42, 55, 1
         * student = 42, 5, 2
         */
        Task();
        countApples(42, 42);
        countApples(55, 5);
        countApples(1, 2);

        Task();
        /**
         * Напишите метод, который примет на вход параметр
         * температуры в Цельсиях, и распечатает результат температуры в Цельсиях и в Фаренгейтах.
         */
        temperature(37.5);

        /**
         *Напишите тест, который валидирует (проверит правильность работы) ваш код из задания №10.
         * Тестовые данные - 2, 5, 0.
         * Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
         */
        Task();
        Task();
        even(-2);
        even(5);
        even(0);

        correctOfTask(-2, -4);
        correctOfTask(5, 25);
        correctOfTask(0, 0);

        /**
         *Напишите тест, который валидирует ваш код из задания №11.
         * Придумайте тестовые данные. Выведите результат проверки на печать.
         */
        Task();
        Task();
        System.out.println(allowance(2));

        String preschool = "В школу можно идти с 5 лет ";
        String drive = "Машину можно водить с 16 лет";
        String voice = "Голосовать можно с 18 лет";

        int ageA = 5;
        if (allowance(ageA).contains(preschool)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        ageA = 16;
        if (allowance(ageA).contains(drive)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        ageA = 17;
        if (allowance(ageA).contains(voice)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        /**
         * Напишите алгоритм программы, которая проверяет число типа short на количество разрядов,
         * и выводит результат проверки.
         * ( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
         */
        Task();
        short take = 465;
        if (Short.MIN_VALUE <= take && Short.MAX_VALUE >= take) {
            if (-10 < take && take > 10) {
                System.out.println("It’s a one-digit number.");
            } else if (take <= -10 && take < -100 || take >= 10 && take < 100) {
                System.out.println("It’s a two-digit number.");
            } else if (take <= -100 && take < -1000 || take >= 100 && take < 1000) {
                System.out.println("It’s a tree-digit number.");
            }
        }else {
            System.out.println("Error");
        }





    }



}



