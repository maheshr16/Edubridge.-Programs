public class studentol {

        String name;
        int age;

        studentol() {
            name = "Suresh";
            age = 40;
        }
        studentol(String n) {
            name = n;
            age = 0;
        }

        studentol(String n , int a){
            name = n;
            age = a;
        }
        void display(){
            System.out.println("Name:" +name);
            System.out.println("Age" +age);
        }
        public static void main(String [] args){
            studentol s0 = new studentol();
            studentol s1 = new studentol("Mahesh", 23);
            studentol s2 = new studentol("Ramesh", 35);
            s0.display();
            s1.display();
            s2.display();
        }
}
