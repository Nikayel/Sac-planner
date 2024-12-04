import java.util.ArrayList;

public class Gpa_calculator {
    // Method to calculate unweighted GPA
    public static double calculateUnweightedGPA(ArrayList<Integer> grades) {
        if (grades.isEmpty()) return 0.0;
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return Math.round((total / (double) grades.size()) * 100.0) / 100.0;
    }

    // Method to calculate weighted GPA
    public static double calculateWeightedGPA(ArrayList<Integer> grades, ArrayList<Double> weights) {
        if (grades.isEmpty() || weights.isEmpty() || grades.size() != weights.size()) return 0.0;

        double totalWeightedScore = 0.0;
        double totalWeight = 0.0;

        for (int i = 0; i < grades.size(); i++) {
            totalWeightedScore += grades.get(i) * weights.get(i);
            totalWeight += weights.get(i);
        }

        return totalWeight > 0 ? Math.round((totalWeightedScore / totalWeight) * 100.0) / 100.0 : 0.0;
    }
}
