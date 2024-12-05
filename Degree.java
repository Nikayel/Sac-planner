import java.util.ArrayList;

public class Degree {
    ArrayList<Class> requiredClasses;

    // Constructor to initialize the requiredClasses list
    public Degree() {
        requiredClasses = new ArrayList<>();
    }

    public void addClass(Class newClass) {
        requiredClasses.add(newClass);
    }

    public void listRequiredClasses() {
        for (Class c : requiredClasses) {
            System.out.println("Class Name: " + c.getClassName());
        }
    }
    public ArrayList<Class> getRequiredClasses() {
        return requiredClasses;
    }
}
