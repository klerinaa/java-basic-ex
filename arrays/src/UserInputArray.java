import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("please enter a size");
        int size= scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Please ente array values");
        for(int i =0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
}
