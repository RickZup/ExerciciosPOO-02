package Ex03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Dicionario {

    public static void main(String[] args) {

        Map<String, List<String>> dicionario = new HashMap<>();

        adicionarItem(dicionario, "Livro", "Azul");
        adicionarItem(dicionario, "Bola", "Laranja");
        adicionarItem(dicionario, "Caneta", "Preta");
        adicionarItem(dicionario, "Lápis", "Verde");
        adicionarItem(dicionario, "Óculos", "Roxo");

        System.out.println();
        System.out.println("---------- DICIONÁRIO ----------");
        System.out.println();
        System.out.println("Número de itens: " + dicionario.size());
        System.out.println();
        for (Map.Entry<String, List<String>> entry : dicionario.entrySet()) {
            String objeto = entry.getKey();
            List<String> cores = entry.getValue();

            System.out.println(objeto + ": " + cores);
        }
    }

    private static void adicionarItem(Map<String, List<String>> dicionario, String objeto, String cor) {
        if (dicionario.containsKey(objeto)) {
            // Se o objeto já existe no dicionário, adiciona a cor à lista existente
            List<String> cores = dicionario.get(objeto);
            cores.add(cor);
        } else {
            // Se o objeto não existe no dicionário, cria uma nova lista com a cor e adiciona ao dicionário
            List<String> cores = new ArrayList<>();
            cores.add(cor);
            dicionario.put(objeto, cores);
        }
    }

}
