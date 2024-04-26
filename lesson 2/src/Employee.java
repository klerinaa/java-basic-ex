public class Employee {
    public String name;
    public double salary;
    public int hireYear;

    public Employee() {
        //konkstruktor pa parametra
        //sherben per krijimin e objektit te klases ku ndodhemi
        //default
    }

    public Employee(String name, double salary, int hireYear) {
        this.name = name; //name ne rreshtin 2 eshte i barabarte me emrin qe merr si parameter
        this.salary = salary;
        this.hireYear = hireYear;
        //sherben per krijimin e objektit te klases ku ndodhemi +vleredhenjen e varablave
    }
//Getter methods
    public String getName(){

        return name;
    }
   public double getSalary(){
        return salary;
   }
   public int getHireYear(){
        return hireYear;
   }
   //Setter methods
    public void setName(String newName){
        this.name=newName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    //metode vetem per klasen employee
    int calculateTearsOfService(int currentYear) {
        gjejSHumen(2,4);
        return currentYear - hireYear;
    }
    int gjejSHumen(int nr1 , int nr2){
        return nr1+nr2;
    }
}
