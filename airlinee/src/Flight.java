public class Flight {
    String flightNumber;
    String destination;
    int capacity;
    int bookedSeatsEconomy;
    int bookedSeatsBusiness;

    public Flight(String flightNumber, String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.capacity = capacity;
        this.bookedSeatsEconomy=0;
        this.bookedSeatsBusiness=0;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getAvailableEconomySeats(){
        return capacity-bookedSeatsEconomy;
    }
    public int getAvailableBusinessSeats(){
        return capacity-bookedSeatsBusiness;
    }

    public boolean bookSeat(int numPassengers,boolean isBusinessClass){
        //kapaciteti=100
        //klient (30 pass, false -->u rezervua
        //klient2 (80 pass, false
        if(isBusinessClass){
            if(bookedSeatsBusiness+numPassengers<=capacity){
                bookedSeatsBusiness+=numPassengers;
                return  true;
            }
        }else{
            //if(0+30<=100){
            // 0+=30;-->bookedSeatsEconomy=30 ;
            // return true}

            //if(30+80<=100){}->nuk kalohet dhe i return false klient 2
            if(bookedSeatsEconomy+numPassengers<=capacity){
                bookedSeatsEconomy+=numPassengers;
                return  true;
            }
        }

        return false;
    }
}
