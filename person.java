public class person {

    String name = "parent class";
}
class studentp extends person{
    String name = "Child class";

    void display(){
        System.out.println(name);
        System.out.println(super.name);
    }
    public static void main(String[] args){
        studentp s1 = new studentp();
        s1.display();
    }
}
