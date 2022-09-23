import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;
import clients.Alex;
import clients.Client;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        CreditAccount creditAccount = new CreditAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        Client alex = new Alex();
        alex.setName("Alex");
        alex.add(creditAccount);
        alex.pay(15000);
        alex.add(checkingAccount);
        checkingAccount.addMoney(6000);
        checkingAccount.transfer(creditAccount, 2000);
        alex.add(savingsAccount);
        savingsAccount.addMoney(20000);
        savingsAccount.transfer(creditAccount, 6000);
        creditAccount.transfer(checkingAccount, 2500);
        savingsAccount.accept(6000);
        alex.addMoney(2000);
        alex.accept(18000);
        checkingAccount.accept(4000);
        creditAccount.accept(1500);
        savingsAccount.accept(2000);

    }

}
