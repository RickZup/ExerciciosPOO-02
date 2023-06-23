package Ex02;

public class ContaCorrente extends ContaBancaria implements Tributos {

    public ContaCorrente(String nomeCliente, int numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
    }

    @Override
    public double calcularTributos() {
        double desconto = getSaldo() * 0.01;
        setSaldo(getSaldo() - desconto);
        return getSaldo();
    }

    //ToDo Seguro de vida?


}
