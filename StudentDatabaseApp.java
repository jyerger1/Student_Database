import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        // Student stu = new Student();

        // Ask how many new students we want to add
        System.out.print("Enter number of students to enroll: ");
        Scanner in = new Scanner(System.in);

        // create array for students
        // how big we want array
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students
        // students enrolling and paying tuition
        for (int n = 0; n < numOfStudents; n++) {
            // students at position n = new Student / this is how we access their methods
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();

            // this is now available outside
            // System.out.println(stu.toString());

            System.out.println(students[n].toString());

        }

        // if we needed this outside the scope
        // for(int n = 0; n < numOfStudents; n++){
        // System.out.println(students[n].toString());
        // }

        // System.out.println(students[0].toString());
        // System.out.println(students[1].toString());
        // System.out.println(students[2].toString());
    }
}