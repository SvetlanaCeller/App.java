package ru.itgirl;

import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        HashMap<String, String> days = new HashMap<>();
        days.put("Monday", "Понедельник");
        days.put("Tuesday", "Вторник");
        days.put("Wednesday", "Среда");
        days.put("Thursday", "Четверг");
        days.put("Friday", "Пятница");
        days.put("Saturday", "Суббота");
        days.put("Sunday", "Воскресенье");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день недели на английском:");
        String day = sc.nextLine();
        System.out.println("Спасибо! Вы ввели слово " + days.get(day));
    }
}

