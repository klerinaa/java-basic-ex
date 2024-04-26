public class Rectangle {
    public double gjatesia;
    public double gjeresia;


    public Rectangle(){

    }
    public  Rectangle(double gjatesia,double gjeresia){
        this.gjatesia=gjatesia;
        this.gjeresia=gjeresia;

    }
    public double getGjatesia(){
        return gjatesia;
    }
    public double getGjeresia(){
        return gjeresia;
    }
    public  void setGjatesia(double gjatesia){
        this.gjatesia=gjatesia;
    }

    public void setGjeresia(double gjeresia) {
        this.gjeresia = gjeresia;
    }
    public double llogaritSiperfaqen(){
        return gjatesia*gjeresia;
    }
    public double llogaritPerimetrin(){
        return  2*(gjatesia+gjeresia);
    }
}
