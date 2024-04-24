public class Person {
    String name;
    String surname;
    int age;
    boolean isOver18;
    double footNr;

    public static void main(String[] args) {
        //krijimi i nje objekti
        Metodat metodat= new Metodat();
     double shuma=   metodat.gjejShumen(8,10);
        System.out.println(shuma);
    }
}
