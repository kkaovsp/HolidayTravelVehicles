import java.util.ArrayList;

public class Option {
	private String optionCode;
	private String description;
	private double price;
	private ArrayList<Invoice> invoices  = new ArrayList<>();

	public Option(String optionCode, String description, double price) {
		this.optionCode = optionCode;
		this.description = description;
		this.price = price;
	}

	// Getters and setters
	public String getOptionCode() {
		return optionCode;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public ArrayList<Invoice> getInvoices() {
		return invoices;
	}

	public void addInvoice(Invoice invoice) {
		invoices.add(invoice);
	}
}
