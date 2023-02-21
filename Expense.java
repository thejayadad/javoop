import java.util.Scanner;

public class Expense {
    private String name;
    private String year;
    private int cost;

    public Expense(){
        System.out.println("Welcome to Student Checkout!");
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name? ");
        this.name = scan.nextLine();
        System.out.println("What is your grade level?");
        this.year = scan.nextLine();
        System.out.println("What is the total cost for all supplies?");
        this.cost = scan.nextInt();


    }

    //DORM STUDENT
    public void dormStay(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many weeks did you stay in the door?");
        int numWeeks = scan.nextInt();
        System.out.println("How much is your weekly expenses?");
        int weeklyExpenses = scan.nextInt();
        System.out.println("Cost of room and board?");
        int roomExpense = scan.nextInt();
        

    }
}
