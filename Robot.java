package ru.geekbrains.java_second.lesson_1;

public class Robot implements Activable{
    private final String name;
    private final int RunDistance;
    private final int JumpHeight;

    public Robot(String name, int RunDistance, int JumpHeight){
        this.name = name;
        this.RunDistance = RunDistance;
        this.JumpHeight = JumpHeight;
    }

    public int getRunDistance(){
        return RunDistance;
    }

    public int getJumpHeight(){
        return JumpHeight;
    }

    @Override
    public void Run () {
        System.out.println("Робот " + this.name + " пробежал " + this.getRunDistance());
    }

    @Override
    public void Jump(){
        System.out.println("Робот " + this.name + " прыгнул " + this.getJumpHeight());

    }
}

