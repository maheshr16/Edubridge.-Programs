public class Book {
    String title;
    double price;

    Book(){
        title = "Java";
        price = 500;
    }
    Book(String title){
        this.title = title;
    }
    Book(String title, int price){
        this.title = title;
        this.price = price;
    }
    void display(){
        System.out.println("Title :" +title);
        System.out.println("Price :" +price);
    }
    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book("python");
        Book b3 = new Book("C++",299);
        b1.display();
        b2.display();
        b3.display();
    }
}
