package ru.geekbrains.java_one.lesson_6;

import java.io.*;
import java.util.Scanner;

public class MainFile {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("Aliсe.txt");
        int b;
        while ((b = fis.read()) != -1) {
            FileOutputStream fos = new FileOutputStream("Alice2.txt", true);
            fos.write((char) b);
        }
        FileInputStream find = new FileInputStream("Aliсe.txt");
        String c = "story";
        Scanner scanner = new Scanner(find);
        while (scanner.hasNext()) {
            String a = scanner.next();
                System.out.println(a.equals(c));
        }

    }
}
