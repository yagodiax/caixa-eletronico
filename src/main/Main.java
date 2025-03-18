package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CaixaEletronico caixa = new CaixaEletronico();
        ContaBancaria contaDestino = new ContaBancaria();  // Outra conta para transferências
        int opcao;

        do {
            CaixaEletronico.exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    caixa.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = scanner.nextDouble();
                    caixa.realizarSaque(saque);
                    break;
                case 3:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    caixa.realizarDeposito(deposito);
                    break;
                case 4:
                    System.out.print("Digite o valor para transferência: R$ ");
                    double transferencia = scanner.nextDouble();
                    caixa.realizarTransferencia(contaDestino, transferencia);
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar o caixa eletrônico. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
