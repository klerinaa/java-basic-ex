import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Accommodation Booking system");

        AccommodationManager accommodationManager=new AccommodationManager(5);
        accommodationManager.addAccommodation(0,new Acommodation(1,"Single",50));
        accommodationManager.addAccommodation(1,new Acommodation(2,"Double",80));
        accommodationManager.addAccommodation(2,new Acommodation(3,"Suite",120));
        accommodationManager.addAccommodation(3,new Acommodation(4,"Single",40));
        accommodationManager.addAccommodation(4,new Acommodation(5,"Double",90));

        while (true )
        {
            System.out.println("Menu");
            System.out.println("1.Book Accommodation");
            System.out.println("2.Check Availability");
            System.out.println("3.Exit");
            System.out.println("Please enter your choice");
            int choice= scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter the room Number you want to book");
                    int roomNumber= scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the client name");
                    String name=scanner.nextLine();
                    System.out.println("Enter client phone number");
                    String phone=scanner.nextLine();
                    accommodationManager.bookAccommodation(roomNumber,new Client(name,phone));
                    break;
                case 2:
                    System.out.println("Accommodation availability");
                    accommodationManager.checkAvailability();
                    break;
                case 3:
                    System.out.println("Thank you for chosing us");
                    break;
            }
        }
    }
}