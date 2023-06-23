package Ex04;

public class Peixe extends Animal{

    private String caracteristicas;

    public Peixe(String nome, double comprimento, int numPatas, String cor,
                 String ambiente, double velocidade,
                 String caracteristicas) {
        super(nome, comprimento, numPatas = 0, cor = "cinzenta", ambiente = "mar", velocidade);
        this.caracteristicas = caracteristicas = "Barbatanas e calda";
    }

    @Override
    public String toString() {
        return "Peixe: "  + getNome() + " ("  + getAmbiente() + ")";
    }
}
