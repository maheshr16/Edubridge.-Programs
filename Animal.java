class Animal {
    String name = "Animals";
    void eat(){
       // String name = "Animal";
        System.out.println("animal eats");
    }
}
class dog1 extends Animal{
    void barks(){
        System.out.println("Dog Braks");
    }
    public static void main(String[] args){
        dog1 d = new dog1();
        System.out.println(d.name);
        d.eat();
        d.barks();
    }
}
