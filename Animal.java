package ru.geekbrains.java_one.lesson_5;

public class Animal {

    protected String name;
    protected int MaxSpacingRun;
    protected float MaxHeightJump;
    protected String type;

    public Animal(String name, int MaxSpacingRun, float MaxHeightJump, String type) {
        this.name = name;
        this.MaxSpacingRun = MaxSpacingRun;
        this.MaxHeightJump = MaxHeightJump;
        this.type = type;
    }

    public void Run() {
        System.out.println(name + " бегает на " + MaxSpacingRun + " м.");
    }

    public void getRun(int SpacingRun){
        if (SpacingRun > MaxSpacingRun) {
            System.out.println(type + " " + name +" устал!");
        } else {
            System.out.println(type + " " + name + " пробежал!");
        }
    }

    public void getJump(int HeightJump){
        if (HeightJump > MaxHeightJump) {
            System.out.println(type + " " + name + " не допрыгнет!");
        } else {
            System.out.println(type + " " + name + " допрыгнул!");
        }
    }

    public void Jump() {
        System.out.println(name + " прыгает на " + MaxHeightJump + " м.");
    }

    public void Swim() {

    }

}

