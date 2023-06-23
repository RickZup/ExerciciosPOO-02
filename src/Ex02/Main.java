package Ex02;

public class Main {
    public static void main(String[] args) {

        ContaCorrente minhaConta = new ContaCorrente("Gabriel", 11223344,
                5000);

        minhaConta.calcularTributos();
        minhaConta.exibirDados();

    }
}
