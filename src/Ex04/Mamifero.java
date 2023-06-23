package Ex04;

public class Mamifero extends Animal{

    private String alimento;

    public Mamifero(String nome, double comprimento, int numPatas,
                    String cor, String ambiente, double velocidade,
                    String alimento) {
        super(nome, comprimento, numPatas, cor, ambiente = "terra", velocidade);
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Mamífero: "  + getNome() + " ("  + getAmbiente() + ")";
    }
}
