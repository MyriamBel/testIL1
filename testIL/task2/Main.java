package com.company;

//Задание 2 "Стремится к нулю или к бесконечности?"
//	(n! обозначает factorial(n))
//	Будет ли выражение вида:
//		un = (1 / n!) * (1! + 2! + 3! + ... + n!)
//	стремится к 0 или к бесконечности?
//	Реализуйте функцию, которая расчитывает значение un для целочисленных n > 1
//	(с точностью не хуже 6 знаков после запятой).

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        Factorial factorial = new Factorial();

        ArrayList<Integer> answers = new ArrayList<Integer>();

        for (int i = 1; i <= number; i++) {
            factorial.calculateFactorial(i);
            answers.add(factorial.getResult());
        }
//  Добавить сравнение значений на промежутке от 1 до n
//        boolean to0 = false;
//        boolean to_infinity = false;
//            if (i > 1){
//                if (answers.get(i-1) > answers.get(i-2)){
//                     to_infinity = true;
//                     to0 = false;
//                } else if (answers.get(i) < answers.get(i-1)){
//                    to_infinity = false;
//                    to0 = true;
//                } else {
//                    to_infinity = false;
//                    to0 = false;
//                }
//            }
//        }
//        System.out.println(
//                "Стремится к 0: " + to0 + "\nСтремится к бесконечности: " + to_infinity
//        );

    }
}