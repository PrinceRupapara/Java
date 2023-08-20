class Time{
    int hour;
    int minute;
    int second;

    Time(){
        hour=0;
        minute=0;
        second=0;
    }
    
    Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public void getTime(Time t){
        this.second+=t.second;
        if(this.second>=60){
            this.minute++;
            this.second-=60;
        }
         this.minute+=this.minute;
        if(this.minute>=60){
            this.hour++;
            this.minute-=60;
        }
        this.hour+=t.hour;
    }

}
public class AdditionOfTime{
    public static void main(String[] args) {
        Time t1= new Time(1,20,59);
        Time t2= new Time(1,20,2);
        t1.getTime(t2);
        System.out.print("hour:"+t1.hour+"\nminute:"+t1.minute+"\nsecond:"+t1.second);
    }
}
