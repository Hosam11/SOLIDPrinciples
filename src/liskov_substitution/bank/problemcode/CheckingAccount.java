package liskov_substitution.bank.problemcode;

/**
 * CheckingAccount is identical to the CommonBankAccount class, except for the income() method.
 * A checking account has no income; it is only for receiving a salary.
 */
public class CheckingAccount extends CommonBankAccount {


    @Override
    public void deposit(double value) {
        super.deposit(value);
    }

    @Override
    public void cashOut(double value) {
        super.cashOut(value);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public void income()  /*throws Exception*/ {
      //  throw new Exception("This account has no income");
    }
}
