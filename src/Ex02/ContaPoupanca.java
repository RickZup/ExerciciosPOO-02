package Ex01;

public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, int numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public double calcularNovoSaldo(double porcentagemDeRendimento){
        double valorRendiemnto = (getSaldo() / 100) * diaRendimento * porcentagemDeRendimento;
        setSaldo(getSaldo() + valorRendiemnto);
        return getSaldo();
    }

}
