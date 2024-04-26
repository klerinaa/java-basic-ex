public class Main {
    public static void main(String[] args) {
        //krijimi i objektit me konstuktor pa parametra dhe vleredhja manualisht
      Employee employee = new Employee();
      employee.name="Klerina";
      employee.salary=100;
      employee.hireYear=2021;
        System.out.println("Employee Name: "+employee.name);
        System.out.println("Employee Salary: "+employee.salary);
        System.out.println("Employee Hire Year: "+employee.hireYear);
        System.out.println("Employee Years of service: "+employee.calculateTearsOfService(2024));

        //krijimin e nje objekti me konstruktor me paramerta dhe vleredhenien automatikisht ne momentin e krijimit
 Employee employee1= new Employee("test",200,2015);
        System.out.println("Employee Name: "+employee1.name);
        System.out.println("Employee Salary: "+employee1.salary);
        System.out.println("Employee Hire Year: "+employee1.hireYear);
        System.out.println("Employee Years of service: "+employee1.calculateTearsOfService(2024));


        System.out.println("------------------------------------------");
        System.out.println("Employee Name: "+employee1.getName());
        employee1.setName("Test Roi");
        System.out.println("Employee Name: "+employee1.getName());

        System.out.println("-------");
        Employee employee2=new Employee();
        employee2.gjejSHumen(10,6);
    }
}