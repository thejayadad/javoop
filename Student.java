import java.util.Scanner;
public class Student {
private String firstName;
private String lastName;
private int gradeYear;
private String studentId;
private String courses ="";
private int tutionBalance = 0;
private static int costOfCourse = 500;
private static int id = 1001;

public Student(){
    Scanner scan = new Scanner(System.in);
    System.out.println("***WELCOME TO STATE UNIVERSITY***");
    System.out.println("Enter First Name: ");
    this.firstName = scan.nextLine();
    System.out.println("Enter Last Name: ");
    this.lastName = scan.nextLine();
    System.out.println("Grade Level: ");
    System.out.println("1).. Freshman");
    System.out.println("2).. Sophmore");
    System.out.println("3).. Junior");
    System.out.println("4).. Senior");
    this.gradeYear = scan.nextInt();
    System.out.println("First Name: " + firstName);
    System.out.println("Last Name: " + lastName);
    System.out.println("Grade Level: " + gradeYear);
    setStudentId();
    System.out.println("Student ID: " + studentId);


}
//STUDENT ID
private void setStudentId(){
    id++;
    this.studentId = " " + id;
}
 //COURSE ENROLLMENT
 public void enroll(){
    Scanner scan = new Scanner(System.in);
    do {
        System.out.println("Course Enrollment (press 'q' to quit)");
        String res = scan.nextLine();
        if( !res.equals("q")){
            courses = courses + " " + res;
            tutionBalance = tutionBalance + costOfCourse;
        } else{
            break;
        }
    } while( 1 !=0);
    System.out.println("Enrolled: " + courses);
    System.out.println("Tution Balance: " + tutionBalance);
}
//BALANCE
public void viewBalance(){
    System.out.println("Your Balance $: " + tutionBalance);
}
//PAY TUTION BALANCE
public void payTution(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Payment Amount: ");
    int payment = scan.nextInt();
    tutionBalance = tutionBalance - payment;
    System.out.println("Thank you for your payment of " + payment);
    viewBalance();
}
//STUDENT STATUS
public String studentStatus(){
    return "Name: " + firstName + " Last Name: " + lastName +
        "\n Grade Level: " + gradeYear +
        "\n Courses Enrolled: " + courses +
        "\n Balance $" + tutionBalance;
}



}
