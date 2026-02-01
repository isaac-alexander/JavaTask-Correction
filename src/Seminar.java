public class Seminar extends Event {
    private int numberOfSpeakers;

    public Seminar(String name, String date, String location, int numberOfSpeakers) {
        super(name, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Speakers: " + this.numberOfSpeakers);
    }
}
