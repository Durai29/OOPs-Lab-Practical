package Exp4;

class Time{
    int hour;
    int minute;
    int second;
    
    public Time(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    public Time(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void display(){
        System.out.println(this.hour+":"+this.minute+":"+this.second);
    }
    public void add(Time time1,Time time2){
        this.hour = time1.hour + time2.hour;
        this.minute = time1.minute + time2.minute;
        this.second = time1.second + time2.second;

        if(this.second>=60){
            this.second = this.second-60;
            this.minute+=1;
        }
        if(this.minute>=60){
            this.minute = this.minute-60;
            this.hour+=1;
        }
        if(this.hour>=24){
            this.hour = this.hour-24;
        }
    }
}
public class _1One {
    public static void main(String arg[]){
        Time time1 = new Time(4,30,0);
        Time time2 = new Time(0,40,0);
        Time time3 = new Time();
        time3.add(time1,time2);
        time3.display();
    }   
}
