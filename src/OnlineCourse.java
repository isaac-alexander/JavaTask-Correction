// Create a subclass "OnlineCourse" that adds attributes for platform and duration. Implement methods to display course details and check if the course is eligible for a certificate based on duration

public class OnlineCourse extends Course {

    private String platform;
    private int duration; // duration in hours

    public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Duration: " + duration + " hours");
    }

    // Check if eligible for certificate
    public void isEligibleForCertificate() {
        if (duration >= 10) {
            System.out.println("You are eligible for a certificate.");
        } else {
            System.out.println("You are not eligible for a certificate.");
        }
    }
}
