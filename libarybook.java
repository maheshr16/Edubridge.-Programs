public class libarybook {
    String title;
    String author;
    double price;

    static int bookcount = 0;

    libarybook(String title,String author,double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookcount++;
    }
    void displaybook(){
    System.out.println("Title :" +title);
    System.out.println("Author :" +author);
    System.out.println("Price :" +price);
    System.out.println();
    }
    static void displabookcount(){
        System.out.println("Total book created :" +bookcount);
    }
    public static void main(String[] args){
        libarybook b1 = new libarybook("Java programing","james gosling",450.99);
        libarybook b2 = new libarybook("Python Basic", "Guido veb rossem",350.55);
        libarybook b3 = new libarybook("Data Structure","mark allen utils",500.00);

        b1.displaybook();
        b2.displaybook();
        b3.displaybook();
        libarybook.displabookcount();
    }
}

