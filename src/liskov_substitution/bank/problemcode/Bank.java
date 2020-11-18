package liskov_substitution.bank.problemcode;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    public static void main(String[] args) {

        List<CommonBankAccount> accountsList = new ArrayList<>();
        accountsList.add(new CommonBankAccount());
        accountsList.add(new CheckingAccount());

        for (CommonBankAccount account : accountsList) {
            account.income();

            System.out.println("New balance:");
            System.out.println(account.getBalance());
        }
    }
}