public class animalSk {
    void sound(){
        System.out.println("animal makes a sound");
    }
}
class dog extends animalSk{
    void sound() {
        System.out.println("Dog braks");
    }
    void display(){
        sound();
        super.sound();
    }
    public static void main(String[] args){
        dog d1 = new dog();
        d1.display();
    }
}
