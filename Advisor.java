import java.util.ArrayList;

public class Advisor {
    public ArrayList<String> advisorNames;
    public ArrayList<String> advisorEmails;

    // Constructor
    public Advisor() {
        advisorNames = new ArrayList<>();
        advisorEmails = new ArrayList<>();
    }

    // Add an advisor with name and email
    public void addAdvisor(String advisorName, String advisorEmail) {
        advisorNames.add(advisorName);
        advisorEmails.add(advisorEmail);
    }

    // Display advisors' names and contact information
    public void displayAdvisors() {
        System.out.println("Advisors and Contact Information:");
        for (int i = 0; i < advisorNames.size(); i++) {
            System.out.println((i + 1) + ". " + advisorNames.get(i) + " (Email: " + advisorEmails.get(i) + ")");
        }
    }

    // Suggest classes from required classes list
    public void suggestClasses(Degree degree) {
        System.out.println("\nClass Suggestions:");
        int suggestions = 0;
        for (Class requiredClass : degree.requiredClasses) {
            if (suggestions >= 4) break; // Limit to 4 suggestions
            System.out.println("- " + requiredClass.getClassName());
            suggestions++;
        }
    }
}
