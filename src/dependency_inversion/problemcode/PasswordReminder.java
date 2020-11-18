package dependency_inversion.problemcode;

public class PasswordReminder {
    MySQLConnection dbConnection;

    public PasswordReminder(MySQLConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
}
