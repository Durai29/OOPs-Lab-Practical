package Exp4;

class Distance{
    double inch;
    double feet;

    public Distance(){
        this.inch = 0;
        this.feet = 0;
    }
    public Distance(int inch,int feet){
        this.inch = inch;
        this.feet = feet;
    }
    public void display(){
        System.out.println("Inch: "+this.inch);
        System.out.println("Feet: "+this.feet);
    }
    public void add(Distance d1,Distance d2){
        this.feet = d1.feet + d2.feet;
        this.inch = d1.inch + d2.inch;
    }

}

public class _3Three {
    public  static void main(String arg[]){
        Distance dis1 = new Distance(5,4);
        Distance dis2 = new Distance(3,4);
        Distance dis3 = new Distance();
        dis3.add(dis1,dis2);
        dis3.display();
    }
}
