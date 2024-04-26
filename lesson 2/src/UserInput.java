import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in); //ndertuar objektin e skanerit
        System.out.println("Ju lutem vendosni nje vlere per gjatesine");
        double gjatesia =scanner.nextDouble();
        System.out.println("Ju lutem vendosni nje vlere per gjersine");
        double gjeresia =scanner.nextDouble();
        Rectangle rectangle= new Rectangle();
        rectangle.setGjatesia(gjatesia);
        rectangle.setGjeresia(gjeresia);
        System.out.println("Gjatesia :"+ rectangle.getGjatesia());
        System.out.println("Gjeresia :"+ rectangle.getGjeresia());
        System.out.println("Siperfaqja :"+ rectangle.llogaritSiperfaqen());
        System.out.println("Perimetri :"+ rectangle.llogaritPerimetrin());


    }
}
