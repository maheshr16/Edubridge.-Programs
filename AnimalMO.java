public class AnimalMO {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class dog2 extends AnimalMO{
    void sound(){
        System.out.println("Dog Braks");
    }
    public static void main(String[] args){
        dog2 d = new dog2();
        d.sound();
    }
}
