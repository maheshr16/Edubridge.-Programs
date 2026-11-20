class invalidAgeException extends Exception{
    invalidAgeException(String message){
        super(message);
    }
}

class unsingIE {
    static void checkAge(int age)
        throws invalidAgeException{
        if(age < 18){
            throw new invalidAgeException("Age must be 18 or above");
        }
        System.out.println("Eligible");
    }
    public static void main(String[] args){
        try{
            checkAge(16);
        }
        catch(invalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
