
class finalmain{
    public static void main(String[] args){
        try {
            int result = 10 / 2;
            System.out.println("Result=" + result);
        }
        catch (ArithmeticException e){
            System.out.println("connat divide by zero");
       }
        finally {
            System.out.println("finally block executed");
        }

    }
}
