package Ex01;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public double sacar(double valorSaque) {
        if (valorSaque <= limite){
            if (getSaldo() - valorSaque < 0) {
                System.out.println("Você não possui saldo suficiente!");
            } else {
                setSaldo(getSaldo() - valorSaque);
            }
        } else {
            System.out.println("Não é possível sacar um valor acima do limite.");
            System.out.println();
        }
        return getSaldo();
    }
}
