import com.papanaga.ilie.java.EcuatieGradul1;

public class firstgrade {
    public static void main(String[] args) {
    /*    int a = 0; // Assign the value of 'a' here
        int b = 1; // Assign the value of 'b' here

        if (a == 0) {
            if (b == 0) {
                System.out.println("∞ de solutii");
            } else {
                System.out.println("Fara solutie");
            }
        } else {
            int x = -b / a;
            System.out.println("Solutia e: x = " + x);
        }*/

        EcuatieGradul1 ecuatie = new EcuatieGradul1();
        ecuatie.read();
        ecuatie.execute();

        EcuatieGradul1 ecuatie1 = new EcuatieGradul1(23,34,-2);
     //   ecuatie.read();
      //    ecuatie1.execute();
    }
}
