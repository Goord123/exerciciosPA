package ficha1.ex1;

import java.util.Random;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            System.out.println("Introduza um número: ");
            int rand = random.nextInt(5);
            int nr = scanner.nextInt();
            if (rand == nr) {
                System.out.println("Parabéns, acertou no número!");
                continua = false;
            } else {
                System.out.println("Tente novamente!");
            }
        }
    }
}