package com.papanaga.ilie.java;
import java.util.Scanner;

public class SecondGrade {
    float TerminA;
    float TerminB;
    float TerminC;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;
        while (continua) {
            System.out.println("Introduceți factorii ecuației de gradul 2:");
            System.out.print("Termin a = ");
            TerminA = scanner.nextFloat();
            System.out.print("Termin b = ");
            TerminB=scanner.nextFloat();
            System.out.print("Termin c = ");
            TerminC=scanner.nextFloat();
        }
        public void execute() {

            float raspuns;
            raspuns = TerminB * TerminB - 4 * TerminA * TerminC;
            if (raspuns > 0) {
                float x1 = (-TerminB + Math.sqrt(raspuns)) / (2 * TerminA);
                float x2 = (-TerminB - Math.sqrt(raspuns)) / (2 * TerminA);
                System.out.println("Soluțiile ecuației sunt: x1 = " + x1 + ", x2 = " + x2);
            } else if (raspuns == 0) {
                float x = -TerminB / (2 * TerminA);
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