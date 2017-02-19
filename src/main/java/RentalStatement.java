
import java.util.ArrayList;
import java.util.Collection;


public class RentalStatement {

	Collection<Rental> rentals = new ArrayList<Rental>();

	public void add(Rental toAdd) {

		rentals.add(toAdd);
	}

	public void print() {

		for (Rental list : rentals)
			System.out.println("  " + list.getPriceCode() + "  " + list.getTitle() + "  " + list.getDays() + "  "
					+ list.calculateFees());

	}

}
