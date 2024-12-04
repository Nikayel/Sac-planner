import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create user
        System.out.println("Welcome to the Degree Planner!");
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        User user = new User(userName);

        // Determine the degree
        System.out.println("Select your degree:");
        System.out.println("1. Computer Science");
        System.out.println("2. Mechanical Engineering");
        System.out.println("3. Business Administration");
        System.out.print("Enter your choice (1/2/3): ");
        int degreeChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Degree degree = new Degree();
        switch (degreeChoice) {
            case 1:
                degree.addClass(new Class("Introduction to Programming", "B"));
                degree.addClass(new Class("Data Structures", "B"));
                degree.addClass(new Class("Operating Systems", "C"));
                break;
            case 2:
                degree.addClass(new Class("Statics", "B"));
                degree.addClass(new Class("Dynamics", "B"));
                degree.addClass(new Class("Thermodynamics", "C"));
                break;
            case 3:
                degree.addClass(new Class("Financial Accounting", "C"));
                degree.addClass(new Class("Microeconomics", "B"));
                degree.addClass(new Class("Marketing Principles", "C"));
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Computer Science.");
                degree.addClass(new Class("Introduction to Programming", "B"));
                degree.addClass(new Class("Data Structures", "B"));
                degree.addClass(new Class("Operating Systems", "C"));
                break;
        }

        ArrayList<Semester> semesters = new ArrayList<>();

        // Menu system
        boolean running = true;
        while (running) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Display required classes");
            System.out.println("2. Talk to an advisor");
            System.out.println("3. Class input for the semester");
            System.out.println("4. Display GPA");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("\nRequired Classes:");
                    degree.listRequiredClasses();
                    break;

                case 2:
                    System.out.println("\nAdvisors Available:");
                    // Assume we have advisors available to display
                    System.out.println("Advisors not yet implemented fully.");
                    break;

                case 3:
                    System.out.println("\n--- Semester Input Menu ---");
                    System.out.print("Enter the semester number: ");
                    int semesterNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter the semester name: ");
                    String semesterName = scanner.nextLine();

                    Semester semester = new Semester(semesterNumber, semesterName);
                    boolean addingClasses = true;

                    while (addingClasses) {
                        System.out.println("\n--- Add Classes ---");
                        System.out.println("1. Add a class");
                        System.out.println("2. Finish semester");
                        System.out.println("If all required classes are done press 3 to earn degree");
                        System.out.print("Choose an option: ");
                        int subChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        switch (subChoice) {
                            case 1:
                                System.out.println("Required classes left for degree");
                                degree.listRequiredClasses();
                                System.out.print("Enter the class name: ");
                                String className = scanner.nextLine();
                                System.out.print("Enter your grade for " + className + " (0-100): ");
                                int grade = scanner.nextInt();
                                scanner.nextLine(); // Consume newline
                                semester.addGrade(grade);

                                // Check if it's a required class and pass it
                                for (int i = 0; i < degree.requiredClasses.size(); i++) {
                                    Class requiredClass = degree.requiredClasses.get(i);
                                    if (requiredClass.getClassName().equalsIgnoreCase(className)) {
                                        if (grade >= 60) { // Assuming 60 is the passing grade
                                            System.out.println("You passed " + requiredClass.getClassName() + "!");
                                            degree.requiredClasses.remove(i);
                                        }
                                        else {
                                            System.out.println("You failed " + requiredClass.getClassName() + "!" + "retake the class in order to get degree");
                                        }

                                        break;
                                    }
                                }

                                break;

                            case 2:
                                System.out.println("\nAdvisors Available:");
                                Advisor advisor = new Advisor();
                                advisor.addAdvisor("Dr. Smith");
                                advisor.addAdvisor("Dr. Johnson");
                                advisor.addAdvisor("Dr. Lee");

                                for (int i = 0; i < advisor.advisorNames.size(); i++) {
                                    System.out.println((i + 1) + ". " + advisor.advisorNames.get(i));
                                }

                                System.out.print("\nWould you like a class suggestion? (yes/no): ");
                                String advisorChoice = scanner.nextLine();
                                if (advisorChoice.equalsIgnoreCase("yes")) {
                                    System.out.println("\nClass Suggestions:");
                                    advisor.suggestClasses(degree);
                                }
                                break;

                            case 3:
                                if(degree.requiredClasses.size() > 0) {
                                    System.out.println("you still have the required classes left");
                                    degree.listRequiredClasses();
                                    running = true;
                                }
                                else {
                                    System.out.println("\nCongratulations " + user.getUserName() + "! You have completed your degree.");
                                    System.out.println("Final GPA: " + semesters.stream()
                                            .mapToDouble(Semester::GPA)
                                            .average()
                                            .orElse(0.0));
                                    addingClasses = false;
                                    running = false;
                                }
                                break;
                            case 4:
                                // Display GPA for all semesters
                                System.out.println("\n--- GPA Display ---");
                                System.out.println("Choose GPA type:");
                                System.out.println("1. Unweighted GPA");
                                System.out.println("2. Weighted GPA");
                                System.out.print("Enter your choice (1/2): ");
                                int gpaChoice = scanner.nextInt();
                                scanner.nextLine(); // Consume newline

                                if (gpaChoice == 1) {
                                    double totalUnweightedGpa = 0.0;
                                    int totalSemesters = semesters.size();
                                    for (Semester sem : semesters) {
                                        double semesterUnweightedGpa = Gpa_calculator.calculateUnweightedGPA(sem.grades);
                                        System.out.println("Unweighted GPA for " + sem.semesterName + ": " + semesterUnweightedGpa);
                                        totalUnweightedGpa += semesterUnweightedGpa;
                                    }
                                    double finalUnweightedGpa = totalSemesters > 0 ? totalUnweightedGpa / totalSemesters : 0.0;
                                    System.out.println("Your overall unweighted GPA: " + finalUnweightedGpa);
                                } else if (gpaChoice == 2) {
                                    ArrayList<Double> weights = new ArrayList<>();
                                    System.out.println("Enter the weight for each class:");
                                    for (Semester sem : semesters) {
                                        System.out.println("Semester: " + sem.semesterName);
                                        for (int i = 0; i < sem.grades.size(); i++) {
                                            System.out.print("Weight for class " + (i + 1) + ": ");
                                            double weight = scanner.nextDouble();
                                            weights.add(weight);
                                        }
                                    }

                                    double totalWeightedGpa = 0.0;
                                    int totalSemesters = semesters.size();
                                    for (Semester sem : semesters) {
                                        double semesterWeightedGpa = Gpa_calculator.calculateWeightedGPA(sem.grades, weights);
                                        System.out.println("Weighted GPA for " + sem.semesterName + ": " + semesterWeightedGpa);
                                        totalWeightedGpa += semesterWeightedGpa;
                                    }
                                    double finalWeightedGpa = totalSemesters > 0 ? totalWeightedGpa / totalSemesters : 0.0;
                                    System.out.println("Your overall weighted GPA: " + finalWeightedGpa);
                                } else {
                                    System.out.println("Invalid choice. Returning to menu.");
                                }
                                break;
                        }


                    }


                    break;
            }
        }

        scanner.close();
    }
}