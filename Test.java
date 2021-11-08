package test11;

class Automobile{
    protected int num;
    protected double speed;
    public Automobile( int num, double speed){
        this.num = num;
        this.speed = speed;
    }
    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return num;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public double getSpeed(){
        return speed;
    }
    @Override
    public String toString(){
        return "Automobile[num="+num+",speed="+speed+"]";
    }
}

class Car extends Automobile{
    protected int SeatOfNum;
    public Car(int num,double speed,int SeatOfNum){
        super( num,speed);
        this.SeatOfNum = SeatOfNum;
    }
    public void setSeatOfNum(int SeatOfNum){
        this.SeatOfNum = SeatOfNum;
    }
    public int getSeatOfNum(){
        return SeatOfNum;
    }
    @Override
    public String toString(){
        return "Car[num="+num+",speed="+speed+",SeatOfNum="+SeatOfNum+"]";
    }
}

public class Test {
    public static void main(String[] args){
        Car car = new Car(50,68.50,5);
        System.out.println(car);
        Automobile automobile = new Automobile(87,32);
        System.out.println(automobile);
    }
}
