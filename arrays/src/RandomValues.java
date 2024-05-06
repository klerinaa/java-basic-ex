import java.util.Scanner;

public class RandomValues {
    public static void main(String[] args) {


        double[] array = new double[4];

        for(int i =0;i<array.length;i++){
            array[i]=Math.random()*100;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
}
