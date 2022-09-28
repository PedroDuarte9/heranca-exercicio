package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

/*HERANÇA: Permite o reuso de atributos e métodos (dados e comportamento) */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(1201, "Pedro Duarte", 500.00);

        BusinessAccount bcc = new BusinessAccount(1301, "Flávia Marques", 0.0, 100.00);


        Account scc = new SavingsAccount(1435,"Francinaldo Getulio", 0.0,0.1);
        System.out.println(acc);
        System.out.println(bcc);
        System.out.println(scc);





//        System.out.println("Digite o número da conta: ");
//        int number = sc.nextInt();
//
//        System.out.println("Digite o Titular da conta: ");
//        String holder = sc.nextLine();
//
//        System.out.println("");
        sc.close();
    }
}
