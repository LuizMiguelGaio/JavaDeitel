package src.cap3;
// Figura 3.2: AccountTest.Java
// Cria e manipula um objeto Account.

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // cria um objeto Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        // cria um objeto Account e o atribui a myAccountÿ
        Account Account1 = new Account("Luiz Miguel", 77.00);
        Account Account2 = new Account("Ricado Gaio", 66.00);
        // exibe o valor inicial do nome (null)
        //exibe saldo inicial de cada objeto
        System.out.printf("%s%n balance is $%.2f%n", Account1.getName(), Account1.getBalance());
        System.out.printf("%s%n balance is $%.2f%n", Account2.getName(), Account2.getBalance());
        // solicita e lê o nome
        System.out.println("Enter deposit Amount for account1: ");
        double depositAmount = input.nextDouble(); // obtem a entrada do usuário
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        Account1.deposit(depositAmount); //adiciona o saldo de account1

        //exibe os saldos

        System.out.printf("%s balance: $%.2f %n", Account1.getName(), Account1.getBalance());

        System.out.printf("%s balance: $%.2f %n", Account2.getName(), Account2.getBalance());

        System.out.println("Enter deposit Amount for account2: ");
        depositAmount = input.nextDouble(); // obtem a entrada do usuário
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        Account2.deposit(depositAmount);

        input.close(); //fecha input

        //exibe os saldos
        System.out.printf("%s balance: %.2f %n", Account1.getName(), Account1.getBalance());

        System.out.printf("%s balance: %.2f %n", Account2.getName(), Account2.getBalance());


        //adiciona o saldo de account1
        //myAccount.setName(theName); // insere theName em myAccount ÿ
        //System.out.println(); // gera saída de uma linha em branco
        // exibe o nome armazenado no objeto myAccount
        //System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
    }
}
/* fim da classe AccountTest */