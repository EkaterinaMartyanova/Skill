package ru.geekbrains.java_second.lesson_1;

public class Road extends Test{
    private final int distance;

    public Road(String name, int distance) {
        super(name);
        this.distance = distance;
    }

    public int getDistance(){
        return distance;
    }
    @Override
    protected boolean action(Human human) {
        System.out.println(super.getName() + ": " + this.distance);
        human.Run();

        if (getDistance() <= human.getRunDistance()) {
            System.out.println("Успешное завершение пробега для человека");
            return true;
        } else {
            System.out.println("Человек потерпел неудачу в пробеге");
            return false;
        }
    }
    @Override
    protected boolean action(Robot robot) {
        System.out.println(super.getName() + ": " + this.distance);
        robot.Run();

        if (getDistance() <= robot.getRunDistance()) {
            System.out.println("Успешное завершение пробега для робота");
            return true;
        } else {
            System.out.println("Робот потерпел неудачу в пробеге");
            return false;
        }
    }
    @Override
    protected boolean action(Cat cat) {
        System.out.println(super.getName() + ": " + this.distance);
        cat.Run();

        if (getDistance() <= cat.getRunDistance()) {
            System.out.println("Успешное завершение пробега для кота");
            return true;
        } else {
            System.out.println("Кот потерпел неудачу в пробеге");
            return false;
        }
    }
}
