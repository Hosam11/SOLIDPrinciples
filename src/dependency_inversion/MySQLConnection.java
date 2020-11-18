package dependency_inversion;

public class MySQLConnection implements DBConnectionInterface {
    @Override
    public void connect() {
        System.out.println("connected to MYSQL");
    }
}
