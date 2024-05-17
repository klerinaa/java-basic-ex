public class Main {
    public static void main(String[] args) {
        int[][] myNum = {{1, 10, 3,7}, {6, 4, 3}};
        int[][] myNum1 = {{1, 2, 3,7}, {6, 4, 3}};

       boolean var= janeTeBarabarta(myNum,myNum1);
       if(var){
           System.out.println("Trueee");
       }else{
           System.out.println("falseeeee");
       }
    }

    public static boolean janeTeBarabarta(int [][] array1,int [][] array2){

        //krahasojm rreshta
        if(array1.length!= array2.length){
            return false;
        }
        //krahasojm kolonat
        for(int i=0;i<array1.length;i++){
            if(array1[i].length!=array2[i].length){
                return false;
            }
        }
        for(int i =0;i<array1.length;i++){
            for (int j=0;j<array1[i].length;j++){
                if(array1[i][j]!=array2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}







