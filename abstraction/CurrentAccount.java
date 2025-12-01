public class CurrentAccount extends BankAccount{
    @Override
    public void withdraw(double amount){
        System.out.println("Withdrawing...");
    }

    @Override
    public void deposit(double amount){
        System.out.println("Depositing...");
    }
}