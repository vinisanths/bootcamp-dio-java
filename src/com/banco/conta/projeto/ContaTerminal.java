package com.banco.conta.projeto;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor informe o numero da Conta: ");
        int numero = sc.nextInt();

        sc.nextLine();
        System.out.print("Por favor, digite o número da Agência! ");
        String agencia = sc.nextLine();

        System.out.print("Informe o nome do Cliente: ");
        String nome = sc.nextLine();

        System.out.print("Informe o Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+
                numero +", e seu saldo "+ saldo +" já esta disponível para saque!");

        sc.close();
    }
}