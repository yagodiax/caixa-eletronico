package main;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
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

    public boolean transferir(ContaBancaria destino, double valor) {
        if (valor <= saldo) {
            saque(valor);
            destino.deposito(valor);
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente para transferência.");
            return false;
        }
    }
}
