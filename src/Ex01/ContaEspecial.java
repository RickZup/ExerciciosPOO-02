package Ex01;

public class ClasseEspecial extends ContaBancaria {

    private double limite;

    public ClasseEspecial(String nomeCliente, int numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public double sacar(double valorSaque) {
        if (getSaldo() - valorSaque < 0) {
            System.out.println("Você não possui saldo suficiente!");
        } else {
            setSaldo(getSaldo() - valorSaque);
        }
        return getSaldo();
    }
}
