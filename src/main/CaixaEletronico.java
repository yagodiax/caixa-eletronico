package main;

public class CaixaEletronico {
    private ContaBancaria conta;

    public CaixaEletronico() {
        conta = new ContaBancaria();
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo atual é: R$ " + conta.getSaldo());
    }

    public void realizarSaque(double valor) {
        conta.saque(valor);
    }

    public void realizarDeposito(double valor) {
        conta.deposito(valor);
    }

    public void realizarTransferencia(ContaBancaria destino, double valor) {
        conta.transferir(destino, valor);
    }

    public static void exibirMenu() {
        System.out.println("\nSeja Bem Vindo! Escolha uma Das Opções abaixo");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Realizar saque");
        System.out.println("3 - Realizar depósito");
        System.out.println("4 - Realizar transferência");
        System.out.println("5 - Sair");
    }
}

