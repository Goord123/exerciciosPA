package ficha1.ex2;

import java.util.Random;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;
        int winningNumber = random.nextInt(100);
        System.out.println("["+ winningNumber + "]");

        while (continua) {
            System.out.println("Introduza um número: ");
            int nr = scanner.nextInt();
            if (winningNumber == nr) {
                System.out.println("ACERTOU!");
                continua = false;
            }
            else if (winningNumber < nr) {
                System.out.println("PENSEI NUM NÚMERO MAIS PEQUENO");
            }
            else {
                System.out.println("PENSEI NUM NÚMERO MAIOR");
            }
        }
    }
}
