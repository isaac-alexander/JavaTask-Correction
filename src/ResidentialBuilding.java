public class ResidentialBuilding extends Building {

    int numberOfApartments;
    int rentPerApartment;

    public ResidentialBuilding(String address, int numberOfFloors, int totalArea, int numberOfApartments, int rentPerApartment) {
        super(address, numberOfFloors, totalArea);
        this.numberOfApartments = numberOfApartments;
        this.rentPerApartment = rentPerApartment;
    }

    public int calculateTotalRent() {
        return numberOfApartments * rentPerApartment;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Apartments: " + numberOfApartments);
        System.out.println("Total Rent: $" + calculateTotalRent());
    }
}

