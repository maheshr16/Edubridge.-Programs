abstract class  animal {
    abstract void sound();
    void sleep(){
    System.out.println("Animal is sleeping");
    }
}
class dog extends animal{
    @Override
    void sound(){
        System.out.println("Dog braks");
    }
    public static void main(String[] args){
        animal a = new dog();
        a.sound();
        a.sleep();
    }
}
