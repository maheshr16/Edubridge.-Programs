class employeee {
    void calculatesalary(){
        System.out.println("Calculating empoyee salary");
    }
}
class developer extends employeee{
    @Override
    void calculatesalary() {
        System.out.println("Calculating developer salary");
    }
}

class manager1 extends employeee{
    @Override
    void calculatesalary(){
        System.out.println("Calculating manager salary");
    }
    public static void main(String[] args){
        developer d = new developer();
        manager1 m = new manager1();
        d.calculatesalary();
        m.calculatesalary();
    }
}


