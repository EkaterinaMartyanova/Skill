package ru.geekbrains.java_one.lesson_a.online;

public class HelloWorld {

    public static float Arithmetic(int a, int b, int c, int d) {
        return (a * (b + (c / d)));
    }

    public static boolean Summ(int a, int b) {
        return (10 <= a + b) && (a + b <= 20);
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        int c = 14;
        int d = 16;
        float result = Arithmetic(a, b, c, d); //47

        System.out.println(result);

        int number3 = -1;
        if (number3 >= 0) {
            System.out.println("Положительное");
        } else {
            System.err.println("Отрицательное");
        }

        String name = "Вася";
        System.out.println("Привет, " + name + "!");

        int year = 1887;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }


    }

    public boolean SummBetween(String[] args) {
        int number1 = 12;
        int number2 = 5;
        return Summ(number1, number2);
    }


}
