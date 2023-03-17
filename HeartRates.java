//import the libraries to handle time
import java.util.Date;
import java.time.*;

public class HeartRates{
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    //The HearRates Constructor
    HeartRates(String fname, String lname, Date dateOfBirth){
        this.firstName = fname;
        this.lastName = lname;
        this.dateOfBirth = dateOfBirth;
    }

    //The set Methods
    public void setFirstName(String name){
        this.firstName = name;
        System.out.println("First name was set to: " + this.getFirstName());
    }

    public void setLastName(String name){
        this.lastName = name;
        System.out.println("Last name was set to: "+ this.getLastName());
    }

    public void setDateOfBirth(Date date){
        this.dateOfBirth = date;
        System.out.println("Date was set to: " + this.getDateOfBirth());
    }

    //The get methods
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getDateOfBirth(){
        return "" + this.dateOfBirth;
    }

    //Computation methods
    public int getAge(){
        int year = Year.now().getValue();
        return year - this.dateOfBirth.getYear() - 1900; //to get current year from getYear() method minus 1900
    }

    public int getMaximumHR(){
        return 220 - this.getAge();
    }

    public String getTargetHR(){
        return "Target HeartRates: " + 0.5 * this.getMaximumHR() + " - " + 0.85 * this.getMaximumHR();
    }
}
