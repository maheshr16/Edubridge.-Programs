public class finallymain {

    public static void main(String[] args){
        int a = 20;
        int b = 0;
        try{
            int result = a/b;
            System.out.println("Result :" +result);
        }
        catch(ArithmeticException e){
            System.out.println("Error : Cannot divided by zero");
        }
        finally {
            System.out.println("Calculation completed");
        }
    }
}
