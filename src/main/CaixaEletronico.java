package main;

import java.util.Scanner;

public class CaixaEletronico {

    private double saldo;

    public CaixaEletronico() {
        saldo = 0.0;
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo atual é: R$ " + saldo);
    }

    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void saque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CaixaEletronico caixa = new CaixaEletronico();
        int opcao;

        // Menu de opções
        do {
            System.out.println("\nSeja Bem Vindo! Escolha uma Das Opções abaixo");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Realizar saque");
            System.out.println("3 - Realizar depósito");
            System.out.println("4 - Sair");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    caixa.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = scanner.nextDouble();
                    caixa.saque(saque);
                    break;
                case 3:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    caixa.deposito(deposito);
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar o caixa eletrônico. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
