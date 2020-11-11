package ru.geekbrains.java_one.lesson_4;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        worker c0 = new worker("Петров Василий Петрович", "Генеральный директор", 46, 100000);
        //System.out.println("Сотрудник " + c0.getName() + " занимает позиюцию " + c0.getPosition() + " возраст " + c0.getAge() + " c зарплатой " + c0.getSalary() + " рублей.");

        worker c1 = new worker("Минина Марья Петровна", "Секретарь", 25, 50000);
        //System.out.println("Сотрудник " + c1.getName() + " занимает позиюцию " + c1.getPosition() + " возраст " + c1.getAge() + " c зарплатой " + c1.getSalary() + " рублей.");

        worker c2 = new worker("Афанасьев Владимир Ильич", "Юрист", 38, 80000);
        //System.out.println("Сотрудник " + c2.getName() + " занимает позиюцию " + c2.getPosition() + " возраст " + c2.getAge() + " c зарплатой " + c2.getSalary() + " рублей.");

        worker c3 = new worker("Кравченко Людмила Георгиевна", "Юрист", 29, 80000);
        //System.out.println("Сотрудник " + c3.getName() + " занимает позиюцию " + c3.getPosition() + " возраст " + c3.getAge() + " c зарплатой " + c3.getSalary() + " рублей.");

        worker c4 = new worker("Ларин Георгий Константинович", "Системный администратор", 29, 70000);
        //System.out.println("Сотрудник " + c4.getName() + " занимает позиюцию " + c4.getPosition() + " возраст " + c4.getAge() + " c зарплатой " + c4.getSalary() + " рублей.");

        worker[] Workers = new worker[5];

        Workers[0] = new worker("Петров Василий Петрович", "Генеральный директор", 46, 100000);
        Workers[1] = new worker("Минина Марья Петровна", "Секретарь", 25, 50000);
        Workers[2] = new worker("Афанасьев Владимир Ильич", "Юрист", 38, 80000);
        Workers[3] = new worker("Кравченко Людмила Георгиевна", "Юрист", 29, 80000);
        Workers[4] = new worker("Ларин Георгий Константинович", "Системный администратор", 29, 70000);


        for (int i=0; i < Workers.length; i++) {
            if (Workers[i].getAge() > 40)
                System.out.println("Зарплата увеличится у " + Workers[i].getName());
        }

        for (int i=0; i < Workers.length; i++) {
            if (Workers[i].getAge() > 45)
                System.out.println("Зарплата увеличится у " + Workers[i].getName() + " и будет составлять " + Workers[i].setSalary());
        }

        int MeanValueSalary = 0;

        for (int i=0; i < Workers.length; i++) {
            MeanValueSalary = MeanValueSalary + Workers[i].getSalary();
        }

        MeanValueSalary = MeanValueSalary / Workers.length;

        System.out.println("Средняя арифметическая зарплаты " + MeanValueSalary);

        int MeanValueAge = 0;

        for (int i=0; i < Workers.length; i++) {
            MeanValueAge = MeanValueAge + Workers[i].getAge();
        }

        MeanValueAge = MeanValueAge / Workers.length;

        System.out.println("Средняя арифметическая возраста " + MeanValueAge);

    }


}
