public class Libarary_Book {
    String title;
    String author;
    double price;

    static int bookcount = 0;

    Libarary_Book(String title , String author,double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookcount++;
    }
    static void displayBookCount(){
        System.out.println("Total Books:" +bookcount);
    }

    void display(){
        System.out.println("Title:" + title);
        System.out.println("Author:" +author);
        System.out.println("Price Rs." +price);
        System.out.println();
    }
    public static void main(String[] args){
        Libarary_Book b1 = new Libarary_Book("java programming","Mahesh",450);
        Libarary_Book b2 = new Libarary_Book("Python Programming","Ramesh",350);
        Libarary_Book b3 = new Libarary_Book("C programming","Suresh",200);

        b1.display();
        b2.display();
        b3.display();

        Libarary_Book.displayBookCount();
    }
}
