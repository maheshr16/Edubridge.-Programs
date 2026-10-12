public class Time {
    int seconds;

    Time(){
        seconds =60;
    }
    Time(int s){
        seconds = s;
    }
    void displaySeconds(){
        System.out.println("Time in seconds: "+ seconds);
    }

    void displayMinutes(){
        System.out.println("Time in minutes: "+(seconds/60.0));
    }
    void displayHours(){
        System.out.println("Time in hours: "+(seconds/3600.0));
    }
    public static void main(String[] args){
        Time t1 = new Time();
        Time t2 = new Time(7200);

        t1.displaySeconds();
        t2.displaySeconds();
        t2.displayMinutes();
        t2.displayHours();
    }

}
