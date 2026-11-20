class throwmain {
    public static void main(String[] args){
        try {
            int age = 15;
            if (age < 18) {
                throw new ArithmeticException("age must be 18 or above");
            }
            System.out.println("Eligible");
        }
        catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
    }
}
