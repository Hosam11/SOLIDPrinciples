package open_closed;

import single_responsibility.problemcode.Invoice;

public class FilePersistence implements InvoicePersistenceInterface{
    @Override
    public void save(Invoice invoice) {
        // Save to file
    }
}
