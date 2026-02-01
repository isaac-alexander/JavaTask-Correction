// 26. Write a Java program to create a class called "Event" with attributes for event name, date, and location. Create subclasses "Seminar" and "MusicalPerformance" that add specific attributes like number of speakers for seminars and performer list for concerts. Implement methods to display event details and check for conflicts in the event schedule.


public class Event {

    private String name;
    private String date;     // kept as String for simplicity
    private String location;

    public Event(String name, String date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
    }

    public void displayDetails() {
        System.out.println("Event Name: " + this.name);
        System.out.println("Date: " + this.date);
        System.out.println("Location: " + this.location);
    }

    // Check if two events conflict (same date and location)
    public void hasConflict(Event otherEvent) {
        if (otherEvent.date.equals(this.date) && otherEvent.location.equals(this.location)) {
            System.out.println("Conflict: Both events are scheduled on "
                    + otherEvent.date + " at " + otherEvent.location);
        } else {
            System.out.println("No conflict: Events are scheduled at different times or places.");
        }
    }
}
