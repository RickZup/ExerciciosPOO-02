package Ex01;

public class Testes {

    public static void main(String[] args) {

        //Criando contas
        ContaPoupanca contaZup = new ContaPoupanca("Ricardo dos Santos", 10403491, 2000, 5);

        //Sacando valor
        contaZup.sacar(1950);

        //Depositando valor
        contaZup.depositar(50);

        System.out.println();
        System.out.println("Seu saldo atual é de R$" + contaZup.getSaldo());

        contaZup.calcularNovoSaldo(5);
        System.out.println("Após o tempo de rendimento, seu novo saldo é de R$" + contaZup.getSaldo());
        System.out.println();
        contaZup.exibirDados();

        System.out.println("------------------------------");
        System.out.println("Testando conta especial");
        System.out.println();

        ContaEspecial testeContaEspecial = new ContaEspecial("Fernanda", 14253678,
                3200, 500);

        testeContaEspecial.sacar(550);
        testeContaEspecial.exibirDados();

    }

}
