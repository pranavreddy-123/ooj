
class CollegeRunnable implements Runnable {
    public void run() {
        while (true) {
            try {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000); // Sleep for 10 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DepartmentRunnable implements Runnable {
    public void run() {
        while (true) {
            try {
                System.out.println("CSE");
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class java_lab_8 {
    public static void main(String[] args) {
        // Creating instances of runnables
        Runnable collegeRunnable = new CollegeRunnable();
        Runnable departmentRunnable = new DepartmentRunnable();

        // Creating threads using runnables
        Thread collegeThread = new Thread(collegeRunnable);
        Thread departmentThread = new Thread(departmentRunnable);

        // Starting threads
        collegeThread.start();
        departmentThread.start();
    }
}
