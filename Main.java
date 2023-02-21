import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //STUDENT MANAGEMENT PROGRAM
        Scanner scan = new Scanner(System.in);


        //ASK STUDENT NUMBER OF ENROLLMENT
        //HOLD IN ARRAY
        System.out.println("How many students do you want to enroll? ");
        int studentCount = scan.nextInt();
        Student[] students = new Student[studentCount];

        //LOOP THRU ARRAY OF STUDENTS
        for(int i = 0; i < studentCount; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTution();

        }




    }

}
