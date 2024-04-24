public class DeklarimiVariablave {
    public static void main(String[] args) {
        System.out.println("hi , my name is Klerina"); //printimi i nje text
        System.out.println('K');//printimi i nje karakteri
        System.out.println(4);//printimi i nje numri

        // sout + enter ==>komanda per te bere  System.out.println
        // System.out.print==>printimi i djaleve ne te njejtin rresht
        //ln--> rresht i ri


        //VARIABLAT
        //perdoren per te ruajtur te dhena ose vlera ose karakteristika te nje klase
        //text
        String myText = "Hello"; //vlera eshte ne "" , String --data type per variablen , myText -->Emri qe deshiron.
        //numra te plote
        int myNum = 23;//vlera eshte 2 , int --data type per variablen , myNum -->Emri qe deshiron.
        // nr me presje dhjetore
        double myDoubleNum = 2.4;//vlera eshte 2.4 , double --data type per variablen , myDoubleNum -->Emri qe deshiron.
        //karakteru
        char myChar = 'K';//vleren ne '',char--data type per variablen dhe myChar--emri qe deshiron
         //true ose false
        boolean myBoolean = true; // ose = false  -->menaxhimi i dy states , emrave qe i vendosim jane ne formen e nje pyeje


        //printimi i variablave
        System.out.println("Mosha ime eshte :"+myNum);

        //deklarimi i shume variablave
        int x=2,y=7,z=19;

        //dekalrimi i shume variablave dhe te tjera me te njejten vlere
        int x1,y1,z1;
        x1=y1=z1=34;
        System.out.println(y1);
    }
}