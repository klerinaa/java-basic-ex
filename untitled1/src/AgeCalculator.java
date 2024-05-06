import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter you name:");
        String name=scanner.nextLine();
        System.out.println("Please enter your birthday (yyyy-mm-dd):");
        String birthdayString=scanner.nextLine();
        LocalDate birthday=LocalDate.parse(birthdayString);
        LocalDate currentDate=LocalDate.now();
        Period age =Period.between(birthday,currentDate);
        System.out.println("Hello, "+name+" ! Your are "+age.getYears()+" years old.");


    }
}