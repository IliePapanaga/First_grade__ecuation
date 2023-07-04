package com.papanaga.ilie.java;

import java.util.Scanner;

public class SecondGrade {
    float TerminA;
    float TerminB;
    float TerminC;
    boolean continua = true;
    Scanner scanner = new Scanner(System.in);

    public void read() {
        System.out.println("Introduceți factorii ecuației de gradul 2:");
        System.out.print("Termin a = ");
        TerminA = scanner.nextFloat();
        System.out.print("Termin b = ");
        TerminB = scanner.nextFloat();
        System.out.print("Termin c = ");
        TerminC = scanner.nextFloat();
        scanner.close();
    }

    public void execute() {
        float rr;
        rr = TerminB * TerminB - 4 * TerminA * TerminC;
        if (rr > 0) {
            double x1 = (-TerminB + Math.sqrt(rr)) / (2 * TerminA);
            double x2 = (-TerminB - Math.sqrt(rr)) / (2 * TerminA);
            System.out.println("Soluțiile ecuației sunt: x1 = " + x1 + ", x2 = " + x2);
        } else if (rr == 0) {
            float x = -TerminB / (2 * TerminA);
            System.out.println("Ecuația are o singură soluție: x = " + x);
        } else {
            System.out.println("Ecuația nu are soluții reale.");
        }
    }
}
