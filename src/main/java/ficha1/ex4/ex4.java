package ficha1.ex4;

import java.util.ArrayList;
import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        final int MAX = 5;

        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listaRepetidos = new ArrayList<>();
        Random random = new Random();
        int goal = 0;

        while (goal < MAX) {
            int rand = random.nextInt(10);
            if (lista.contains(rand)) {
                System.out.println("Número já existe na lista");
                listaRepetidos.add(rand);
            } else {
                lista.add(rand);
                goal++;
            }
        }
        System.out.println("Demorou " + goal + " tentativas a preencher a lista");
        System.out.println("Lista: " + lista);
        System.out.println("Lista de repetidos: " + listaRepetidos);
    }
}
