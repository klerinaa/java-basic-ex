
    import java.util.Scanner;

    public class NumeriVogel {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numri;

            do {
                System.out.print("Jepni një numer të vogël sesa 100: ");

                numri = scanner.nextInt();

                if (numri >= 100) {
                    System.out.println("Numer i gabuar. Ju lutem jepni një numer më të vogël sesa 100.");
                }
            } while (numri >= 100);

            System.out.println("Numer i saktë");
            scanner.close();
        }
    }


