public class studentthis {
    String name;
    int age;

    studentthis(){
        this("Mahesh",22);
    }
    studentthis(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name :" +name);
        System.out.println("Age :" +age);
    }
    public static void main(String[] args){
        studentthis s1 = new studentthis();
        s1.display();
    }
}
