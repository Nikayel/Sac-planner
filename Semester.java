import java.util.ArrayList;

public class Semester {
    public int semesterNumber;
    public String semesterName;
    public ArrayList<Integer> grades;

    // Constructor
    public Semester(int semesterNumber, String semesterName) {
        this.semesterNumber = semesterNumber;
        this.semesterName = semesterName;
        grades = new ArrayList<>();
    }

    // Add a grade for the semester
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // Check pass or fail (assuming pass is >= 60)
    public boolean passOrFail() {
        for (int grade : grades) {
            if (grade < 60) return false;
        }
        return true;
    }

    // Calculate GPA (dummy implementation: average of grades)
    public double GPA() {
        if (grades.isEmpty()) return 0.0;
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return Math.round((total / (double) grades.size()) * 100.0) / 100.0;
    }

    // Display remaining classes (dummy implementation)
    public void remainingClasses(Degree degree) {
        System.out.println("Remaining Classes:");
        degree.listRequiredClasses(); // Assuming the degree stores remaining classes
    }
}
