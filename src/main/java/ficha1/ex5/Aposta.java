package ficha1.ex5;

import java.util.ArrayList;
import java.util.List;

public class Aposta {
    List<Integer> lista;



    public Aposta() {
        this.lista = new ArrayList<>();
    }

    public void adicionaNumero(int numero, boolean isNumeroDaSorte) {
        if (this.lista.contains(numero)) {
            System.out.println("Número já existe na lista");
            return;
        }
        if (isNumeroDaSorte) {
            System.out.println("Número da sorte! " + "[" + numero + "]");
        }
        this.lista.add(numero);
    }


    public boolean checkIfApostaIsFull() {
        return this.lista.size() == 5;
    }

    public void autoFillAposta() {
        while (!checkIfApostaIsFull()) {
            int rand = (int) (Math.random() * 49 + 1);
            if (!this.lista.contains(rand)) {
                this.lista.add(rand);
            }
        }
    }

    public void resetAposta() {
        this.lista.clear();
    }

}
