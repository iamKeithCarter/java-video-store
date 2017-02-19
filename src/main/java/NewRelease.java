import java.math.BigDecimal;


public class NewRelease extends Movie {

	public NewRelease(String title, String priceCode) {
		super(title, priceCode);

	}

	@Override
	public String getPriceCode() {

		return priceCode;
	}

	
	@Override
	public BigDecimal calculateFees(int days) {

		BigDecimal amount = new BigDecimal("3.00").multiply(new BigDecimal(days));

		return amount;
	}

}
