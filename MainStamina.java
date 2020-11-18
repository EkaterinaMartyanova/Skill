package ru.geekbrains.java_one.lesson_5;

public class MainStamina {

    public static void main(String[] args) {

        Dog dog = new Dog("Алиса", 500, 0.5f, 10, "Песик");
        Cat cat = new Cat("Патрик", 200, 2, "Котик");
        Dog dog1 = new Dog("Крекер", 400,0.4f, 10, "Песик");
        Dog dog2 = new Dog("Барбос", 600,0.3f, 5, "Песик");

        dog.getSwim(500);
        dog.getRun(150);
        cat.getJump(5);
        dog1.getRun(500);
        dog2.getRun(500);
    }
}
