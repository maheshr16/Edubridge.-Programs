public class vehical {
    vehical(){
        System.out.println("vechile constructor");
    }
}
class car extends vehical{
    car(){
        super();
        System.out.println("car constructor");
    }
    public static void main(String[] args){
        car c = new car();
    }
}
