public class firstgrade {
    public static void main(String[] args) {
        int a = 0; // Assign the value of 'a' here
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
        }
    }
}
