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
        System.out.println("4. Physics");
        System.out.println("5. Mathematics");
        System.out.println("6. Chemistry");
        System.out.println("7. Criminal Justice");
        System.out.println("8. Nursing");
        System.out.println("9. Computer Engineering");
        System.out.println("10. Civil Engineering");
        System.out.println("11. Geography");
        System.out.println("12. Geology");
        System.out.println("13. Design");
        System.out.println("14. Art");
        System.out.println("15. English");
        System.out.println("16. Music");
        System.out.println("17. Philosophy");
        System.out.println("18. Phsychology");
        System.out.println("19. Kinesiology");
        System.out.println("20. Biological Sciences");
        System.out.print("Enter your choice (1-20): ");
        int degreeChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Degree degree = new Degree();
        switch (degreeChoice) {
            case 1:
                degree.addClass(new Class("Introduction to Programming"));
                degree.addClass(new Class("Data Structures"));
                degree.addClass(new Class("Operating Systems"));
                degree.addClass(new Class("Computer Organization"));
                degree.addClass(new Class("Senior Project"));
                break;
            case 2:
                degree.addClass(new Class("Statics"));
                degree.addClass(new Class("Dynamics"));
                degree.addClass(new Class("Thermodynamics"));
                degree.addClass(new Class("Machinery Design"));
                degree.addClass(new Class("Heat Transfer"));
                break;
            case 3:
                degree.addClass(new Class("Financial Accounting"));
                degree.addClass(new Class("Microeconomics"));
                degree.addClass(new Class("Marketing Principles"));
                degree.addClass(new Class("Operations Management"));
                degree.addClass(new Class("Strategic Management"));
                break;
            case 4:
                degree.addClass(new Class("Classical Mechanics"));
                degree.addClass(new Class("Electricity and Magnetism"));
                degree.addClass(new Class("Quantum Mechanics"));
                degree.addClass(new Class("Scientific Computing"));
                degree.addClass(new Class("Electronics and Instrumentation"));
                break;
            case 5:
                degree.addClass(new Class("Linear Algebra"));
                degree.addClass(new Class("Combinatrics"));
                degree.addClass(new Class("Vector Analysis"));
                degree.addClass(new Class("Set Theory"));
                degree.addClass(new Class("Modern Algebra"));
                break;
            case 6:
                degree.addClass(new Class("Organic Synthesis"));
                degree.addClass(new Class("Chemical Instrumentation"));
                degree.addClass(new Class("General Biochemistry"));
                degree.addClass(new Class("Organic Chemistry"));
                degree.addClass(new Class("Quantitative Analysis"));
                break;
            case 7:
                degree.addClass(new Class("Crime and Punishment"));
                degree.addClass(new Class("Police and Society"));
                degree.addClass(new Class("Fundamentals of Corrections"));
                degree.addClass(new Class("Law of Crimes"));
                degree.addClass(new Class("Investigative Techniques"));
                break;
            case 8:
                degree.addClass(new Class("Introduction to Professional Nursing"));
                degree.addClass(new Class("Mental Health Nursing"));
                degree.addClass(new Class("Nursing Care of Adults"));
                degree.addClass(new Class("Nursing the Childbearing Family"));
                degree.addClass(new Class("Community Health Nursing"));
                break;
            case 9:
                degree.addClass(new Class("Operating System Principles"));
                degree.addClass(new Class("Electronics"));
                degree.addClass(new Class("Embedded Systems Design"));
                degree.addClass(new Class("Network Analysis"));
                degree.addClass(new Class("Computer Interfacing"));
                break;
            case 10:
                degree.addClass(new Class("Engineering Geology"));
                degree.addClass(new Class("Water Resources Engineering"));
                degree.addClass(new Class("Hydraulics Laboratory"));
                degree.addClass(new Class("Transportation Engineering"));
                degree.addClass(new Class("Soil Mechanics"));
                break;
            case 11:
                degree.addClass(new Class("Cartography"));
                degree.addClass(new Class("Remote Sensing"));
                degree.addClass(new Class("Applied GIS"));
                degree.addClass(new Class("Urban Geography"));
                degree.addClass(new Class("Climate"));
                break;
            case 12:
                degree.addClass(new Class("Paleontology"));
                degree.addClass(new Class("Volcanology"));
                degree.addClass(new Class("Geochemistry"));
                degree.addClass(new Class("Marine Geology"));
                degree.addClass(new Class("Engineering Geology"));
                break;
            case 13:
                degree.addClass(new Class("Design and Thinking"));
                degree.addClass(new Class("World Design and Visual Culture"));
                degree.addClass(new Class("Urban Design and Society"));
                degree.addClass(new Class("Visual Basics"));
                degree.addClass(new Class("Design Fundamentals"));
                break;
            case 14:
                degree.addClass(new Class("Advanced Drawing"));
                degree.addClass(new Class("Advanced Painting"));
                degree.addClass(new Class("Modern Art"));
                degree.addClass(new Class("Ceramics"));
                degree.addClass(new Class("Digital Printmaking"));
                break;
            case 15:
                degree.addClass(new Class("Advanced Composition"));
                degree.addClass(new Class("Medieval Literature"));
                degree.addClass(new Class("British Literature"));
                degree.addClass(new Class("English Language History"));
                degree.addClass(new Class("The English Renaissance"));
                break;
            case 16:
                degree.addClass(new Class("Music Theory"));
                degree.addClass(new Class("Instrumentation and Arranging"));
                degree.addClass(new Class("Musicianship"));
                degree.addClass(new Class("Music in World Cultures"));
                degree.addClass(new Class("MIDI Sequencing and Notation"));
                break;
            case 17:
                degree.addClass(new Class("Deductive Logic"));
                degree.addClass(new Class("History of Ethics"));
                degree.addClass(new Class("Metaphysics"));
                degree.addClass(new Class("Knowledge and Understanding"));
                degree.addClass(new Class("Ethical Theory"));
                break;
            case 18:
                degree.addClass(new Class("Neuroscience"));
                degree.addClass(new Class("Cross-Cultural Psychology"));
                degree.addClass(new Class("Behavorial Research Methods"));
                degree.addClass(new Class("Evolutionary Psychology"));
                degree.addClass(new Class("Methods of Psychology"));
                break;
            case 19:
                degree.addClass(new Class("Sport Pedagogy"));
                degree.addClass(new Class("Human Anatomy and Physiology"));
                degree.addClass(new Class("Sociology of Sport"));
                degree.addClass(new Class("Motor Learning and Control"));
                degree.addClass(new Class("Sport and Exercise Psychology"));
                break;
            case 20:
                degree.addClass(new Class("General Ecology"));
                degree.addClass(new Class("General Genetics"));
                degree.addClass(new Class("Neuroanatomy"));
                degree.addClass(new Class("General Microbiology"));
                degree.addClass(new Class("Molecular Cell Biology"));
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Computer Science. Press exit if this isn't the degree you want to pursue");
                degree.addClass(new Class("Introduction to Programming"));
                degree.addClass(new Class("Data Structures"));
                degree.addClass(new Class("Operating Systems"));
                degree.addClass(new Class("Computer Organization"));
                degree.addClass(new Class("Senior Project"));
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
                    Advisor advisor = new Advisor();
                    advisor.addAdvisor("Dr. Smith", "smith@university.edu");
                    advisor.addAdvisor("Dr. Johnson", "johnson@university.edu");
                    advisor.addAdvisor("Dr. Lee", "lee@university.edu");

                    System.out.println("\n--- Advisor Menu ---");
                    System.out.println("1. Get suggested classes");
                    System.out.println("2. View advisor contact information");
                    System.out.print("Choose an option: ");
                    int advisorChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (advisorChoice == 1) {
                        System.out.println("\nClass Suggestions:");
                        advisor.suggestClasses(degree);
                    } else if (advisorChoice == 2) {
                        System.out.println("\nAdvisor Contact Information:");
                        advisor.displayAdvisors();
                    } else {
                        System.out.println("Invalid option.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Semester Input Menu ---");

                    // Updated semester number input
                    System.out.print("Enter the semester year: ");
                    String semesterNumberInput = scanner.nextLine(); // Read input as a string
                    int semesterNumber;
                    try {
                        semesterNumber = Integer.parseInt(semesterNumberInput); // Try parsing as an integer
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Defaulting to semester number 1.");
                        semesterNumber = 1; // Default value
                    }

                    System.out.print("Enter the semester name: ");
                    String semesterName = scanner.nextLine();

                    Semester semester = new Semester(semesterNumber, semesterName);
                    boolean addingClasses = true;

                    while (addingClasses) {
                        System.out.println("\n--- Add Classes ---");
                        System.out.println("1. Add a class");
                        System.out.println("2. Finish semester");
                        System.out.println("3. View previously entered semesters and their classes");
                        System.out.print("Choose an option: ");
                        int subChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        switch (subChoice) {
                            case 1:
                                System.out.print("Enter the class name: ");
                                String className = scanner.nextLine();
                                System.out.print("Enter your grade for " + className + " (0-100): ");
                                int grade = scanner.nextInt();
                                scanner.nextLine(); // Consume newline
                                semester.addGrade(className, grade);

                                // Check if it's a required class and pass it
                                for (int i = 0; i < degree.requiredClasses.size(); i++) {
                                    Class requiredClass = degree.requiredClasses.get(i);
                                    if (requiredClass.getClassName().equalsIgnoreCase(className)) {
                                        if (grade >= 60) { // Assuming 60 is the passing grade
                                            System.out.println("You passed " + requiredClass.getClassName() + "!");
                                            degree.requiredClasses.remove(i);
                                        } else {
                                            System.out.println("You failed " + requiredClass.getClassName() + "! Retake the class.");
                                        }
                                        break;
                                    }
                                }
                                break;

                            case 2:
                                semesters.add(semester);
                                addingClasses = false;
                                break;

                            case 3:
                                System.out.println("\nPreviously Entered Semesters:");
                                for (Semester sem : semesters) {
                                    System.out.println("Semester: " + sem.semesterName);
                                    System.out.println("Classes: " + sem.grades);
                                }
                                break;

                            default:
                                System.out.println("Invalid choice.");
                                break;
                        }
                    }
                    break;


                case 4:
                    System.out.println("\n--- GPA Display ---");
                    System.out.println("1. Unweighted GPA");
                    System.out.println("2. Weighted GPA");
                    System.out.print("Choose an option: ");
                    int gpaChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (gpaChoice == 1) {
                        System.out.println("Your overall unweighted GPA: " +
                                semesters.stream()
                                        .mapToDouble(Semester::GPA)
                                        .average()
                                        .orElse(0.0));
                    } else if (gpaChoice == 2) {
                        System.out.println("Enter weights for each semester:");
                        ArrayList<Double> weights = new ArrayList<>();
                        for (Semester sem : semesters) {
                            System.out.println("Semester: " + sem.semesterName);
                            System.out.print("Weight: ");
                            weights.add(scanner.nextDouble());
                        }
                        double totalWeightedGPA = 0.0;
                        for (int i = 0; i < semesters.size(); i++) {
                            totalWeightedGPA += semesters.get(i).GPA() * weights.get(i);
                        }
                        double weightedGPA = totalWeightedGPA / weights.stream().mapToDouble(w -> w).sum();
                        System.out.println("Your overall weighted GPA: " + weightedGPA);
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }

        scanner.close();
    }
}
