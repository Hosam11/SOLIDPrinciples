package liskov_substitution.bank;

public class CheckingAccount {
    private AccountManager manager;

    public CheckingAccount() {
        this.manager = new AccountManager();
    }

    public void deposit(double value) {
        this.manager.deposit(value);
    }

    public void cashOut(double value) {
        this.manager.cashOut(value);
    }

    public double getBalance() {
        return this.manager.getBalance();
    }

    @Override
    public String toString() {
        return "Checking account balance-> " + this.getBalance();
    }
}
