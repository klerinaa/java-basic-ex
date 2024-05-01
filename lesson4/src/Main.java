public class Main {
    public static void main(String[] args) {
        //menachimi i errorit nepermjet try catch
        //tryCatch();

        tryCatchFinally();



    }

    static void tryCatch(){
        //sintaksa e try catch
        try{
            //kodi qe ne duam te ekzekutohet
            //llog/jika qe duam te zbatohet
          int nr1=  8/0;
        }catch (Exception e ){
            e.printStackTrace();//1. qe ne te printojme errorin qe ne kemi
            System.out.println(e.getMessage());//1. qe ne te printojme errorin qe ne kemi
        }
    }

//finally ekzekutohet ne cfaredolloj rasti
    static  void tryCatchFinally(){
        try{
            int nr1=8/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            //ekzejutohet ne cdo rast

            System.out.println("U ekzekutua");
        }
    }
}

