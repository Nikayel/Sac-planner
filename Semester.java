import java.util.ArrayList;

public class Semester {
    public int semesterYear;
    public String semesterName;
    public ArrayList<Integer> grades;
    public ArrayList<String> classes;

    // Constructor
    public Semester(int semesterYear, String semesterName) {
        this.semesterYear = semesterYear;
        this.semesterName = semesterName;
        grades = new ArrayList<>();
        classes = new ArrayList<>();
    }

    // Add a grade for the semester
    public void addGrade(String className, int grade) {
        grades.add(grade);
        classes.add(className);
    }

    // Check pass or fail (assuming pass is >= 70)
    public boolean passOrFail() {
        for (int grade : grades) {
            if (grade < 70) return false;
        }
        return true;
    }

    // Display classes and grades for the semester
    public void displayClasses() {
        System.out.println("Classes for Semester " + semesterYear + " (" + semesterName + "):");
        for (int i = 0; i < classes.size(); i++) {
            System.out.println("- " + classes.get(i) + ": " + grades.get(i));
        }
    }

    // Calculate the GPA for the semester using Gpa_calculator
    public double GPA() {
        return Gpa_calculator.calculateUnweightedGPA(grades);
    }
}
