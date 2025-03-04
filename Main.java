import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by PRN");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Search Student by Branch");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(scan.nextLine());

            // Placeholder for switch logic (to be added in future commits)

        } while (choice != 8);

                                switch (choice) {
                case 1:
                                switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter PRN: ");
                    int prn = Integer.parseInt(scan.nextLine());
                    System.out.print("Enter Branch: ");
                    String branch = scan.nextLine();
                    System.out.print("Enter Batch: ");
                    String batch = scan.nextLine();
                    System.out.print("Enter CGPA: ");
                    float cgpa = Float.parseFloat(scan.nextLine());

                    operations.addStudent(new Student(name, prn, branch, batch, cgpa));
                    break;
            }


                case 2:
                    operations.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter PRN to search: ");
                    prn = Integer.parseInt(scan.nextLine());
                    Student student = operations.searchStudentByPRN(prn);
                    if (student != null)
                        student.display();
                    else
                        System.out.println("Student not found.");
                    break;
            }



        scan.close();
    }
}
