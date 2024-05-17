import java.util.Scanner;

public class AirlineManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User[] users = {
                new User("manager", "manager123", "manager"),
                new User("user", "user123", "user"),
                new User("klerina", "klerina123", "user")
        };

        Flight[][] flights = null;
        while (true) {
            //login
            User loggedUser = loginUser(scanner, users);
            if (loggedUser == null) {
                System.out.println("Invalid login,Exiting the system");
                break;
            }

            boolean logout = false;
            while (!logout) {
                if (loggedUser.getRole().equals("manager")) {
                    flights = displayManagerMenu(scanner, flights);
                } else if (loggedUser.getRole().equals("user")) {
                    if (flights == null) {
                        System.out.println("Flights have not been initialized by the manager yet.");
                    } else {
                        logout = displayUserMenu(scanner, flights);
                    }
                }
                logout = true;
            }

        }
    }

    public static User loginUser(Scanner scanner, User[] users) {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        for (User user : users) {
            if (user.getUsername().equals(username) && user.checkPassword(password)) {
                System.out.println("Login successful! Welcome, " + user.getUsername());
                return user;
            }
        }
        return null;
    }

    private static Flight[][] initializeFlights(Scanner scanner) {
        System.out.print("Enter the number of airlines: ");
        int numAirlines = scanner.nextInt();

        System.out.print("Enter the number of flights per airline: ");
        int numFlightsPerAirline = scanner.nextInt();

        Flight[][] flights = new Flight[numAirlines][numFlightsPerAirline];
        System.out.println("Flights initialized successfully.");
        return flights;
    }

    private static void addFlight(Scanner scanner, Flight[][] flights) {
        System.out.print("Enter airline number (1 to " + flights.length + "): ");
        int airlineChoice = scanner.nextInt();

        System.out.print("Enter flight number: ");
        String flightNumber = scanner.next();

        System.out.print("Enter destination: ");
        String destination = scanner.next();

        System.out.print("Enter capacity: ");
        int capacity = scanner.nextInt();

        boolean flightAdded = false;
        for (int i = 0; i < flights[airlineChoice - 1].length; i++) {
            if (flights[airlineChoice - 1][i] == null) {
                flights[airlineChoice - 1][i] = new Flight(flightNumber, destination, capacity);
                System.out.println("Flight added successfully!");
                flightAdded = true;
                break;
            }
        }

        if (!flightAdded) {
            System.out.println("Error: Could not add flight. Airline is fully booked.");
        }
    }

    private static Flight[][] displayManagerMenu(Scanner scanner, Flight[][] flights) {
        while (true) {
            System.out.println("Manager Menu:");
            System.out.println("1. Initialize Flights");
            System.out.println("2. Add Flight");
            System.out.println("0. Logout");

            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Logging out...");
                return flights;  // Return the current flights array
            }

            switch (choice) {
                case 1:
                    flights = initializeFlights(scanner);
                    break;
                case 2:
                    if (flights == null) {
                        System.out.println("Flights have not been initialized. Please initialize flights first.");
                    } else {
                        addFlight(scanner, flights);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static boolean displayUserMenu(Scanner scanner, Flight[][] flights) {
        while (true) {
            System.out.println("User Menu:");
            System.out.println("1. Book Flight");
            System.out.println("0. Logout");

            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Logging out...");
                return true;  // Logout and return to the main login prompt
            }

            switch (choice) {
                case 1:
                    bookFlight(scanner, flights);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void bookFlight(Scanner scanner, Flight[][] flights) {
        System.out.println("Available Flights");
        for (int i = 0; i < flights.length; i++) {
            System.out.println((i + 1) + ". Airline " + (i + 1));
        }
        System.out.println("0. Exit");
        System.out.print("Select an airline (1 to " + flights.length + ") or 0 to exit: ");
        int airlineChoice = scanner.nextInt();

        if (airlineChoice == 0) {
            System.out.println("Goodbye!");
            return;
        }

        if (airlineChoice >= 1 && airlineChoice <= flights.length) {
            System.out.println("Available Flights for the selected airline:");
            for (int i = 0; i < flights[airlineChoice - 1].length; i++) {
                if (flights[airlineChoice - 1][i] != null) {
                    System.out.println((i + 1) + ". " + flights[airlineChoice - 1][i].getFlightNumber() +
                            " to " + flights[airlineChoice - 1][i].getDestination() +
                            " (Available Economy Seats: " + flights[airlineChoice - 1][i].getAvailableEconomySeats() +
                            ", Available Business Seats: " + flights[airlineChoice - 1][i].getAvailableBusinessSeats() + ")");
                }
            }
            System.out.print("Select a flight (1 to " + flights[airlineChoice - 1].length + "): ");
            int flightChoice = scanner.nextInt();

            if (flightChoice >= 1 && flightChoice <= flights[airlineChoice - 1].length) {
                Flight selectedFlight = flights[airlineChoice - 1][flightChoice - 1];
                if (selectedFlight != null) {
                    System.out.print("Enter the number of passengers: ");
                    int numPassengers = scanner.nextInt();

                    System.out.print("Select seat class (1. Economy, 2. Business): ");
                    int seatClassChoice = scanner.nextInt();
                    boolean isBusinessClass = false;
                    if (seatClassChoice == 2) {
                        isBusinessClass = true;
                    } else {
                        isBusinessClass = false;
                    }
                    if (selectedFlight.bookSeat(numPassengers, isBusinessClass)) {
                        System.out.println("Booking confirmed! Enjoy your flight to " + selectedFlight.getDestination() + ".");
                        int remainingEconomySeats = selectedFlight.getAvailableEconomySeats();
                        int remainingBusinessSeats = selectedFlight.getAvailableBusinessSeats();
                        System.out.println("Remaining Economy Class Seats: " + remainingEconomySeats);
                        System.out.println("Remaining Business Class Seats: " + remainingBusinessSeats);

                    } else {
                        System.out.println("Sorry, there are not enough seats in the selected class or the flight is fully booked.");
                    }


                } else {
                    System.out.println("Invalid flight choice");
                }
            } else {
                System.out.println("Invalid flight choice");
            }
        } else {
            System.out.println("Invalid airline choice");
        }
    }
}