class Flight {
    private String flightNumber;
    private String destination;
    private int capacity;
    private int bookedSeatsEconomy;
    private int bookedSeatsBusiness;

    public Flight(String flightNumber, String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.capacity = capacity;
        this.bookedSeatsEconomy = 0;
        this.bookedSeatsBusiness = 0;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public int getAvailableEconomySeats() {
        return capacity - bookedSeatsEconomy;
    }

    public int getAvailableBusinessSeats() {
        return capacity - bookedSeatsBusiness;
    }

    public boolean bookSeat(int numPassengers, boolean isBusinessClass) {
        if (isBusinessClass) {
            if (bookedSeatsBusiness + numPassengers <= capacity) {
                bookedSeatsBusiness += numPassengers;
                return true;
            }
        } else {
            if (bookedSeatsEconomy + numPassengers <= capacity) {
                bookedSeatsEconomy += numPassengers;
                return true;
            }
        }
        return false;
    }
}
