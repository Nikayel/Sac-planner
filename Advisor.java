import java.util.ArrayList;

public class Advisor {
    private static Advisor instance = null;  // Singleton instance
    private ArrayList<AdvisorInfo> advisors;  // List to hold advisor information

    // Private constructor to prevent instantiation from other classes
    private Advisor() {
        advisors = new ArrayList<>();
    }

    // Public method to get the single instance of Advisor
    public static Advisor getInstance() {
        if (instance == null) {
            instance = new Advisor();
        }
        return instance;
    }

    // Method to add an advisor with name and email
    public void addAdvisor(String name, String email) {
        advisors.add(new AdvisorInfo(name, email));
    }

    // Method to display all advisors
    public void displayAdvisors() {
        System.out.println("List of Advisors:");
        for (AdvisorInfo advisor : advisors) {
            System.out.println("Name: " + advisor.getName() + ", Email: " + advisor.getEmail());
        }
    }

    // Inner class to store advisor information (name and email)
    private class AdvisorInfo {
        private String name;
        private String email;

        public AdvisorInfo(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }
    }
    // Method to suggest classes based on the user's degree
    public void suggestClasses(Degree degree) {
        System.out.println("\nSuggested Classes for your Degree:");
        // For simplicity, suggest all the required classes
        for (Class requiredClass : degree.getRequiredClasses()) {
            System.out.println("- " + requiredClass.getClassName());
        }
    }
}
