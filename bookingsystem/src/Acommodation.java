public class Acommodation {
    int roomNumber;
    String type;
    double price;
    boolean available;

    public Acommodation(int roomNumber,String type,double price){
        this.roomNumber=roomNumber;
        this.type=type;
        this.price=price;
        this.available=true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
