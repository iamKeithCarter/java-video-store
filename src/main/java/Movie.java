import java.math.BigDecimal;

public abstract class Movie {

	protected String title;
	protected String priceCode;
	protected BigDecimal rentalFees;

	public Movie(String title, String priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public String getTitle() {
		return title;
	}

	public abstract String getPriceCode(); 
	
	
	public abstract BigDecimal calculateFees(int days);
	
}
