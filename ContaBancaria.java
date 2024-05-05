/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabancaria;

import java.util.Scanner;

/**
 *
 * @author Vitor Hugo
 */
public class ContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da Pessoa:");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o Saldo Inicial:");
        double saldoInicial = scanner.nextDouble();

        Conta conta = new Conta(nome, numeroConta, saldoInicial);

        char opcao;

        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("D - Depositar valor");
            System.out.println("S - Sacar valor");
            System.out.println("O - Obter saldo disponível");
            System.out.println("Q - Sair");

            opcao = Character.toUpperCase(scanner.next().charAt(0));

            switch (opcao) {
                case 'D':
                    System.out.println("Digite o valor a ser depositado:");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 'S':
                    System.out.println("Digite o valor a ser sacado:");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 'O':
                    System.out.println("Saldo disponível: R$" + conta.obterSaldo());
                    break;
                case 'Q':
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 'Q');

        scanner.close();
    }
    
}
