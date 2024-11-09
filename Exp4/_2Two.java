package Exp4;

class TollBooth{
    int carCount;
    double cashCollected;

    public TollBooth(){
        this.carCount = 0;
        this.cashCollected = 0;
    }
    public void payingCar(){
        this.carCount+= 1;
        this.cashCollected+= 50;
    }
    public void noPayingCar(){
        this.carCount+=1;
    }
    public void display(){
        System.out.println("Car Count: "+this.carCount);
        System.out.println("Cash Collected: "+this.cashCollected);
    }
}

public class _2Two {
    public static void main(String arg[]){
        TollBooth toll = new TollBooth();
        for(int i=0;i<5;i++){
            toll.payingCar();
            toll.noPayingCar();
        }
        toll.display();
    }
}
