package open_closed;

import single_responsibility.problemcode.Invoice;

public class DatabasePersistence implements InvoicePersistenceInterface {
    @Override
    public void save(Invoice invoice) {
        // Save to DB
    }
}
