import java.util.Scanner;

// Custom exception class
class WrongAge extends Exception {
    // Parameterized constructor with user-defined message
    public WrongAge(String message) {
        super(message);
    }
}

// Base class
class Father {
    private int fatherAge;

    // Constructor for Father class
    public Father() throws WrongAge {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter father's age: ");
        fatherAge = s.nextInt();
        if (fatherAge < 0)
            throw new WrongAge("Age cannot be negative");
    }

    // Method to display father's age
    public void display() {
        System.out.println("Father's age: " + fatherAge);
    }
}

// Derived class
class Son extends Father {
    private int sonAge;

    // Constructor for Son class
    public Son() throws WrongAge {
        super(); // Call to superclass constructor
        Scanner s = new Scanner(System.in);
        System.out.print("Enter son's age: ");
        sonAge = s.nextInt();
        if (sonAge >= super.fatherAge)
            throw new WrongAge("Son's age cannot be greater than father's age");
        else if (sonAge < 0)
            throw new WrongAge("Age cannot be negative");
    }

    // Method to display son's age
    public void display() {
        super.display(); // Call to superclass method
        System.out.println("Son's age: " + sonAge);
    }
}

// Main class
public class ExceptionHandlingInheritance {
    public static void main(String[] args) {
        try {
            // Creating Son object
            Son son = new Son();
            // Displaying son's age
            son.display();
        } catch (WrongAge e) {
            // Handling the custom exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}
