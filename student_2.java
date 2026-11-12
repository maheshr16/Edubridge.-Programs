class student_2 {
    String name;
    int age;

    student_2(String n , int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println("Name:" +name);
        System.out.println("Age" +age);
    }
    public static void main(String [] args){
        student_2 s1 = new student_2("Mahesh", 23);
        student_2 s2 = new student_2("Ramesh", 35);
        s1.display();
        s2.display();
    }
}
