public class UshtrimKlase {
    //xarray
    //5 elemente , te cilet jane int dhe vlerate by default jane 00000
    //11,1,3,6,10
    public static void main(String[] args) {
        int[]values=new int[5];//00000==>1113610
        for(int i=1;i<5;i++){
            values[i]=i+values[i-1];
            //values[1]=1+0==>1
            //values[2]=2+1==>3
            //values[3]=3+3=>6
            //values[4]=4+6=>10
        }
        values[0]=values[1]+values[4];

        for(int i=0;i<values.length;i++){
            System.out.print(values[i]);
        }
    }
}
