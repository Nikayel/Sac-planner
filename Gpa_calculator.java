import java.util.ArrayList;

public class Gpa_calculator {

    // Method to map percentage grades to GPA on a 4.0 scale
    private static double mapGradeToGPA(int grade) {
        if (grade >= 90) return 4.0;
        else if (grade >= 80) return 3.0;
        else if (grade >= 70) return 2.0;
        else if (grade >= 60) return 1.0;
        else return 0.0;
    }

    // Method to calculate unweighted GPA
    public static double calculateUnweightedGPA(ArrayList<Integer> grades) {
        if (grades.isEmpty()) return 0.0;

        double totalGPA = 0.0;
        for (int grade : grades) {
            double gpa = mapGradeToGPA(grade);  // Convert grade to GPA before summing
            totalGPA += gpa;
            System.out.println("Grade: " + grade + " -> GPA: " + gpa);  // Debugging output
        }
        return Math.round((totalGPA / grades.size()) * 100.0) / 100.0;
    }

    // Method to calculate weighted GPA
    public static double calculateWeightedGPA(ArrayList<Integer> grades, ArrayList<Double> weights) {
        if (grades.isEmpty() || weights.isEmpty() || grades.size() != weights.size()) return 0.0;

        double totalWeightedGPA = 0.0;
        double totalWeight = 0.0;

        for (int i = 0; i < grades.size(); i++) {
            double gpa = mapGradeToGPA(grades.get(i));  // Convert grade to GPA before calculating
            totalWeightedGPA += gpa * weights.get(i);
            totalWeight += weights.get(i);
            System.out.println("Grade: " + grades.get(i) + " -> GPA: " + gpa + " with weight: " + weights.get(i));  // Debugging output
        }

        return totalWeight > 0 ? Math.round((totalWeightedGPA / totalWeight) * 100.0) / 100.0 : 0.0;
    }
}
