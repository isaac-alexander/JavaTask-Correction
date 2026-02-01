import java.util.ArrayList;

public class MusicalPerformance extends Event {

    private ArrayList<String> performers = new ArrayList<>();

    public MusicalPerformance(String name, String date, String location) {
        super(name, date, location);
    }

    public void addPerformer(String performer) {
        this.performers.add(performer);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Performers:");
        for (String performer : this.performers) {
            System.out.println("- " + performer);
        }
    }
}
