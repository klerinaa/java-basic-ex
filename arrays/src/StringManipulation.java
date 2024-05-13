import java.util.Locale;
import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {


        String nrtest="1010";
        int nr=Integer.parseInt(nrtest,16);
        System.out.println("nr eshte :"+nr);
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string");
        String inputString= scanner.nextLine();
        int length=inputString.length();
        System.out.println("Length of the string is :"+length);
        String uppercaseString=inputString.toUpperCase();
        System.out.println("Uppercase string is :"+uppercaseString);
        String lowercaseString=inputString.toLowerCase();
        System.out.println("Lowercase string is :"+lowercaseString);

        System.out.println("Enter the number");
        double number= scanner.nextDouble();
        double squareRoot=Math.sqrt(number);
        System.out.println("Square root:"+squareRoot);
        double absoluteValue=Math.abs(number);
        System.out.println("Absolute Value:"+absoluteValue);
        String [] array = {inputString,String.valueOf(length),uppercaseString,lowercaseString,String.valueOf(number),
        String.valueOf(squareRoot),String.valueOf(absoluteValue)};

        System.out.println("Array Content");
        for(String element:array){
            System.out.print(element+" ");
        }


    }
}
