public class MainRectange {
    public static void main(String[] args) {
        System.out.println("Vleredhenia direkt nga konsturktori //1.");
        Rectangle rectangle = new Rectangle(6,4);
        System.out.println("Gjatesia :"+ rectangle.getGjatesia());
        System.out.println("Gjeresia :"+ rectangle.getGjeresia());
        System.out.println("Siperfaqja :"+ rectangle.llogaritSiperfaqen());
        System.out.println("Perimetri :"+ rectangle.llogaritPerimetrin());
        System.out.println("Vleredhenia  nga setteri //2.");
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setGjatesia(3);
        rectangle2.setGjeresia(7);
        System.out.println("Gjatesia :"+ rectangle2.getGjatesia());
        System.out.println("Gjeresia :"+ rectangle2.getGjeresia());
        System.out.println("Siperfaqja :"+ rectangle2.llogaritSiperfaqen());
        System.out.println("Perimetri :"+ rectangle2.llogaritPerimetrin());
    }
}
