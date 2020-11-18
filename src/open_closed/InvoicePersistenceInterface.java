package open_closed;

import single_responsibility.problemcode.Invoice;

public interface InvoicePersistenceInterface {
    public void save(Invoice invoice);
}
