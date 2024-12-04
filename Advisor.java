import java.util.ArrayList;

public class Advisor {
    public ArrayList<String> advisorNames;
    public ArrayList<String> advisorEmails;

    // Constructor
    public Advisor() {
        advisorNames = new ArrayList<>();
        advisorEmails = new ArrayList<>();
    }

    // Add an advisor
    public void addAdvisor(String advisorName) {
        advisorNames.add(advisorName);
    }

    // Suggest classes (dummy implementation)
    public void suggestClasses(Degree degree) {
        int suggestions = 0;
        for (Class requiredClass : degree.requiredClasses) {
            if (suggestions >= 4) break;
            System.out.println("- " + requiredClass.getClassName());
            suggestions++;
        }
    }
}
