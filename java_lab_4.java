import java.util.Scanner;

class InputScanner {
    Scanner s;

    InputScanner() {
        s = new Scanner(System.in);
    }
}

abstract class shape extends InputScanner {
    double a;
    double b;
    double r;

    abstract void getInput();

    abstract void DisplayArea();
}

class Rectangle extends shape {
    void getInput() {
        System.out.println("Enter the sides of the rectangle");
        a = s.nextDouble();
        b = s.nextDouble();
    }

    void DisplayArea() {
        System.out.println("The area of the rectangle is " + a * b + "");
    }
}

class Triangle extends shape {
    void getInput() {
        System.out.println("Enter the sides of the triangle");
        a = s.nextDouble();
        b = s.nextDouble();
    }

    void DisplayArea() {
        System.out.println("The area of the triangle is " + (0.5 * a * b) + "");
    }
}

class Circle extends shape {
    void getInput() {
        System.out.println("Enter the radius of the circle");
        r = s.nextDouble();
    }

    void DisplayArea() {
        System.out.println("The area of the circle  is " + 3.14 * r * r + "");
    }
}

class Shapemain {
    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Circle c = new Circle();
        r.getInput();
        r.DisplayArea();
        t.getInput();
        t.DisplayArea();
        c.getInput();
        c.DisplayArea();
        System.out.println("Sohan A R-1BM22CS285");

    }
}
/*
 * java -cp /tmp/qYrVKCZE0d Shapemain
 * Enter the sides of the rectangle
 * 6
 * 3
 * The area of the rectangle is 18.0
 * Enter the sides of the triangle
 * 5
 * 3
 * The area of the triangle is 7.5
 * Enter the radius of the circle
 * 1
 * The area of the circle is 3.14
 * Sohan A R-1BM22CS285
 * 
 */