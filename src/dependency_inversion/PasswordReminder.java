package dependency_inversion;

public class PasswordReminder {
    DBConnectionInterface dbConnectionInterface;

    public PasswordReminder(DBConnectionInterface dbConnectionInterface) {
        this.dbConnectionInterface = dbConnectionInterface;
    }
}
