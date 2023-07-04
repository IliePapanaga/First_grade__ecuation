package com.papanaga.ilie.java;

import java.util.Scanner;

public class EcuatieGradul1 {
    float terminA;
    float terminB;
    float terminC=0;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a float value for termin A: ");
        terminA = scanner.nextFloat();
        System.out.print("Enter a float value for termin B: ");
        terminB = scanner.nextFloat();
        System.out.print("Enter a float value for termin C: ");
        terminC = scanner.nextFloat();
        scanner.close();
    }

    public EcuatieGradul1() {
    }

    public EcuatieGradul1(float terminA, float terminB, float terminC) {
        this.terminA = terminA;
        this.terminB = terminB;
        this.terminC = terminC;
    }

    public void execute() {

        float raspuns;
        if (terminA == 0) {
            if (terminB-terminC == 0) {
                System.out.println("∞ de solutii");
            } else {
                System.out.println("Fara solutie");
            }
        } else {
            raspuns = (terminC-terminB)/terminA;
            System.out.println("Solutia e: x = " + raspuns);
        }
    }
}
