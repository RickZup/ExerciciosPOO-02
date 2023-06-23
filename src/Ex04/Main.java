package Ex04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> jardimZoologico = new ArrayList<>();

        jardimZoologico.add(new Mamifero("Camelo", 3, 4, "amarelo",
                "deserto", 1, "vegetais"));

        jardimZoologico.add(new Peixe("Tubarão", 18, 0, "cinza",
                "mar", 5, "Barbatanas e calda"));

        jardimZoologico.add(new Mamifero("Urso-do-canadá", 3.5, 4,
                "castano", "bosques", 3, "mel"));

        jardimZoologico.add(new Mamifero("Iguana", 1, 4, "verde",
                "deserto", 6, "insetos"));

        jardimZoologico.add(new Mamifero("Leão", 3, 4, "amarelo escuro",
                "savana", 5, "carne"));

        jardimZoologico.add(new Mamifero("Mico-leão-dourado", 1, 4, "marrom",
                "floresta", 4, "frutas"));

        System.out.println();
        System.out.println("Quantidade de animais no Jardim: "  + jardimZoologico.size());
        System.out.println("----------------------------------");
        System.out.println("Animais:");
        System.out.println();
        for (Animal animal : jardimZoologico) {
            System.out.println(animal);
        }



    }
}
