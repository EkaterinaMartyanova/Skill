package ru.geekbrains.java_one.lesson_5;

public class Dog extends Animal {

    protected int MaxDistanceSwim;

    public Dog(String name, int MaxSpacingRun, float MaxHeightJump, int MaxDistanceSwim, String type) {
        super(name, MaxSpacingRun, MaxHeightJump, type);
        this.MaxDistanceSwim = MaxDistanceSwim;
    }

    @Override
    public void Swim() {
        System.out.println(name + " плавает на " + MaxDistanceSwim + " м.");
    }

    public void getSwim(int DistanceSwim){
        if (DistanceSwim > MaxDistanceSwim) {
            System.out.println(type + " " + name +" устал!");
        } else {
            System.out.println(type + " " + name +" доплыл!");
        }
    }

}
