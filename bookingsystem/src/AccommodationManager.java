public class AccommodationManager {

    Acommodation[] acommodations;
    Client[]clients;

    public AccommodationManager(int size){
        acommodations=new Acommodation[size];
        clients= new Client[size];
    }
    public void addAccommodation(int index, Acommodation acommodation){
        acommodations[index]=acommodation;
    }

    public void bookAccommodation(int roomNumber,Client client){
        for(int i =0;i<acommodations.length;i++){
            if(acommodations[i].getRoomNumber()==roomNumber){
                if(acommodations[i].isAvailable()){
                    acommodations[i].setAvailable(false);
                    clients[roomNumber]=client; // Dhomat nisin nga 1
                    System.out.println("Accommodation booked successfully for :"+client.getName());
                }else{
                    System.out.println("Sorry, already booked!");
                }
            }
        }

    }

    public void checkAvailability(){
        for(int i =0;i<acommodations.length;i++) {
            System.out.println("Room " + acommodations[i].getRoomNumber()+"-Available: "+ acommodations[i].isAvailable());
        }
    }


}
