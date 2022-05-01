public class Student {

    public static void main (String[]args) {
        String object = "Ученик 5-го класса";
        String firstName = "Вова";
        String lastName = "Сидоров";
        int age = 10;
        String add = "лет.";


        String object1 = "Ученица 9-го класса";
        String firstName1 = "Маша";
        String lastName1 = "Семенова";
        int age1 = 14;

        String line = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";


        System.out.println(line);
        System.out.println(object);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(add);
        System.out.println(line);
        System.out.println(line);
        System.out.println(object1);
        System.out.println(firstName1);
        System.out.println(lastName1);
        System.out.println(age1);
        System.out.println(add);
        System.out.println(line);
        System.out.print(object + " " + firstName + " " + lastName + " " + age + add);
        System.out.print("\n");
        System.out.print(object1 + " " + firstName1 + " " + lastName1 + " " + age1 + add);
        System.out.println("\n");
        System.out.println(line);
    }
}
