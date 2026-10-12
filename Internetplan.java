public class Internetplan {
    String name;
    int data;
    double price;

    Internetplan(){
        this("Basic", 2 , 199);
    }

    Internetplan(String name , int data){
        this(name,data , 299);
    }

    Internetplan(String name , int data , double price){
        this.name = name;
        this.data = data;
        this.price = price;
    }

    void display(){
        System.out.println("Name:" +name);
        System.out.println("Data:" +data+ "GB/day");
        System.out.println("price : Rs." +price);
        System.out.println();
    }
    public static void main(String[] args){
        Internetplan p1 = new Internetplan();
        Internetplan p2 = new Internetplan("Standard",3);
        Internetplan p3 = new Internetplan("premium" ,5,499);

        p1.display();
        p2.display();
        p3.display();

    }


}
