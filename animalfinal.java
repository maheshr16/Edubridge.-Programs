public class animalfinal {
     void sound(){
        System.out.println("Animal makes a sound");

    }
    final void breathe(){
         System.out.println("Animal breathes");
    }
}
class dog3 extends animalfinal{
    @Override
     void sound(){
        super.sound();
        System.out.println("Dog braks");
    }
    public static void main(String[] args){
        dog3  d =  new dog3();
        d.sound();
        d.breathe();
    }
}
