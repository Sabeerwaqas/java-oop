public class AbstractionDemo{
    public static void main(String[] args){
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.deposit(100);

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.deposit(200);

    }
}