interface Animal1 {
    void sound();
    default void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class dog1 implements Animal1{
    public void sound(){
        System.out.println("Dog barks");
    }
    public static void main(String[] args){
        Animal1 d = new dog1();
        d.sound();
        d.sleep();
    }
}
