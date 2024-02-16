package ficha1.ex5;

import java.util.Random;

public class ex5 {
    public static void main(String[] args) {

        Aposta aposta = new Aposta();
        boolean continua = true;
        int goal = 0;
        Random random = new Random();
        int numeroSorte = random.nextInt(1,13);

        while (goal < 5) {
            int rand = random.nextInt(1,49);
            if (aposta.lista.contains(rand)) {
                System.out.println("Número já existe na lista");
            } else {
                if (rand == numeroSorte) {
                    aposta.adicionaNumero(rand, true);
                }
                aposta.adicionaNumero(rand, false);
                goal++;
            }
        }


        int numeroDaSorte = 3;







    }
}
