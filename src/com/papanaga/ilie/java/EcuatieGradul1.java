package com.papanaga.ilie.java;

public class EcuatieGradul1 {
    float terminA;
    float terminB;
    float terminC=0;

    public void read() {

    }

    public void execute() {
        System.out.println("terminA = " + terminA);
        System.out.println("terminB = " + terminB);

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
