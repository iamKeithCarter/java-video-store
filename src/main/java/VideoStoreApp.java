
public class VideoStoreApp {

	public static void main(String[] args) {

		Movie regular = new RegularMovie("WCCI", "regular");
		Movie childrens = new ChildrensMovie("Up", "childrens");
		Movie newRelease = new NewRelease("Dr Stranage", "new release");

		Rental rented = new Rental(regular, 2);
		Rental rented2 = new Rental(regular, 3);
		Rental rented3 = new Rental(regular, 5);

		Rental rented4 = new Rental(childrens, 3);
		Rental rented5 = new Rental(childrens, 4);
		Rental rented6 = new Rental(childrens, 5);

		Rental rented7 = new Rental(newRelease, 1);
		Rental rented8 = new Rental(newRelease, 5);

		RentalStatement rentals = new RentalStatement();
		
		rentals.add(rented);
		rentals.add(rented2);
		rentals.add(rented3);
		rentals.add(rented4);
		rentals.add(rented5);
		rentals.add(rented6);
		rentals.add(rented7);
		rentals.add(rented8);

		rentals.print();

	}

}
