import java.math.BigDecimal;


public class RegularMovie extends Movie {

	public RegularMovie(String title, String priceCode) {
		super(title, priceCode);
		
	}

	@Override
	public String getPriceCode() {
		
		return priceCode;
	}

	@Override
	public BigDecimal calculateFees(int days) {
	
		BigDecimal amount = new BigDecimal("2.00");
			if (days > 2) {
				
				amount = amount.add(new BigDecimal("1.5").multiply(new BigDecimal(days - 2)));
			}
		return amount;
	}

}
