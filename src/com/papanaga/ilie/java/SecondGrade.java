package com.papanaga.ilie.java;

import java.util.Scanner;

public class SecondGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            System.out.println("Introduceți factorii ecuației de gradul 2:");

            System.out.print("a = ");
            double a = scanner.nextDouble();

            System.out.print("b = ");
            double b = scanner.nextDouble();

            System.out.print("c = ");
            double c = scanner.nextDouble();

            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Soluțiile ecuației sunt: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Ecuația are o singură soluție: x = " + x);
            } else {
                System.out.println("Ecuația nu are soluții reale.");
            }

            System.out.print("Doriți să introduceți alți factori? (da/nu): ");
            String raspuns = scanner.next();

            if (!raspuns.equalsIgnoreCase("da")) {
                continua = false;
                System.out.println("Multumesc");
            }
        }
    }
}
