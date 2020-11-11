package ru.geekbrains.java_one.lesson_4;

public class worker {
    private String name;
    private String position;
    private int age;
    private int salary;
    private static int IdWorker = 0;


    
    public worker(String name, String position, int age, int salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
        System.out.println(getName() + "," + " ID: " + IdWorker++);
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public int setSalary() {
        if (getAge() > 45) {
             salary = getSalary() + 5000;
        }
        return salary;
    }


}
