public class CommercialBuilding extends Building {
    int officeSpace;
    int rentPerOfficeSpace;

    public CommercialBuilding(String address, int numberOfFloors, int totalArea, int officeSpace, int rentPerOfficeSpace) {
        super(address, numberOfFloors, totalArea);
        this.officeSpace = officeSpace;
        this.rentPerOfficeSpace = rentPerOfficeSpace;
    }

    public int calculateTotalRent() {
        return officeSpace * rentPerOfficeSpace;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Office Space: " + officeSpace + " sqm");
        System.out.println("Total Rent: $" + calculateTotalRent());
    }
}

