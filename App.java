import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        //declare the variables used
        int day, year, month;
        String firstName, lastName;
        Date dateOfBirth;
        Calendar cal;
        HeartRates HR;
        Scanner input = new Scanner(System.in);

        //Get The persons information
        System.out.print("Enter year of birth: ");
        year = input.nextInt();
        System.out.print("Enter month of birth: ");
        month = input.nextInt();
        System.out.print("Enter day of birth: ");
        day = input.nextInt();

        //create a Date Object
        cal = Calendar.getInstance();
        cal.set(Calendar.DATE, day);
        cal.set(Calendar.MONTH, month - 1); // subtracted 1 because 0 is jan and 11 is dec
        cal.set(Calendar.YEAR, year);

        dateOfBirth = cal.getTime();
        
        System.out.print("Enter first name: ");
        firstName = input.next();
        System.out.print("Enter last name: ");
        lastName = input.next();

        //create a HeartRates Object;
        HR = new HeartRates(firstName, lastName, dateOfBirth);

        //print out the information
        System.out.println("Name: "+ HR.getFirstName() + " " + HR.getLastName());
        System.out.println("Date of Birth: " + HR.getDateOfBirth());
        System.out.println("Age: " + HR.getAge());
        System.out.println("Maximum Heart Rate: " + HR.getMaximumHR());
        System.out.println("Target Heart Rates: " + HR.getTargetHR());

        input.close();
    }
}
