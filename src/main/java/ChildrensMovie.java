import java.math.BigDecimal;

public class ChildrensMovie extends Movie {

	public ChildrensMovie(String title, String priceCode) {
		super(title, priceCode);
	}

	@Override
	public String getPriceCode() {
		return priceCode;
	}

	@Override
	public BigDecimal calculateFees(int days) {

		BigDecimal amount = new BigDecimal("1.50");
		if (days > 3) {

			amount = amount.add(new BigDecimal("1.50").multiply(new BigDecimal(days - 3)));
		}
		return amount;
	}

}
