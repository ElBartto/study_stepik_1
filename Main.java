package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Введите день");
        int day = sc.nextInt();
        System.out.println("Введите месяц");
        int month = sc.nextInt();*/

        System.out.println("Введите год");
        int year = sc.nextInt();

        if (year > 0) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 != 0) {
                        System.out.println("Год обычный");
                    } else {
                        System.out.println("Год високосный");
                    }
                } else {
                    System.out.println("Год високосный!");
                }
            } else {
                System.out.println("Год обычный!");
            }
        } else {
            System.out.println("Данные введены не корректно!");
        }
    }
}


