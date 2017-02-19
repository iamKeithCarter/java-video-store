import java.math.BigDecimal;


public class Rental {

	private String title;
	private String priceCode;
	private BigDecimal rentalFees;
	private int days;

	public Rental(Movie rented, int days) {

		title = rented.getTitle();
		priceCode = rented.getPriceCode();
		rentalFees = rented.calculateFees(days);
		this.days = days;
	}

	public BigDecimal calculateFees() {

		return rentalFees;
	}

	public String getTitle() {
		return title;
	}

	public String getPriceCode() {
		return priceCode;
	}

	public int getDays() {

		return days;

	}

}
