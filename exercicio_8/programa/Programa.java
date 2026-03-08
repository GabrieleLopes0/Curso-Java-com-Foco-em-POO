package exercicio_8.programa;

import java.util.Scanner;
import exercicio_8.entidades.*;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o nome do titular da conta: ");
        String titular = sc.nextLine();

        System.out.print("Há depósito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);

        Conta conta;
        if (resposta == 's' || resposta == 'S') {
            System.out.print("Digite o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        } else {
            conta = new Conta(numero, titular);
        }

        System.out.println("\nDados da conta:");
        System.out.println(conta);

        System.out.print("\nDigite um valor para depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        System.out.print("\nDigite um valor para saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        sc.close();
    }
}
