package ru.geekbrains.java_second.lesson_1;



public class Main {
    public static void main(String[] args){
        Human a = new Human("Таня", 10, 5);
        Robot b = new Robot("Валли", 1000, 100);
        Cat c = new Cat ("Барсик", 100,10);
        Activable[] arr = {a, b, c};

        Road road = new Road("Дистанция пробега", 500);
        Wall wall = new Wall("Высота стены", 7);
        Test[] array = {road, wall};

        for (int i = 0; i < arr.length; i++) {
            boolean result = true;
            for (int j = 0; j < array.length; j++) {
                if (Human.class == arr[i].getClass()){
                    result = array[j].action((Human) arr[i]);
                }
                if (Robot.class == arr[i].getClass()){
                    result = array[j].action((Robot) arr[i]);
                }
                if (Cat.class == arr[i].getClass()){
                    result = array[j].action((Cat) arr[i]);
                }
                if (!result) {
                    break;
                }
            }
        }
    }
}
