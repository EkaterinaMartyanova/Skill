package ru.geekbrains.java_second.lesson_1;

public class Wall extends Test {
    private final int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }


    public int getHeight(){
        return height;
    }
    @Override
    protected boolean action(Human human) {
        System.out.println(super.getName() + " высотой: " + this.height);
        human.Run();

        if (getHeight() <= human.getJumpHeight()) {
            System.out.println("Человек перепрыгнул");
            return true;
        } else {
            System.out.println("Человек не перепрыгнул");
            return false;
        }
    }
    @Override
    protected boolean action(Robot robot) {
        System.out.println(super.getName() + ": " + this.height);
        robot.Run();

        if (getHeight() <= robot.getJumpHeight()) {
            System.out.println("Робот перепрыгнул");
            return true;
        } else {
            System.out.println("Робот не перепрыгнул");
            return false;
        }
    }
    @Override
    protected boolean action(Cat cat) {
        System.out.println(super.getName() + ": " + this.height);
        cat.Run();

        if (getHeight() <= cat.getJumpHeight()) {
            System.out.println("Кот перепрыгнул");
            return true;
        } else {
            System.out.println("Кот не перепрыгнул");
            return false;
        }
    }

}
