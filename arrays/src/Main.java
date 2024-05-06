public class Main {
    public static void main(String[] args) {
        //deklarimin 1.
        // datatype[] arrayName;
        double[] myArray;

        //2.
        //datatype arrayName []
        double myarray2[];

        //krijimi
        // arrayName= new datatype[size]
        myArray = new double[10];
        //deklarimi dhe krijimi
        double[] myarray = new double[5];


        //length
        System.out.println("length i array" + myArray.length);

        //get
        System.out.println("Elementi i pare " + myArray[0]);
        System.out.println("Elementi i fundit " + myArray[9]);

        //initializimi
        double[] myArray1 = {1.9, 5.3, 7.4, 3.4, 3.6};
        myArray[0] = 10;
        myArray[1] = 4;

        //nepermjet for
        int [] myArrayFor=new int[5];
        for(int i=0;i<myArrayFor.length;i++){
            myArrayFor[i]=i;
        }
        for(int i=0;i<myArrayFor.length;i++){
            System.out.print(myArrayFor[i]);
        }
//for each
        for(int element:myArrayFor){
            System.out.print(element);
        }
    }
}