public class student_1 {
    String name;
    int age;

    void study() {
        System.out.println(name + " is studying");
    }
void display(){
        System.out.println("Name" +name);
        System.out.println("Age" +age);
    }
public static void main(String[] args) {
    student_1 s1 = new student_1();
    s1.name = "Mahesh";
    s1.age = 22;
    s1.display();
    s1.study();
    }

}
