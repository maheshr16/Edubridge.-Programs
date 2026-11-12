public class personEmpoyee {
    String name;

    personEmpoyee(String name){
        this.name = name;
    }
    void displayperson(){
        System.out.println("Name :" +name);
    }
}
class employee extends personEmpoyee{

    int empid;
    employee(String name, int empid){
        super(name);
        this.empid = empid;
    }

    void displayemploe(){
        System.out.println("Employee id :" +empid);
    }

}
class manager extends employee {
    String deperment;
    manager(String name, int empid,String deperment){
        super(name,empid);
        this.deperment = deperment;
    }
    void displaymanager(){
        System.out.println("deperment :" +deperment);
    }
    public static void main(String[] args){
        manager m = new manager("Mahesh", 101, "Cyber security");
        m.displayperson();
        m.displayemploe();
        m.displaymanager();
    }
}
