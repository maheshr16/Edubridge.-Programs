public class person1 {
    String name;

    person1(String name){
        this.name = name;
    }
}
class teacher extends person1{
    int rollno;


    teacher(String name , int rollno){
        super(name);
        this.rollno = rollno;
    }
    void display(){
        System.out.println("Name :" +name);
        System.out.println("Rollno :" +rollno);
    }
    public static void main(String[] args){
        teacher t = new teacher("Mahesh", 101);
        t.display();
    }
}
