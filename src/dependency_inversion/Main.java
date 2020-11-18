package dependency_inversion;

public class Main {

    public static void test() {
        MySQLConnection mySQLConnection = new MySQLConnection();

        PasswordReminder passwordReminder = new PasswordReminder(mySQLConnection);

        passwordReminder.dbConnectionInterface.connect();
    }

    public static void main(String[] args) {
        test();
    }
}
