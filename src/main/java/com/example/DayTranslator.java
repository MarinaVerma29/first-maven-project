package com.example;

import java.util.Scanner;

public class DayTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название дня недели на английском:");
        String englishDay = scanner.nextLine().toLowerCase();

        String russianDay = translateDay(englishDay);
        System.out.println("Название дня недели на русском: " + russianDay);
    }

    private static String translateDay(String englishDay) {
        switch (englishDay) {
            case "monday":
                return "Понедельник";
            case "tuesday":
                return "Вторник";
            case "wednesday":
                return "Среда";
            case "thursday":
                return "Четверг";
            case "friday":
                return "Пятница";
            case "saturday":
                return "Суббота";
            case "sunday":
                return "Воскресенье";
            default:
                return "Неизвестный день";
        }
    }
}
