package ru.geekbrains.java_second.lesson_1;

public abstract  class Test {
    private String name;

    public Test(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    protected abstract boolean action(Human human);
    protected abstract boolean action(Robot robot);
    protected abstract boolean action(Cat cat);
}
