public class User {
    private String userName;

    // Constructor to create a user
    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    // Method to get the advisor's contact information
    public void getAdvisorContact() {
        Advisor advisor = Advisor.getInstance();  // Get the Singleton instance
        advisor.displayAdvisors();  // Display the list of advisors with their emails
    }
}