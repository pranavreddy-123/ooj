
import java.util.Scanner;

class Subject {
    int marks;
    int credits;
    int points; // Added field for points
}

class Student {
    Subject[] subjects;
    String name;
    String usn;
    double sgpa;
    Scanner sc;

    public Student() {
        int i;
        subjects = new Subject[9];
        for (i = 0; i < 9; i++)
            subjects[i] = new Subject();
        sc = new Scanner(System.in);
    }

    public void inputDetails() {
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter student USN: ");
        usn = sc.nextLine();

        for (int i = 0; i < 9; i++) {
            subjects[i] = new Subject();
            System.out.println("Enter details for subject " + (i + 1));
            System.out.print("Enter marks for the subject: ");
            subjects[i].marks = sc.nextInt();
            System.out.print("Enter credits for the subject: ");
            subjects[i].credits = sc.nextInt();
        }
    }

    private int calculatePoints(int marks) {
        if (marks > 90) {
            return 10;
        } else if (marks > 80) {
            return 9;
        } else if (marks > 70) {
            return 8;
        } else if (marks > 60) {
            return 7;
        } else if (marks > 50) {
            return 6;
        } else {
            return 0; // You can modify this based on your specific grading system
        }
    }

    public void calculateSGPA() {
        double totalCredits = 0;
        double weightedSum = 0;

        for (int i = 0; i < 9; i++) {
            totalCredits += subjects[i].credits;
            subjects[i].points = calculatePoints(subjects[i].marks);
            weightedSum += subjects[i].credits * subjects[i].points;
        }

        sgpa = weightedSum / totalCredits;
    }

    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Student USN: " + usn);
        System.out.println("SGPA: " + sgpa);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.inputDetails();
        student.calculateSGPA();
        student.displayResult();
    }
}
