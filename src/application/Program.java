package application;

import java.util.Locale;
import java.util.Scanner;

import application.entities.ContaTerminal;



public class Program {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Bem vindo ao Banco do Polvo!");
        System.out.println("");
        System.out.println("Cadatro de nova conta:");
        System.out.println("");

        System.out.println("Numero da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Agencia: ");
        String agencia = sc.nextLine();
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Saldo inicial: ");
        Double saldo = sc.nextDouble();

        ContaTerminal novaConta = new ContaTerminal(numero, agencia, nome, saldo);

        System.out.println(novaConta);

        sc.close();
    }
    
}
