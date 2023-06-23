package Ex01;

import java.sql.SQLOutput;

public abstract class ContaBancaria {

    private String nomeCliente;
    private int numConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    //--------------- Get e Set ---------------//

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    //--------------- Métodos ---------------//

    public double sacar(double valorSaque) {
        if (saldo - valorSaque < 0) {
            System.out.println("Você não possui saldo suficiente!");
        } else {
            saldo = saldo - valorSaque;
        }
        return saldo;
    }

    public double depositar(double valorDeposito) {
        saldo = saldo + valorDeposito;
        return saldo;
    }

    public void exibirDados(){
        System.out.println("--------------- EXTRATO DA CONTA ---------------");
        System.out.println("Nome do titular: " + getNomeCliente());
        System.out.println("Nº da conta: " + getNumConta());
        System.out.println("Saldo: " + getSaldo());
    }

}
