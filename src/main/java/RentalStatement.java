
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

public class RentalStatement {

	Collection<Rental> rentals = new ArrayList<Rental>();
	FileOutputStream fileOut = null;
	PrintStream toFile = null;

	public void add(Rental toAdd) {

		rentals.add(toAdd);
	}

	 public void prints() {
		  prints(toFile);
		
	 for (Rental list : rentals)
	 System.out.println(" " + list.getPriceCode() + " " + list.getTitle() + "  " + list.getDays() + " "
	 + list.calculateFees());
		 
	 }
	

	public PrintStream prints(PrintStream toFile) {

		try {
			fileOut = new FileOutputStream("PrintableStatement.txt");
			toFile = new PrintStream(fileOut);
			for (Rental list : rentals)
				toFile.println(" " + list.getPriceCode() + " " + list.getTitle() + "  " + list.getDays() + " "
						+ list.calculateFees());
		}

		catch (Exception erro) {

			System.out.println("There was an Error in printing");
		}
		return toFile;

	}
}