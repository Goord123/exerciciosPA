package ficha1.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;
        ArrayList<Integer> lista = new ArrayList<>();

        while (continua) {
            System.out.println("Introduza um numero para sair da lista: (-1 para sair)");
            int resposta = scanner.nextInt();
            if (resposta == -1) {
                continua = false;
            } else {
                lista.add(resposta);
            }
        }

        while (!continua) {
            System.out.println(
                    "1. Mostrar a lista\n" +
                    "2. Calcular e imprimir o maior e o menor elemento presentes no array\n" +
                    "3. Somar todos os elementos do array\n" +
                    "4. Calcular a média dos elementos do array\n" +
                    "5. Inverter a ordem do array\n" +
                    "6. Sair"
            );
            scanner = new Scanner(System.in);
            int resposta = scanner.nextInt();
            switch (resposta) {
                case 1 -> System.out.println(lista);
                case 2 -> {
                    lista.stream().max(Integer::compare).ifPresent(max -> System.out.println("Maior: " + max));
                    lista.stream().min(Integer::compare).ifPresent(min -> System.out.println("Menor: " + min));
                }
                case 3 -> System.out.println("Soma: " + lista.stream().reduce(0, Integer::sum));
                case 4 ->
                        System.out.println("Média: " + lista.stream().mapToInt(Integer::intValue).average().orElse(0));
                case 5 -> {
                    for (int i = lista.size() - 1; i >= 0; i--) {
                        System.out.println(lista.get(i));
                    }
                }
                case 6 -> continua = true;
            }
        }
    }
}
