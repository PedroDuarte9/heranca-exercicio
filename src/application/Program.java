package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

/*HERANÇA: Permite o reuso de atributos e métodos (dados e comportamento)
*
*SOBREPOSIÇÃO OU SOBRESCRITA:
* - É a implementação de um método de uma superclasse na subclasse
* - É fortemente recomendável usar a anotação @Override em um método sobrescrito
*   - Facilita a leitura e compreensão do código
*   - Avisamos ao compilador(Boa prática)
*   */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(1201, "Pedro Duarte", 1000.00);
        acc.withdraw(50.0);
        BusinessAccount bcc = new BusinessAccount(1301, "Flávia Marques", 1000.0, 0.0);
        bcc.withdraw(200.0);
        SavingsAccount savingsAccount = new SavingsAccount(133,"Carlos", 1000.0, 0.01);
        savingsAccount.withdraw(200.0);


        System.out.println(bcc);
        System.out.println(savingsAccount);

        //UPCASTING
        Account acc0 = bcc;
        Account acc1 = new BusinessAccount(1302, "Flávia Nayara", 1000.0, 0.0);
        Account scc = new SavingsAccount(1435,"Francinaldo Getulio", 1000.0,0.1);

        //DOWNCASTING

        BusinessAccount bcc4 = (BusinessAccount)acc1;
        bcc4.loan(200.0);

//        if(acc instanceof BusinessAccount){
//            BusinessAccount bcc1 = (BusinessAccount) acc1;
//            bcc1.loan(200.0);
//            System.out.println("Loan !");
//        }
//
//
//        if(acc instanceof SavingsAccount){
//            SavingsAccount scc2 = (SavingsAccount) scc;
//            scc2.updateBalance();
//            System.out.println("Update !");
//        }



        //Mostrando os Resultados

//        System.out.println(acc);
//        System.out.println(bcc);
//        System.out.println(scc);






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


