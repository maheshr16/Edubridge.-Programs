public class employeeOR {
    void work(){
        System.out.println("Employee is working");
    }
}
class developer1 extends employeeOR{
    @Override
    void work(){
        System.out.println("Developer is coding");
    }
}
class tester extends employeeOR{
    @Override
    void work(){
        System.out.println("Tester test software");
    }
    public static void main(String[] args){
        employeeOR e1 = new employeeOR();
        employeeOR e2 = new developer1();
        employeeOR e3 = new tester();
        e1.work();
        e2.work();
        e3.work();
    }
}

