public class AnimalOR {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class dog4 extends AnimalMO{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
class cat extends AnimalMO{
    @Override
    void sound(){
        System.out.println("Cat meow");
    }
    public static void main(String[] args){
        dog4 d = new dog4();
        cat c = new cat();

        d.sound();
        c.sound();
    }
}
