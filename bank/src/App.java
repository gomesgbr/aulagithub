import java.util.Scanner;

import model.entities.account;
import model.exceptions.WithdrawException;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        try{
            System.out.println("Enter account data");
            System.out.println("Number: ");
            int number = ler.nextInt();

            System.out.println("Holder: ");
            String holder = ler.next();

            System.out.println("Initial balance: ");
            double balance = ler.nextDouble();

            System.out.println("Withdraw Limit: ");
            double withdrawLimit = ler.nextDouble();

            account acc = new account(number, holder, balance, withdrawLimit);

            System.out.println("Enter amount for withdraw: ");
            double amount = ler.nextDouble();

            acc.withdraw(amount);

            System.out.println(acc.toString());
        }catch(WithdrawException e){
            System.out.println("Erro de saque: " + e.getMessage());
        }catch(RuntimeException e){
            System.out.println("Unexpected error: " + e);
        }
        ler.close();    
    }
}
